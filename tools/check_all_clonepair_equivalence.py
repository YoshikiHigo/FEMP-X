#!/usr/bin/env python3

from __future__ import annotations

import argparse
import csv
import json
import subprocess
import sys
import tempfile
import time
from dataclasses import dataclass
from pathlib import Path

import generate_clonepair_tests as gen


ROOT = Path(__file__).resolve().parents[1]


@dataclass(frozen=True)
class Counterexample:
    args: tuple[str, ...]
    method1_status: str
    method1_payload: str
    method2_status: str
    method2_payload: str
    candidate_index: int


@dataclass(frozen=True)
class ClassProcessingResult:
    status: str
    detail: str
    candidate_count: int


def java_string(value: str) -> str:
    escapes = {
        "\\": "\\\\",
        '"': '\\"',
        "\n": "\\n",
        "\t": "\\t",
        "\r": "\\r",
        "\f": "\\f",
        "\b": "\\b",
    }
    return '"' + "".join(escapes.get(char, char) for char in value) + '"'


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--start-id", type=int, default=1)
    parser.add_argument("--end-id", type=int, default=1000)
    parser.add_argument("--class-id", type=int, default=None)
    parser.add_argument("--package-name", type=str, default="all")
    parser.add_argument("--log-path", type=Path, default=ROOT / "logs" / "all_upto_1000_equivalence_timing.csv")
    parser.add_argument("--summary-path", type=Path, default=ROOT / "logs" / "all_upto_1000_equivalence_summary.txt")
    parser.add_argument("--write-tests", action="store_true")
    parser.add_argument("--resume", action="store_true")
    parser.add_argument("--class-timeout-seconds", type=float, default=300.0)
    return parser.parse_args()


def extended_string_pool(body: str, param_name: str) -> list[str]:
    prioritized = [
        "null",
        '""',
        java_string("010"),
        java_string("42.0"),
        java_string("42(sec)"),
        java_string("\t"),
        java_string("\r"),
        java_string("\f"),
        java_string("{\uFF11}"),
        java_string("\u201C "),
        java_string("0x10"),
        java_string("0"),
        java_string("1"),
        java_string("a"),
        java_string("A"),
    ]
    return gen.dedupe_preserve(prioritized + gen.default_string_pool(body, param_name))


def extended_char_array_pool() -> list[str]:
    return gen.dedupe_preserve([
        "null",
        "new char[]{'a', 'b'}",
        "new char[]{'B'}",
        "new char[]{'\\r'}",
        "new char[]{'\\f'}",
        "new char[]{}",
        "new char[]{'a'}",
        "new char[]{'a', 'B'}",
        "new char[]{'A', 'B', 'C'}",
    ])


def extended_pool_for_param(param: gen.Param, body: str) -> list[str]:
    type_name = gen.normalized_type_name(param.effective_type)
    raw_type_name = __import__("re").sub(r"<.*>", "", type_name).strip()
    if type_name == "String":
        return extended_string_pool(body, param.name)
    if type_name == "CharSequence":
        return extended_string_pool(body, param.name)
    if type_name == "char[]":
        return extended_char_array_pool()
    if type_name == "Integer[]":
        return gen.dedupe_preserve([
            "null",
            "new Integer[]{0, 0}",
            "new Integer[]{1, 1}",
            "new Integer[]{0, 1}",
            "new Integer[]{1, 0}",
            "new Integer[]{}",
            "new Integer[]{0}",
            "new Integer[]{1}",
        ])
    if type_name == "boolean[][]":
        return gen.dedupe_preserve([
            "null",
            "b2()",
            "b2(new boolean[]{})",
            "b2(new boolean[]{true})",
            "b2(new boolean[]{false})",
            "b2(new boolean[]{true, false}, new boolean[]{false, true})",
        ])
    if type_name == "Throwable":
        return gen.dedupe_preserve([
            "null",
            "new Throwable()",
            "new Throwable(" + java_string("root") + ")",
            "new Throwable(" + java_string("root") + ", new Throwable(" + java_string("leaf") + "))",
            "equalThrowable(" + java_string("root") + ", 7, equalThrowable(" + java_string("leaf") + ", 7, null))",
        ])
    if raw_type_name == "Comparator" and type_name != "Comparator":
        return ["null", "java.util.Comparator.naturalOrder()", "java.util.Comparator.reverseOrder()"]
    return gen.pool_for_param(param, body)


def build_candidate_args(method: gen.MethodInfo) -> list[tuple[str, ...]]:
    pools = [extended_pool_for_param(param, method.body) for param in method.params]
    if not pools:
        return [tuple()]

    cases: list[tuple[str, ...]] = []
    per_param_limit = 10 if len(method.params) <= 2 else 5
    pair_limit = 6
    limits = [min(len(pool), per_param_limit) for pool in pools]
    limited_pools = [pool[:limit] for pool, limit in zip(pools, limits)]
    defaults = [gen.default_value_for_param(param, method.body, pool) for param, pool in zip(method.params, pools)]

    cases.extend(seed_cases(method))
    cases.append(tuple(defaults))
    for index, pool in enumerate(limited_pools):
        for value in pool:
            args = list(defaults)
            args[index] = value
            cases.append(tuple(args))

    if len(method.params) <= 3:
        for combo in __import__("itertools").product(*limited_pools):
            cases.append(tuple(combo))
    else:
        pair_pools = [pool[: min(len(pool), pair_limit)] for pool in limited_pools]
        for left_index in range(len(pair_pools)):
            for right_index in range(left_index + 1, len(pair_pools)):
                for left_value in pair_pools[left_index]:
                    for right_value in pair_pools[right_index]:
                        args = list(defaults)
                        args[left_index] = left_value
                        args[right_index] = right_value
                        cases.append(tuple(args))

    unique_cases: list[tuple[str, ...]] = []
    seen: set[tuple[str, ...]] = set()
    for case in cases:
        if case not in seen:
            seen.add(case)
            unique_cases.append(case)
    return [
        case for case in unique_cases
        if gen.respects_min_max(method.params, case)
        and gen.respects_loop_progress_constraints(method, case)
        and gen.respects_exit_guards(method, case)
        and respects_additional_safety(method, case)
    ]


def seed_cases(method: gen.MethodInfo) -> list[tuple[str, ...]]:
    type_names = [gen.normalized_type_name(param.effective_type) for param in method.params]
    body = method.body
    cases: list[tuple[str, ...]] = []

    if type_names == ["String", "String", "String"] and "startsWith(" in body and "indexOf(" in body:
        cases.append((java_string("aaa"), java_string("aa"), java_string("a")))
    if type_names == ["Throwable"]:
        cases.append(("equalThrowable(" + java_string("root") + ", 7, equalThrowable(" + java_string("leaf") + ", 7, null))",))
    if type_names == ["Integer[]", "Integer[]", "int", "int"]:
        cases.append(("new Integer[]{1, 1}", "new Integer[]{0, 0}", "1", "1"))
    if type_names == ["byte[]", "int", "int"] and "length-- > 0" in body and "<< sw" in body:
        cases.append(("new byte[]{1, 0, 0, 0, 0}", "0", "5"))
    if type_names == ["double"] and "1.0e-10" in body and "StringBuilder" in body:
        cases.append(("-1.0e-11",))
    if type_names == ["String"] and "Long.decode" in body and ("Long.parseLong" in body or "Long.valueOf" in body or "new Long" in body):
        cases.append((java_string("010"),))
    if type_names == ["String"] and 'endsWith("(sec)")' in body:
        cases.append((java_string("42(sec)"),))
    if type_names == ["String"] and 'endsWith(".0")' in body:
        cases.append((java_string("42.0"),))
    if type_names == ["String"] and "\u201C" in body:
        cases.append((java_string("\u201C "),))
    if type_names == ["String", "Object[]"] and "format.indexOf('{'" in body:
        cases.append((java_string("{\uFF11}"), 'new Object[]{"zero", "one"}'))
    if type_names == ["char[]", "int", "int"] and "Character.isWhitespace" in body:
        cases.append(("new char[]{'\\r'}", "0", "1"))
        cases.append(("new char[]{'\\f'}", "0", "1"))
    if type_names == ["char[]", "int", "int", "char[]", "int", "int", "int"]:
        cases.append(("new char[]{'a', 'b'}", "0", "2", "new char[]{'B'}", "0", "1", "0"))
        cases.append(("new char[]{'a', 'b'}", "0", "2", "new char[]{'B'}", "0", "1", "1"))
    return cases


def respects_additional_safety(method: gen.MethodInfo, case: tuple[str, ...]) -> bool:
    name_to_index = {param.name.lower(): index for index, param in enumerate(method.params)}
    if "lower" in name_to_index and "upper" in name_to_index:
        lower_value = gen.numeric_literal_value(case[name_to_index["lower"]])
        upper_value = gen.numeric_literal_value(case[name_to_index["upper"]])
        if lower_value is not None and upper_value is not None and lower_value >= upper_value:
            return False
    return True


def oracle_helpers_source() -> str:
    return gen.oracle_helpers_source() + """
    static boolean[][] b2(boolean[]... rows) {
        return rows;
    }

    static Throwable equalThrowable(String message, int id, Throwable cause) {
        return new EqualThrowable(message, id, cause);
    }

    static final class EqualThrowable extends Throwable {
        final int id;

        EqualThrowable(String message, int id, Throwable cause) {
            super(message, cause);
            this.id = id;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof EqualThrowable that)) {
                return false;
            }
            return id == that.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }
"""


def build_oracle_source(class_id: int, candidate_args: list[tuple[str, ...]]) -> str:
    lines = [
        "package all;",
        "",
        "import java.io.ByteArrayOutputStream;",
        "import java.io.ObjectOutputStream;",
        "import java.util.Arrays;",
        "import java.util.Base64;",
        "import java.util.Objects;",
        "",
        f"public class ClonePair{class_id}EquivalenceOracle {{",
        "",
        "    @FunctionalInterface",
        "    interface Invocation {",
        "        Object call() throws Throwable;",
        "    }",
        "",
        "    static final class Outcome {",
        "        final String status;",
        "        final Object value;",
        "        final String exceptionClass;",
        "",
        "        private Outcome(String status, Object value, String exceptionClass) {",
        "            this.status = status;",
        "            this.value = value;",
        "            this.exceptionClass = exceptionClass;",
        "        }",
        "",
        "        static Outcome ok(Object value) {",
        '            return new Outcome("OK", value, "");',
        "        }",
        "",
        "        static Outcome ex(Throwable throwable) {",
        '            return new Outcome("EX", null, throwable.getClass().getName());',
        "        }",
        "",
        "        String payload() {",
        '            return "EX".equals(status) ? exceptionClass : serialize(value);',
        "        }",
        "    }",
        "",
        "    public static void main(String[] args) {",
    ]
    for index, arg_tuple in enumerate(candidate_args):
        arg_source = ", ".join(arg_tuple)
        lines.append(
            f"        if (check({index}, () -> new ClonePair{class_id}().method1({arg_source}), "
            f"() -> new ClonePair{class_id}().method2({arg_source}))) {{ return; }}"
        )
    lines.extend([
        "    }",
        "",
        "    static boolean check(int index, Invocation leftInvocation, Invocation rightInvocation) {",
        "        Outcome left = capture(leftInvocation);",
        "        Outcome right = capture(rightInvocation);",
        "        if (!sameOutcome(left, right)) {",
        '            System.out.println("__DIFF__\\t" + index + "\\t" + left.status + "\\t" + left.payload() + "\\t" + right.status + "\\t" + right.payload());',
        "            return true;",
        "        }",
        "        return false;",
        "    }",
        "",
        "    static Outcome capture(Invocation invocation) {",
        "        try {",
        "            return Outcome.ok(invocation.call());",
        "        } catch (Throwable throwable) {",
        "            return Outcome.ex(throwable);",
        "        }",
        "    }",
        "",
        "    static boolean sameOutcome(Outcome left, Outcome right) {",
        "        if (!left.status.equals(right.status)) {",
        "            return false;",
        "        }",
        '        if ("EX".equals(left.status)) {',
        "            return left.exceptionClass.equals(right.exceptionClass);",
        "        }",
        "        return sameValue(left.value, right.value);",
        "    }",
        "",
        "    static boolean sameValue(Object left, Object right) {",
        "        if (left == right) {",
        "            return true;",
        "        }",
        "        if (left == null || right == null) {",
        "            return false;",
        "        }",
        "        if (left instanceof byte[] leftArray && right instanceof byte[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof short[] leftArray && right instanceof short[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof int[] leftArray && right instanceof int[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof long[] leftArray && right instanceof long[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof char[] leftArray && right instanceof char[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof boolean[] leftArray && right instanceof boolean[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof float[] leftArray && right instanceof float[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof double[] leftArray && right instanceof double[] rightArray) {",
        "            return Arrays.equals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof Object[] leftArray && right instanceof Object[] rightArray) {",
        "            return Arrays.deepEquals(leftArray, rightArray);",
        "        }",
        "        if (left instanceof StringBuffer leftBuffer && right instanceof StringBuffer rightBuffer) {",
        "            return leftBuffer.toString().equals(rightBuffer.toString());",
        "        }",
        "        return Objects.equals(left, right);",
        "    }",
        "",
        "    static String serialize(Object value) {",
        "        try {",
        "            ByteArrayOutputStream output = new ByteArrayOutputStream();",
        "            ObjectOutputStream objectOutput = new ObjectOutputStream(output);",
        "            objectOutput.writeObject(value);",
        "            objectOutput.flush();",
        "            return Base64.getEncoder().encodeToString(output.toByteArray());",
        "        } catch (Exception exception) {",
        "            throw new RuntimeException(exception);",
        "        }",
        "    }",
        oracle_helpers_source(),
        "}",
    ])
    return "\n".join(lines)


def timeout_until(deadline: float, reserve_seconds: float = 0.0) -> float:
    remaining = deadline - time.perf_counter() - reserve_seconds
    if remaining <= 0:
        raise TimeoutError("class processing exceeded allotted time")
    return remaining


def run_oracle(class_id: int, candidate_args: list[tuple[str, ...]], deadline: float) -> Counterexample | None:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-equiv-") as temp_dir:
        temp_path = Path(temp_dir)
        source_dir = temp_path / "all"
        source_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = source_dir / f"ClonePair{class_id}EquivalenceOracle.java"
        oracle_path.write_text(build_oracle_source(class_id, candidate_args), encoding="utf-8")

        compile_timeout = min(240.0, timeout_until(deadline, reserve_seconds=1.0))
        compile_result = subprocess.run(
            ["javac", "-encoding", "UTF-8", "-d", temp_dir, "-sourcepath", str(ROOT / "src" / "main" / "java"), str(oracle_path)],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=compile_timeout,
        )
        if compile_result.returncode != 0:
            raise RuntimeError(
                f"oracle compilation failed for ClonePair{class_id}\n{compile_result.stdout}\n{compile_result.stderr}"
            )

        run_timeout = timeout_until(deadline)
        run_result = subprocess.run(
            ["java", "-ea", "-cp", temp_dir, f"all.ClonePair{class_id}EquivalenceOracle"],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=run_timeout,
        )
        if run_result.returncode != 0:
            raise RuntimeError(
                f"oracle execution failed for ClonePair{class_id}\n{run_result.stdout}\n{run_result.stderr}"
            )

    first_line = next((line.strip() for line in run_result.stdout.splitlines() if line.startswith("__DIFF__\t")), None)
    if not first_line:
        return None
    parts = first_line.split("\t")
    if len(parts) != 6:
        raise RuntimeError(f"unexpected oracle output for ClonePair{class_id}: {first_line}")
    return Counterexample(
        args=candidate_args[int(parts[1])],
        method1_status=parts[2],
        method1_payload=parts[3],
        method2_status=parts[4],
        method2_payload=parts[5],
        candidate_index=int(parts[1]),
    )


def generate_test_source(class_id: int, counterexample: Counterexample) -> str:
    arguments = ", ".join(counterexample.args)
    lines = [
        "package all;",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        "import static all.ClonePairDifferenceTestSupport.*;",
        "",
        f"class ClonePair{class_id}DifferenceTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
        "    @Test",
        "    void methodsDivergeOnGeneratedCounterexample() {",
        "        // Generated by Codex (gpt-5.4).",
    ]
    if counterexample.method1_status == "EX":
        lines.append(f'        assertThrowsByName("{counterexample.method1_payload}", () -> subject.method1({arguments}));')
    else:
        lines.append(f'        assertExpectedSerialized("{counterexample.method1_payload}", subject.method1({arguments}));')
    if counterexample.method2_status == "EX":
        lines.append(f'        assertThrowsByName("{counterexample.method2_payload}", () -> subject.method2({arguments}));')
    else:
        lines.append(f'        assertExpectedSerialized("{counterexample.method2_payload}", subject.method2({arguments}));')
    lines.extend([
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def combined_method(methods: dict[str, gen.MethodInfo]) -> gen.MethodInfo:
    method1 = methods["method1"]
    method2 = methods["method2"]
    remapped_body = method2.body
    replacements: list[tuple[str, str]] = []
    for index, (left, right) in enumerate(zip(method1.params, method2.params)):
        if left.name == right.name:
            continue
        placeholder = f"__CODEx_PARAM_{index}__"
        remapped_body = __import__("re").sub(rf"\b{__import__('re').escape(right.name)}\b", placeholder, remapped_body)
        replacements.append((placeholder, left.name))
    for placeholder, target_name in replacements:
        remapped_body = remapped_body.replace(placeholder, target_name)
    return gen.MethodInfo(
        declared_return_type=method1.declared_return_type,
        name="method1",
        params=method1.params,
        body=method1.body + "\n" + remapped_body,
    )


def signature_compatible(methods: dict[str, gen.MethodInfo]) -> bool:
    method1 = methods["method1"]
    method2 = methods["method2"]
    if method1.declared_return_type != method2.declared_return_type:
        return False
    if len(method1.params) != len(method2.params):
        return False
    return all(
        left.declared_type == right.declared_type and left.effective_type == right.effective_type
        for left, right in zip(method1.params, method2.params)
    )


def normalize_methods(methods: dict[str, gen.MethodInfo]) -> dict[str, gen.MethodInfo]:
    normalized: dict[str, gen.MethodInfo] = {}
    for method_name, method in methods.items():
        params: list[gen.Param] = []
        for param in method.params:
            declared_type = param.declared_type
            effective_type = param.effective_type
            param_name = param.name
            while param_name.endswith("[]"):
                param_name = param_name[:-2]
                declared_type += "[]"
                if not effective_type.endswith("[]"):
                    effective_type += "[]"
            aliases = gen.infer_aliases(method.body, effective_type, param_name)
            params.append(gen.Param(declared_type, param_name, effective_type, aliases))
        normalized[method_name] = gen.MethodInfo(method.declared_return_type, method.name, tuple(params), method.body)
    return normalized


def process_class(package_name: str, class_id: int, write_tests: bool, class_timeout_seconds: float) -> ClassProcessingResult:
    deadline = time.perf_counter() + class_timeout_seconds
    status = "unknown"
    detail = ""
    candidate_count = 0

    try:
        methods = normalize_methods(gen.parse_class(package_name, class_id))
        if not signature_compatible(methods):
            status = "signature_mismatch"
            detail = "method signatures differ"
        else:
            method = combined_method(methods)
            candidate_args = build_candidate_args(method)
            candidate_count = len(candidate_args)
            timeout_until(deadline)
            counterexample = run_oracle(class_id, candidate_args, deadline)
            if counterexample is None:
                status = "no_counterexample_found"
            else:
                detail = (
                    f"candidate_index={counterexample.candidate_index};"
                    f"method1={counterexample.method1_status};"
                    f"method2={counterexample.method2_status}"
                )
                test_path = ROOT / "src" / "test" / "java" / "all" / f"ClonePair{class_id}DifferenceTest.java"
                if test_path.exists():
                    status = "difference_existing_test"
                else:
                    if write_tests:
                        test_path.write_text(generate_test_source(class_id, counterexample), encoding="utf-8")
                        status = "difference_test_written"
                    else:
                        status = "difference_found"
    except TimeoutError as exception:
        status = "class_timeout"
        detail = str(exception).replace("\n", " ")[:400]
    except Exception as exception:  # noqa: BLE001
        status = "error"
        detail = str(exception).replace("\n", " ")[:400]

    return ClassProcessingResult(status=status, detail=detail, candidate_count=candidate_count)


def read_existing_log(log_path: Path) -> tuple[set[int], dict[str, int], int, int, int]:
    if not log_path.exists():
        return set(), {}, 0, 0, 0

    processed_ids: set[int] = set()
    statuses: dict[str, int] = {}
    total_classes = 0
    difference_count = 0
    error_count = 0

    with log_path.open(encoding="utf-8", newline="") as log_file:
        reader = csv.DictReader(log_file)
        for row in reader:
            class_id_text = (row.get("class_id") or "").strip()
            status = (row.get("status") or "").strip()
            if not class_id_text or not status:
                continue
            class_id = int(class_id_text)
            processed_ids.add(class_id)
            total_classes += 1
            statuses[status] = statuses.get(status, 0) + 1
            if status.startswith("difference_"):
                difference_count += 1
            if status == "error":
                error_count += 1

    return processed_ids, statuses, total_classes, difference_count, error_count


def run_class_subprocess(args: argparse.Namespace, class_id: int) -> tuple[ClassProcessingResult, int]:
    command = [
        sys.executable,
        str(Path(__file__).resolve()),
        "--class-id",
        str(class_id),
        "--package-name",
        args.package_name,
        "--class-timeout-seconds",
        str(args.class_timeout_seconds),
    ]
    if args.write_tests:
        command.append("--write-tests")

    started = time.perf_counter()
    try:
        completed = subprocess.run(
            command,
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=args.class_timeout_seconds + 5.0,
        )
    except subprocess.TimeoutExpired:
        elapsed_ms = int((time.perf_counter() - started) * 1000)
        return (
            ClassProcessingResult(
                status="class_timeout",
                detail=f"subprocess timeout after {args.class_timeout_seconds} seconds",
                candidate_count=0,
            ),
            elapsed_ms,
        )

    elapsed_ms = int((time.perf_counter() - started) * 1000)
    output_lines = [line for line in completed.stdout.splitlines() if line.strip()]
    if completed.returncode != 0:
        detail = (completed.stderr.strip() or completed.stdout.strip() or "child process failed").replace("\n", " ")[:400]
        return ClassProcessingResult(status="error", detail=detail, candidate_count=0), elapsed_ms
    if not output_lines:
        return ClassProcessingResult(status="error", detail="child process produced no output", candidate_count=0), elapsed_ms

    try:
        payload = json.loads(output_lines[-1])
    except json.JSONDecodeError:
        detail = output_lines[-1].replace("\n", " ")[:400]
        return ClassProcessingResult(status="error", detail=f"unexpected child output: {detail}", candidate_count=0), elapsed_ms

    return (
        ClassProcessingResult(
            status=str(payload.get("status", "error")),
            detail=str(payload.get("detail", "")),
            candidate_count=int(payload.get("candidate_count", 0)),
        ),
        elapsed_ms,
    )


def main() -> int:
    args = parse_args()
    if args.class_id is not None:
        started = time.perf_counter()
        result = process_class(args.package_name, args.class_id, args.write_tests, args.class_timeout_seconds)
        elapsed_ms = int((time.perf_counter() - started) * 1000)
        print(json.dumps({
            "class_id": args.class_id,
            "status": result.status,
            "elapsed_ms": elapsed_ms,
            "candidate_count": result.candidate_count,
            "detail": result.detail,
        }, ensure_ascii=False))
        return 0

    log_path = args.log_path
    summary_path = args.summary_path
    log_path.parent.mkdir(parents=True, exist_ok=True)

    processed_ids: set[int] = set()
    statuses: dict[str, int] = {}
    total_classes = 0
    difference_count = 0
    error_count = 0
    write_header = True
    log_mode = "w"

    if args.resume:
        processed_ids, statuses, total_classes, difference_count, error_count = read_existing_log(log_path)
        if log_path.exists():
            write_header = False
            log_mode = "a"

    with log_path.open(log_mode, encoding="utf-8", newline="") as log_file:
        writer = csv.writer(log_file)
        if write_header:
            writer.writerow(["class_id", "status", "elapsed_ms", "candidate_count", "detail"])

        for class_id in range(args.start_id, args.end_id + 1):
            source_path = ROOT / "src" / "main" / "java" / args.package_name / f"ClonePair{class_id}.java"
            if not source_path.exists():
                continue
            if class_id in processed_ids:
                continue
            total_classes += 1
            result, elapsed_ms = run_class_subprocess(args, class_id)
            status = result.status
            detail = result.detail
            candidate_count = result.candidate_count
            statuses[status] = statuses.get(status, 0) + 1
            if status.startswith("difference_"):
                difference_count += 1
            if status == "error":
                error_count += 1
            writer.writerow([class_id, status, elapsed_ms, candidate_count, detail])
            log_file.flush()
            print(f"ClonePair{class_id}: {status} ({elapsed_ms} ms)", flush=True)

    summary_lines = [
        f"range={args.start_id}-{args.end_id}",
        f"total_classes={total_classes}",
        f"difference_count={difference_count}",
        f"error_count={error_count}",
    ]
    for status, count in sorted(statuses.items()):
        summary_lines.append(f"{status}={count}")
    summary_path.write_text("\n".join(summary_lines) + "\n", encoding="utf-8")

    return 0 if error_count == 0 else 1


if __name__ == "__main__":
    raise SystemExit(main())
