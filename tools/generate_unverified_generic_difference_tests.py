#!/usr/bin/env python3

from __future__ import annotations

import argparse
import base64
import subprocess
import tempfile
from dataclasses import dataclass
from pathlib import Path
import sys

sys.path.append(str(Path(__file__).resolve().parent))
import generate_clonepair_tests as gen


ROOT = Path(__file__).resolve().parents[1]
MAIN_SOURCE = ROOT / "src" / "main" / "java"
TEST_SOURCE = ROOT / "src" / "test" / "java" / "unverified"
SUPPORT_SOURCE = TEST_SOURCE / "ClonePairGenericInvocationTestSupport.java"
PACKAGE_NAME = "unverified"


@dataclass(frozen=True)
class Probe:
    status: str
    value_snapshot: str | None
    exception_class: str | None
    stdout: str
    stderr: str
    original_inputs_snapshot: str
    input_after_snapshot: str


@dataclass(frozen=True)
class CaseOutcome:
    args: tuple[str, ...]
    method1: Probe
    method2: Probe


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--start-id", type=int, default=3001)
    parser.add_argument("--end-id", type=int, default=4000)
    parser.add_argument("--ids", type=str, default=None)
    parser.add_argument("--overwrite", action="store_true")
    parser.add_argument("--class-timeout-seconds", type=float, default=180.0)
    parser.add_argument("--invocation-timeout-millis", type=int, default=500)
    return parser.parse_args()


def source_path(class_id: int) -> Path:
    return MAIN_SOURCE / PACKAGE_NAME / f"ClonePair{class_id}.java"


def test_path(class_id: int, difference: bool) -> Path:
    suffix = "DifferenceFindingTest" if difference else "NoDifferenceTest"
    return TEST_SOURCE / f"ClonePair{class_id}{suffix}.java"


def existing_test_path(class_id: int) -> Path | None:
    for difference in (True, False):
        path = test_path(class_id, difference)
        if path.exists():
            return path
    return None


def target_ids(args: argparse.Namespace) -> list[int]:
    if args.ids:
        return [int(value) for value in args.ids.split(",") if value.strip()]
    return list(range(args.start_id, args.end_id + 1))


def java_string(value: str | None) -> str:
    if value is None:
        return "null"
    escapes = {
        "\\": "\\\\",
        '"': '\\"',
        "\n": "\\n",
        "\r": "\\r",
        "\t": "\\t",
        "\f": "\\f",
        "\b": "\\b",
    }
    return '"' + "".join(escapes.get(char, char) for char in value) + '"'


def normalize_signature(methods: dict[str, gen.MethodInfo]) -> tuple[str, tuple[str, ...]]:
    method1 = methods["method1"]
    method2 = methods["method2"]
    if method1.declared_return_type != method2.declared_return_type:
        raise ValueError("Return types differ")
    if len(method1.params) != len(method2.params):
        raise ValueError("Arity differs")
    signature: list[str] = []
    for left, right in zip(method1.params, method2.params):
        if left.declared_type != right.declared_type:
            raise ValueError("Parameter types differ")
        signature.append(left.declared_type)
    return method1.declared_return_type, tuple(signature)


def extra_pool_for_param(param: gen.Param, method: gen.MethodInfo) -> list[str]:
    type_name = gen.normalized_type_name(param.effective_type)
    declared_type = gen.normalized_type_name(param.declared_type)
    lower_name = param.name.lower()
    body = method.body
    extras: list[str] = []
    if declared_type == "Object" or type_name == "Object":
        extras.extend([
            "Integer.valueOf(7)",
            "Long.valueOf(3L)",
            "Double.valueOf(3.9)",
            "Double.valueOf(Double.NaN)",
            "atomicInt(5)",
            "Boolean.TRUE",
            "Boolean.FALSE",
            '"42"',
            '"42.0"',
            '" 42 "',
            'textObject("42")',
            'textObject("42.0")',
            'textObject(" 42 ")',
            'builder("42")',
            'builder("42.0")',
            "throwingToStringObject()",
        ])
    if type_name == "String":
        if any(token in lower_name for token in ("charset", "encoding")) or "UnsupportedEncodingException" in body:
            extras.extend(['"UTF-8"', '"UTF-16BE"', '"ISO-8859-1"', '"US-ASCII"', '"x-bad-charset"'])
        if any(token in body for token in ("parseFloat", "Float.valueOf", "parseDouble", "Double.valueOf", "parseShort", "Short.valueOf")):
            extras.extend(['" "', '"42.0"', '"1,5"', '"+2"', '"-0"', '"010"'])
    if type_name == "byte[]":
        extras.extend([
            "new byte[]{65, 0}",
            "new byte[]{0, 65}",
            "new byte[]{(byte) 0xC3, (byte) 0xA9}",
            "new byte[]{(byte) 0xE3, (byte) 0x81, (byte) 0x82}",
        ])
    if type_name == "int[]":
        extras.extend([
            "new int[]{65}",
            "new int[]{97}",
            "new int[]{65, 66}",
            "new int[]{97, 98}",
            "new int[]{65, 97}",
            "new int[]{97, 65}",
        ])
    if type_name == "short[]":
        extras.extend([
            "new short[]{65}",
            "new short[]{97}",
            "new short[]{65, 66}",
            "new short[]{97, 98}",
        ])
    if type_name == "double[]":
        extras.extend([
            "new double[]{Double.NaN}",
            "new double[]{1.0, Double.NaN}",
            "new double[]{65.0, 97.0}",
        ])
    if type_name == "float[]":
        extras.extend([
            "new float[]{Float.NaN}",
            "new float[]{1.0f, Float.NaN}",
        ])
    if type_name == "char[]":
        extras.extend([
            "new char[]{'A'}",
            "new char[]{'a'}",
            "new char[]{'A', 'a'}",
            "new char[]{'a', 'A'}",
        ])
    if type_name == "String[]":
        extras.extend([
            'new String[]{"A"}',
            'new String[]{"a"}',
            'new String[]{"A", "a"}',
            'new String[]{"UTF-8"}',
            'new String[]{"UTF-16BE"}',
        ])
    if type_name == "double":
        extras.extend(["Double.POSITIVE_INFINITY", "Double.NEGATIVE_INFINITY"])
    if type_name == "float":
        extras.extend(["Float.POSITIVE_INFINITY", "Float.NEGATIVE_INFINITY"])
    return gen.dedupe_preserve(extras)


def pool_for_param(param: gen.Param, method: gen.MethodInfo) -> list[str]:
    pool = list(gen.pool_for_param(param, method.body))
    pool.extend(extra_pool_for_param(param, method))
    return gen.dedupe_preserve(pool)


def default_value_for_param(param: gen.Param, method: gen.MethodInfo, pool: list[str]) -> str:
    if gen.normalized_type_name(param.effective_type) in {"Object", "String"}:
        for candidate in extra_pool_for_param(param, method):
            if candidate != "null":
                return candidate
    return gen.default_value_for_param(param, method.body, pool)


def build_candidate_args(method: gen.MethodInfo) -> list[tuple[str, ...]]:
    pools = [pool_for_param(param, method) for param in method.params]
    if not pools:
        return [tuple()]

    cases: list[tuple[str, ...]] = []
    limits = [min(len(pool), 6 if len(method.params) <= 2 else 4) for pool in pools]
    limited_pools = [pool[:limit] for pool, limit in zip(pools, limits)]
    defaults = [default_value_for_param(param, method, pool) for param, pool in zip(method.params, pools)]

    cases.append(tuple(defaults))
    for index, pool in enumerate(limited_pools):
        for value in pool:
            args = list(defaults)
            args[index] = value
            cases.append(tuple(args))

    if len(method.params) <= 3:
        import itertools
        for combo in itertools.product(*limited_pools):
            cases.append(tuple(combo))
    else:
        pair_pools = [pool[: min(len(pool), 3)] for pool in limited_pools]
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
    ]


def build_cases(methods: dict[str, gen.MethodInfo]) -> list[tuple[str, ...]]:
    cases = build_candidate_args(methods["method1"])
    cases.extend(build_candidate_args(methods["method2"]))
    return gen.dedupe_preserve(cases)


def cast_expression(type_name: str, index: int) -> str:
    normalized = gen.normalized_type_name(type_name)
    wrappers = {
        "byte": ("Byte", "byteValue"),
        "short": ("Short", "shortValue"),
        "int": ("Integer", "intValue"),
        "long": ("Long", "longValue"),
        "float": ("Float", "floatValue"),
        "double": ("Double", "doubleValue"),
        "boolean": ("Boolean", "booleanValue"),
        "char": ("Character", "charValue"),
    }
    if normalized in wrappers:
        wrapper, method = wrappers[normalized]
        return f"(({wrapper}) values[{index}]).{method}()"
    return f"({qualified_type_name(normalized)}) values[{index}]"


def qualified_type_name(type_name: str) -> str:
    normalized = gen.normalized_type_name(type_name)
    if normalized.endswith("[]"):
        return qualified_type_name(normalized[:-2]) + "[]"
    base = normalized.split("<", 1)[0]
    java_util = {
        "Date",
        "Calendar",
        "GregorianCalendar",
        "Locale",
        "TimeZone",
        "List",
        "ArrayList",
        "Collection",
        "Set",
        "Map",
        "HashMap",
        "Hashtable",
        "Properties",
        "Vector",
        "Comparator",
        "Random",
        "BitSet",
        "Enumeration",
        "Iterator",
    }
    if base in java_util:
        return "java.util." + base
    return base


def invocation_expression(method_name: str, method: gen.MethodInfo) -> str:
    args = ", ".join(cast_expression(param.declared_type, index) for index, param in enumerate(method.params))
    return f"values -> subject.{method_name}({args})"


def wrapped_args(case: tuple[str, ...]) -> str:
    return "new Object[]{" + ", ".join(case) + "}"


def encode_field(value: str | None) -> str:
    if value is None:
        return "-"
    return base64.b64encode(value.encode("utf-8")).decode("ascii")


def decode_field(value: str) -> str | None:
    if value == "-":
        return None
    return base64.b64decode(value.encode("ascii")).decode("utf-8")


def build_oracle_source(class_id: int, methods: dict[str, gen.MethodInfo], cases: list[tuple[str, ...]], timeout_millis: int) -> str:
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import java.util.Base64;",
        "import java.util.*;",
        "",
        f"import static {PACKAGE_NAME}.ClonePairGenericInvocationTestSupport.*;",
        "",
        f"public class ClonePair{class_id}GenericOracle {{",
        "",
        "    public static void main(String[] args) {",
        f"        ClonePair{class_id} subject = new ClonePair{class_id}();",
    ]
    for index, case in enumerate(cases):
        rendered_args = wrapped_args(case)
        lines.append(
            "        emit("
            f"{index}, "
            f"captureWithTimeout({invocation_expression('method1', methods['method1'])}, {timeout_millis}L, {rendered_args}), "
            f"captureWithTimeout({invocation_expression('method2', methods['method2'])}, {timeout_millis}L, {rendered_args})"
            ");"
        )
    lines.extend([
        "    }",
        "",
        "    static void emit(int index, InvocationOutcome method1, InvocationOutcome method2) {",
        '        System.out.println(index + "\\t" + format(method1) + "\\t" + format(method2));',
        "    }",
        "",
        "    static String format(InvocationOutcome outcome) {",
        '        return outcome.status + "\\t"',
        '            + encode(outcome.valueSnapshot) + "\\t"'
        '            + encode(outcome.exceptionClass) + "\\t"'
        '            + encode(outcome.stdout) + "\\t"'
        '            + encode(outcome.stderr) + "\\t"'
        '            + encode(outcome.originalInputsSnapshot) + "\\t"'
        '            + encode(outcome.inputAfterSnapshot);',
        "    }",
        "",
        "    static String encode(String value) {",
        '        return value == null ? "-" : Base64.getEncoder().encodeToString(value.getBytes(java.nio.charset.StandardCharsets.UTF_8));',
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def run_oracle(
    class_id: int,
    methods: dict[str, gen.MethodInfo],
    cases: list[tuple[str, ...]],
    timeout_seconds: float,
    invocation_timeout_millis: int,
) -> list[CaseOutcome]:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-generic-") as temp_dir:
        temp_path = Path(temp_dir)
        oracle_dir = temp_path / PACKAGE_NAME
        oracle_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = oracle_dir / f"ClonePair{class_id}GenericOracle.java"
        oracle_path.write_text(
            build_oracle_source(class_id, methods, cases, invocation_timeout_millis),
            encoding="utf-8",
        )

        compile_result = subprocess.run(
            [
                "javac",
                "-encoding",
                "UTF-8",
                "-d",
                temp_dir,
                "-sourcepath",
                str(MAIN_SOURCE) + ":" + str(ROOT / "src" / "test" / "java"),
                str(oracle_path),
                str(SUPPORT_SOURCE),
            ],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds,
        )
        if compile_result.returncode != 0:
            raise RuntimeError(compile_result.stderr)

        run_result = subprocess.run(
            ["java", "-cp", temp_dir, f"{PACKAGE_NAME}.ClonePair{class_id}GenericOracle"],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds,
        )
        if run_result.returncode != 0:
            raise RuntimeError(run_result.stderr)

    outcomes: list[CaseOutcome] = []
    for raw_line in run_result.stdout.splitlines():
        parts = raw_line.split("\t")
        case = cases[int(parts[0])]
        method1 = Probe(
            parts[1],
            decode_field(parts[2]),
            decode_field(parts[3]),
            decode_field(parts[4]) or "",
            decode_field(parts[5]) or "",
            decode_field(parts[6]) or "",
            decode_field(parts[7]) or "",
        )
        method2 = Probe(
            parts[8],
            decode_field(parts[9]),
            decode_field(parts[10]),
            decode_field(parts[11]) or "",
            decode_field(parts[12]) or "",
            decode_field(parts[13]) or "",
            decode_field(parts[14]) or "",
        )
        outcomes.append(CaseOutcome(case, method1, method2))
    if len(outcomes) != len(cases):
        raise RuntimeError(f"Expected {len(cases)} outcomes, got {len(outcomes)}")
    return outcomes


def difference_kind(outcome: CaseOutcome) -> str | None:
    method1 = outcome.method1
    method2 = outcome.method2
    if method1.status != method2.status:
        if "TIMEOUT" in {method1.status, method2.status}:
            return "timeout"
        if "EX" in {method1.status, method2.status}:
            return "exception"
        return "return"
    if method1.status == "OK" and method1.value_snapshot != method2.value_snapshot:
        return "return"
    if method1.status == "EX" and method1.exception_class != method2.exception_class:
        return "exception"
    if method1.input_after_snapshot != method2.input_after_snapshot:
        return "input"
    if method1.stdout != method2.stdout:
        return "stdout"
    if method1.stderr != method2.stderr:
        return "stderr"
    return None


def representative_key(probe: Probe) -> tuple[str, str | None, str | None]:
    return probe.status, probe.value_snapshot, probe.exception_class


def select_representative_cases(outcomes: list[CaseOutcome]) -> list[CaseOutcome]:
    ordered = sorted(
        outcomes,
        key=lambda outcome: (
            outcome.method1.status == "TIMEOUT" or outcome.method2.status == "TIMEOUT",
            outcome.method1.stdout != "" or outcome.method2.stdout != "",
            outcome.method1.stderr != "" or outcome.method2.stderr != "",
        ),
    )
    selected: list[CaseOutcome] = []
    seen: set[tuple[str, str | None, str | None]] = set()
    for outcome in ordered:
        if outcome.method1.status == "TIMEOUT" or outcome.method2.status == "TIMEOUT":
            continue
        key = representative_key(outcome.method1)
        if key in seen:
            continue
        seen.add(key)
        selected.append(outcome)
        if len(selected) >= 5:
            break
    if not selected:
        selected = outcomes[:1]
    return selected


def stream_assertions(label: str, left_expected: str, right_expected: str) -> list[str]:
    left_var = "method1Outcome"
    right_var = "method2Outcome"
    left_access = f"{left_var}.{label}"
    right_access = f"{right_var}.{label}"
    lines: list[str] = []
    if left_expected == right_expected:
        lines.append(f"        assertTextEquals(\"{label}\", {java_string(left_expected)}, {left_access});")
        lines.append(f"        assertTextEquals(\"{label}\", {java_string(right_expected)}, {right_access});")
        return lines
    lines.append(f"        assertNotEquals({left_access}, {right_access});")
    if label == "stderr":
        if left_expected:
            lines.append(f"        assertTrue(!{left_access}.isEmpty());")
        else:
            lines.append(f"        assertTextEquals(\"stderr\", {java_string(left_expected)}, {left_access});")
        if right_expected:
            lines.append(f"        assertTrue(!{right_access}.isEmpty());")
        else:
            lines.append(f"        assertTextEquals(\"stderr\", {java_string(right_expected)}, {right_access});")
    else:
        lines.append(f"        assertTextEquals(\"{label}\", {java_string(left_expected)}, {left_access});")
        lines.append(f"        assertTextEquals(\"{label}\", {java_string(right_expected)}, {right_access});")
    return lines


def generate_difference_test_source(class_id: int, methods: dict[str, gen.MethodInfo], outcome: CaseOutcome) -> str:
    rendered_args = wrapped_args(outcome.args)
    uses_timeout = outcome.method1.status == "TIMEOUT" or outcome.method2.status == "TIMEOUT"
    capture_method = "captureWithTimeout" if uses_timeout else "capture"
    capture_suffix = ", 200L" if uses_timeout else ""
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        f"import static {PACKAGE_NAME}.ClonePairGenericInvocationTestSupport.*;",
        "import static org.junit.jupiter.api.Assertions.assertNotEquals;",
        "import static org.junit.jupiter.api.Assertions.assertTrue;",
        "",
        f"class ClonePair{class_id}DifferenceFindingTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
        "    @Test",
        "    void methodsDisagreeOnGeneratedInput() {",
        f"        InvocationOutcome method1Outcome = {capture_method}({invocation_expression('method1', methods['method1'])}{capture_suffix}, {rendered_args});",
        f"        InvocationOutcome method2Outcome = {capture_method}({invocation_expression('method2', methods['method2'])}{capture_suffix}, {rendered_args});",
        "",
        "        assertCoreOutcome(",
        "            method1Outcome,",
        f"            {java_string(outcome.method1.status)},",
        f"            {java_string(outcome.method1.value_snapshot)},",
        f"            {java_string(outcome.method1.exception_class)},",
        f"            {java_string(outcome.method1.original_inputs_snapshot)},",
        f"            {java_string(outcome.method1.input_after_snapshot)}",
        "        );",
        "        assertCoreOutcome(",
        "            method2Outcome,",
        f"            {java_string(outcome.method2.status)},",
        f"            {java_string(outcome.method2.value_snapshot)},",
        f"            {java_string(outcome.method2.exception_class)},",
        f"            {java_string(outcome.method2.original_inputs_snapshot)},",
        f"            {java_string(outcome.method2.input_after_snapshot)}",
        "        );",
    ]
    lines.extend(stream_assertions("stdout", outcome.method1.stdout, outcome.method2.stdout))
    lines.extend(stream_assertions("stderr", outcome.method1.stderr, outcome.method2.stderr))
    lines.extend([
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def generate_no_difference_test_source(class_id: int, methods: dict[str, gen.MethodInfo], outcomes: list[CaseOutcome]) -> str:
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        f"import static {PACKAGE_NAME}.ClonePairGenericInvocationTestSupport.*;",
        "",
        f"class ClonePair{class_id}NoDifferenceTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
        "    // No separating input was found; these tests document representative equivalent paths.",
        "    @Test",
        "    void noDifferenceFoundForRepresentativeInputs() {",
    ]
    for outcome in outcomes:
        rendered_args = wrapped_args(outcome.args)
        lines.extend([
            "        assertEquivalent(",
            f"            capture({invocation_expression('method1', methods['method1'])}, {rendered_args}),",
            f"            capture({invocation_expression('method2', methods['method2'])}, {rendered_args})",
            "        );",
        ])
    lines.extend([
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def write_test(class_id: int, difference: bool, source: str) -> None:
    target = test_path(class_id, difference)
    opposite = test_path(class_id, not difference)
    target.write_text(source, encoding="utf-8")
    if opposite.exists():
        opposite.unlink()


def main() -> int:
    args = parse_args()
    for class_id in target_ids(args):
        src = source_path(class_id)
        if not src.exists():
            continue
        existing = existing_test_path(class_id)
        if existing is not None and not args.overwrite:
            print(f"ClonePair{class_id}: skipped-existing")
            continue
        methods = gen.parse_class(PACKAGE_NAME, class_id)
        normalize_signature(methods)
        cases = build_cases(methods)
        outcomes = run_oracle(
            class_id,
            methods,
            cases,
            timeout_seconds=args.class_timeout_seconds,
            invocation_timeout_millis=args.invocation_timeout_millis,
        )
        separating = next((outcome for outcome in outcomes if difference_kind(outcome) is not None), None)
        if separating is not None:
            write_test(class_id, True, generate_difference_test_source(class_id, methods, separating))
            print(f"ClonePair{class_id}: difference:{difference_kind(separating)}")
        else:
            write_test(class_id, False, generate_no_difference_test_source(class_id, methods, select_representative_cases(outcomes)))
            print(f"ClonePair{class_id}: no-difference")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
