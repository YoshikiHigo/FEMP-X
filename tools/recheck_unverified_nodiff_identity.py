#!/usr/bin/env python3

from __future__ import annotations

import argparse
import csv
import json
import os
import re
import subprocess
import sys
import tempfile
import time
from collections import Counter
from concurrent.futures import ThreadPoolExecutor, as_completed
from dataclasses import dataclass
from pathlib import Path

sys.path.append(str(Path(__file__).resolve().parent))
import generate_clonepair_tests as gen
import generate_unverified_generic_difference_tests as gut


ROOT = Path(__file__).resolve().parents[1]
MAIN_SOURCE = ROOT / "src" / "main" / "java"
TEST_SOURCE = ROOT / "src" / "test" / "java"
DEFAULT_PACKAGE_NAME = "unverified"

STRING_LITERAL_PATTERN = re.compile(r'"((?:[^"\\]|\\.)*)"')


@dataclass(frozen=True)
class CaseSpec:
    label: str
    logical_args: tuple[str, ...]
    factory_lines: tuple[str, ...]


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
    case: CaseSpec
    method1: Probe
    method2: Probe


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--package-name", type=str, default=DEFAULT_PACKAGE_NAME)
    parser.add_argument("--start-id", type=int, default=None)
    parser.add_argument("--end-id", type=int, default=None)
    parser.add_argument("--ids", type=str, default=None)
    parser.add_argument("--exclude-csv-path", type=Path, default=None)
    parser.add_argument("--limit", type=int, default=None)
    parser.add_argument("--workers", type=int, default=8)
    parser.add_argument("--class-timeout-seconds", type=float, default=120.0)
    parser.add_argument("--invocation-timeout-millis", type=int, default=1000)
    parser.add_argument(
        "--csv-path",
        type=Path,
        default=None,
    )
    parser.add_argument(
        "--summary-path",
        type=Path,
        default=None,
    )
    args = parser.parse_args()
    if args.csv_path is None:
        args.csv_path = ROOT / "logs" / f"{args.package_name}_nodiff_identity_recheck.csv"
    if args.summary_path is None:
        args.summary_path = ROOT / "logs" / f"{args.package_name}_nodiff_identity_recheck_summary.json"
    return args


def support_template_path(package_name: str) -> Path:
    return TEST_SOURCE / package_name / "ClonePairGenericInvocationTestSupport.java"


def target_ids(args: argparse.Namespace) -> list[int]:
    if args.ids:
        ids = [int(value) for value in args.ids.split(",") if value.strip()]
    else:
        ids = [
            int(path.stem[len("ClonePair"):-len("NoDifferenceTest")])
            for path in (TEST_SOURCE / args.package_name).glob("ClonePair*NoDifferenceTest.java")
        ]
    if args.start_id is not None:
        ids = [class_id for class_id in ids if class_id >= args.start_id]
    if args.end_id is not None:
        ids = [class_id for class_id in ids if class_id <= args.end_id]
    if args.exclude_csv_path is not None and args.exclude_csv_path.exists():
        with args.exclude_csv_path.open("r", encoding="utf-8", newline="") as handle:
            completed = {
                int(row["class_id"])
                for row in csv.DictReader(handle)
                if str(row.get("class_id", "")).strip()
            }
        ids = [class_id for class_id in ids if class_id not in completed]
    ids = sorted(set(ids))
    if args.limit is not None:
        ids = ids[: args.limit]
    return ids


def java_string(value: str) -> str:
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


def raw_type_name(type_name: str) -> str:
    normalized = gen.normalized_type_name(type_name)
    if normalized.endswith("[]"):
        return normalized
    return normalized.split("<", 1)[0]


def is_primitive(type_name: str) -> bool:
    return gen.normalized_type_name(type_name) in {
        "byte",
        "short",
        "int",
        "long",
        "float",
        "double",
        "boolean",
        "char",
    }


def extract_string_literals(body: str) -> list[str]:
    values: list[str] = []
    seen: set[str] = set()
    for raw in STRING_LITERAL_PATTERN.findall(body):
        try:
            decoded = bytes(raw, "utf-8").decode("unicode_escape")
        except UnicodeDecodeError:
            decoded = raw
        if len(decoded) > 24:
            continue
        if decoded in seen:
            continue
        seen.add(decoded)
        values.append(decoded)
        if len(values) >= 4:
            break
    return values


def combined_method(methods: dict[str, gen.MethodInfo]) -> gen.MethodInfo:
    method1 = methods["method1"]
    method2 = methods["method2"]
    remapped_body = method2.body
    replacements: list[tuple[str, str]] = []
    for index, (left, right) in enumerate(zip(method1.params, method2.params)):
        if left.name == right.name:
            continue
        placeholder = f"__CASE_PARAM_{index}__"
        remapped_body = re.sub(rf"\b{re.escape(right.name)}\b", placeholder, remapped_body)
        replacements.append((placeholder, left.name))
    for placeholder, target_name in replacements:
        remapped_body = remapped_body.replace(placeholder, target_name)
    return gen.MethodInfo(
        declared_return_type=method1.declared_return_type,
        name="combined",
        params=method1.params,
        body=method1.body + "\n" + remapped_body,
    )


def default_args(method: gen.MethodInfo) -> list[str]:
    values: list[str] = []
    for param in method.params:
        pool = gen.pool_for_param(param, method.body)
        values.append(gen.default_value_for_param(param, method.body, pool))
    return values


def novel_values_for_param(param: gen.Param, body: str) -> list[str]:
    type_name = gen.normalized_type_name(param.effective_type)
    raw_type = raw_type_name(type_name)
    literals = extract_string_literals(body)
    extras: list[str] = []

    if type_name == "String":
        extras.extend(["new String(" + java_string("a") + ")", "new String(" + java_string("") + ")"])
        extras.extend("new String(" + java_string(value) + ")" for value in literals if value)
        extras.extend([java_string("\u00A0"), java_string("\u2007"), java_string("\u202F")])
    elif type_name == "CharSequence":
        extras.extend([
            "new String(" + java_string("a") + ")",
            "new StringBuilder(" + java_string("a") + ")",
            "new StringBuilder(" + java_string("") + ")",
        ])
        extras.extend("new StringBuilder(" + java_string(value) + ")" for value in literals if value)
    elif type_name == "StringBuilder":
        extras.extend([
            "new StringBuilder(" + java_string("a") + ")",
            "new StringBuilder(" + java_string("") + ")",
            "new StringBuilder(" + java_string("\u00A0") + ")",
        ])
    elif type_name == "StringBuffer":
        extras.extend([
            "new StringBuffer(" + java_string("a") + ")",
            "new StringBuffer(" + java_string("") + ")",
            "new StringBuffer(" + java_string("\u00A0") + ")",
        ])
    elif raw_type == "Object":
        extras.extend([
            "new String(" + java_string("a") + ")",
            "new StringBuilder(" + java_string("a") + ")",
        ])
    elif raw_type == "Comparable":
        extras.extend([
            "new String(" + java_string("a") + ")",
            "new String(" + java_string("A") + ")",
        ])
    elif type_name == "char":
        extras.extend(["'\\u000B'", "'\\u00A0'", "'\\u2007'", "'\\u202F'"])
    elif type_name == "char[]":
        extras.extend([
            "new char[]{'\\u000B'}",
            "new char[]{'\\u00A0'}",
            "new char[]{' ', '\\u00A0'}",
        ])
    elif type_name == "double":
        extras.extend(["-0.0", "Double.POSITIVE_INFINITY", "Double.NEGATIVE_INFINITY"])
    elif type_name == "float":
        extras.extend(["-0.0f", "Float.POSITIVE_INFINITY", "Float.NEGATIVE_INFINITY"])
    elif type_name == "Double":
        extras.extend([
            "Double.valueOf(-0.0)",
            "Double.valueOf(Double.POSITIVE_INFINITY)",
            "Double.valueOf(Double.NEGATIVE_INFINITY)",
        ])
    elif type_name == "Float":
        extras.extend([
            "Float.valueOf(-0.0f)",
            "Float.valueOf(Float.POSITIVE_INFINITY)",
            "Float.valueOf(Float.NEGATIVE_INFINITY)",
        ])
    elif raw_type == "List" or raw_type == "ArrayList" or raw_type == "Collection" or raw_type == "Iterable":
        extras.extend([
            "list(" + java_string("alias") + ")",
            "list(" + java_string("alias") + ", " + java_string("alias") + ")",
        ])
    elif raw_type == "Vector":
        extras.extend([
            "vectorOfStrings(" + java_string("alias") + ")",
            "vectorOfStrings(" + java_string("alias") + ", " + java_string("beta") + ")",
        ])
    elif raw_type == "Set":
        extras.extend([
            "linkedSet(" + java_string("alias") + ")",
            "linkedSet(" + java_string("alias") + ", " + java_string("beta") + ")",
        ])
    elif raw_type == "Map" or raw_type == "HashMap":
        extras.extend([
            "hashMap(" + java_string("k") + ", " + java_string("v") + ")",
            "hashMap(" + java_string("k") + ", " + java_string("v") + ", " + java_string("x") + ", " + java_string("y") + ")",
        ])
    elif raw_type == "Hashtable":
        extras.extend([
            "hashtable(" + java_string("k") + ", " + java_string("v") + ")",
        ])
    elif raw_type == "Properties":
        extras.extend([
            "props(" + java_string("k") + ", " + java_string("v") + ")",
        ])
    return gen.dedupe_preserve(extras)


def build_simple_case(label: str, args: list[str]) -> CaseSpec:
    return CaseSpec(
        label=label,
        logical_args=tuple(args),
        factory_lines=("return new Object[]{" + ", ".join(args) + "};",),
    )


def declaration_for_shared(type_name: str, var_name: str, shared: bool) -> list[str] | None:
    raw_type = raw_type_name(type_name)
    qualifier = gut.qualified_type_name(type_name)
    if raw_type == "String":
        if shared:
            return [f"{qualifier} {var_name} = new String(" + java_string("alias") + ");"]
        suffix = "1" if var_name.endswith("Left") else "2"
        return [f"{qualifier} {var_name} = new String(" + java_string("alias") + "); // {suffix}"]
    if raw_type == "CharSequence":
        return [f"{qualifier} {var_name} = new StringBuilder(" + java_string("alias") + ");"]
    if raw_type == "StringBuilder":
        return [f"{qualifier} {var_name} = new StringBuilder(" + java_string("alias") + ");"]
    if raw_type == "StringBuffer":
        return [f"{qualifier} {var_name} = new StringBuffer(" + java_string("alias") + ");"]
    if raw_type == "Object":
        return [f"{qualifier} {var_name} = new StringBuilder(" + java_string("alias") + ");"]
    if raw_type == "Comparable":
        return [f"{qualifier} {var_name} = new String(" + java_string("alias") + ");"]
    if raw_type == "byte[]":
        return [f"{qualifier} {var_name} = new byte[]{{1, 2, 3}};"]
    if raw_type == "short[]":
        return [f"{qualifier} {var_name} = new short[]{{1, 2, 3}};"]
    if raw_type == "int[]":
        return [f"{qualifier} {var_name} = new int[]{{1, 2, 3}};"]
    if raw_type == "long[]":
        return [f"{qualifier} {var_name} = new long[]{{1L, 2L, 3L}};"]
    if raw_type == "char[]":
        return [f"{qualifier} {var_name} = new char[]{{'a', 'b'}};"]
    if raw_type == "float[]":
        return [f"{qualifier} {var_name} = new float[]{{1.0f, 2.0f}};"]
    if raw_type == "double[]":
        return [f"{qualifier} {var_name} = new double[]{{1.0, 2.0}};"]
    if raw_type == "boolean[]":
        return [f"{qualifier} {var_name} = new boolean[]{{true, false}};"]
    if raw_type == "Object[]":
        return [f"{qualifier} {var_name} = new Object[]{{new String(" + java_string("alias") + ")}};".replace("}};", "};")]
    if raw_type in {"List", "ArrayList", "Collection", "Iterable"}:
        return [f"{qualifier} {var_name} = list(" + java_string("alias") + ");"]
    if raw_type == "Vector":
        return [f"{qualifier} {var_name} = vectorOfStrings(" + java_string("alias") + ");"]
    if raw_type == "Set":
        return [f"{qualifier} {var_name} = linkedSet(" + java_string("alias") + ");"]
    if raw_type in {"Map", "HashMap"}:
        return [f"{qualifier} {var_name} = hashMap(" + java_string("k") + ", " + java_string("v") + ");"]
    if raw_type == "Hashtable":
        return [f"{qualifier} {var_name} = hashtable(" + java_string("k") + ", " + java_string("v") + ");"]
    if raw_type == "Properties":
        return [f"{qualifier} {var_name} = props(" + java_string("k") + ", " + java_string("v") + ");"]
    if raw_type == "Date":
        return [f"{qualifier} {var_name} = date(123456L);"]
    if raw_type == "Calendar":
        return [f"{qualifier} {var_name} = calendar(123456L);"]
    if raw_type == "GregorianCalendar":
        return [
            f"{qualifier} {var_name} = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone(" + java_string("UTC") + "));",
            f"{var_name}.setTimeInMillis(123456L);",
        ]
    if raw_type == "Locale":
        return [f"{qualifier} {var_name} = locale(" + java_string("en") + ", " + java_string("US") + ", " + java_string("") + ");"]
    return None


def build_pair_identity_cases(method: gen.MethodInfo, defaults: list[str]) -> list[CaseSpec]:
    cases: list[CaseSpec] = []
    for left_index in range(len(method.params)):
        for right_index in range(left_index + 1, len(method.params)):
            left_param = method.params[left_index]
            right_param = method.params[right_index]
            if gen.normalized_type_name(left_param.declared_type) != gen.normalized_type_name(right_param.declared_type):
                continue
            if is_primitive(left_param.declared_type):
                continue

            shared_decl = declaration_for_shared(left_param.declared_type, "sharedValue", True)
            if shared_decl is not None:
                args = list(defaults)
                args[left_index] = "sharedValue"
                args[right_index] = "sharedValue"
                cases.append(
                    CaseSpec(
                        label=f"shared_{left_index}_{right_index}",
                        logical_args=tuple(args),
                        factory_lines=tuple(shared_decl + ["return new Object[]{" + ", ".join(args) + "};"]),
                    )
                )

            left_decl = declaration_for_shared(left_param.declared_type, "leftValue", False)
            right_decl = declaration_for_shared(right_param.declared_type, "rightValue", False)
            if left_decl is not None and right_decl is not None:
                args = list(defaults)
                args[left_index] = "leftValue"
                args[right_index] = "rightValue"
                cases.append(
                    CaseSpec(
                        label=f"distinct_equal_{left_index}_{right_index}",
                        logical_args=tuple(args),
                        factory_lines=tuple(left_decl + right_decl + ["return new Object[]{" + ", ".join(args) + "};"]),
                    )
                )
    return cases


def build_cases(methods: dict[str, gen.MethodInfo]) -> list[CaseSpec]:
    method = combined_method(methods)
    defaults = default_args(method)
    cases: list[CaseSpec] = [build_simple_case("baseline", defaults)]

    for index, param in enumerate(method.params):
        extras = novel_values_for_param(param, method.body)
        added = 0
        for value in extras:
            args = list(defaults)
            args[index] = value
            if (
                gen.respects_min_max(method.params, tuple(args))
                and gen.respects_loop_progress_constraints(method, tuple(args))
                and gen.respects_exit_guards(method, tuple(args))
            ):
                cases.append(build_simple_case(f"novel_{index}_{added}", args))
                added += 1
            if added >= 3:
                break

    for pair_case in build_pair_identity_cases(method, defaults):
        cases.append(pair_case)

    unique_cases: list[CaseSpec] = []
    seen_factories: set[tuple[str, ...]] = set()
    for case in cases:
        if case.factory_lines in seen_factories:
            continue
        seen_factories.add(case.factory_lines)
        unique_cases.append(case)
    return unique_cases


def alias_aware_support_source(package_name: str) -> str:
    template = support_template_path(package_name).read_text(encoding="utf-8")
    template = template.replace(
        "final class ClonePairGenericInvocationTestSupport {",
        "final class ClonePairAliasAwareInvocationTestSupport {",
        1,
    )
    template = template.replace(
        "private ClonePairGenericInvocationTestSupport() {",
        "private ClonePairAliasAwareInvocationTestSupport() {",
        1,
    )
    template = template.replace("Object[] actualInputs = cloneInputs(inputs);", "Object[] actualInputs = inputs;")
    template = template.replace(
        "String originalInputsSnapshot = snapshot(actualInputs);",
        "String originalInputsSnapshot = safeSnapshot(actualInputs);",
    )
    template = template.replace("snapshot(value)", "safeSnapshot(value)")
    template = template.replace(
        """return new InvocationOutcome(
                    "TIMEOUT",
                    null,
                    null,
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    snapshot(actualInputs)
                );""",
        """return new InvocationOutcome(
                    "TIMEOUT",
                    null,
                    null,
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    "<snapshot-skipped-after-timeout>"
                );""",
    )
    template = template.replace(
        """return new InvocationOutcome(
                    "TIMEOUT",
                    null,
                    null,
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    snapshot(actualInputs)
                );""",
        """return new InvocationOutcome(
                    "TIMEOUT",
                    null,
                    null,
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    "<snapshot-skipped-after-timeout>"
                );""",
    )
    template = template.replace(
        "\n}\n",
        """

    static String safeSnapshot(Object value) {
        try {
            return snapshot(value);
        } catch (Throwable throwable) {
            return "SNAPSHOT_EX(" + throwable.getClass().getName() + ")";
        }
    }
}
""",
        1,
    )
    return template


def build_oracle_source(
    package_name: str,
    class_id: int,
    methods: dict[str, gen.MethodInfo],
    cases: list[CaseSpec],
    invocation_timeout_millis: int,
) -> str:
    lines = [
        f"package {package_name};",
        "",
        "import java.util.Base64;",
        "",
        f"import static {package_name}.ClonePairAliasAwareInvocationTestSupport.*;",
        "",
        f"public class ClonePair{class_id}IdentityOracle {{",
        "",
        "    public static void main(String[] args) {",
        f"        ClonePair{class_id} subject = new ClonePair{class_id}();",
    ]
    for index, _case in enumerate(cases):
        lines.extend([
            f"        Object[] case{index}Method1 = buildCase{index}();",
            f"        Object[] case{index}Method2 = buildCase{index}();",
            "        emit(",
            f"            {index},",
            f"            captureWithTimeout({gut.invocation_expression('method1', methods['method1'])}, {invocation_timeout_millis}L, case{index}Method1),",
            f"            captureWithTimeout({gut.invocation_expression('method2', methods['method2'])}, {invocation_timeout_millis}L, case{index}Method2)",
            "        );",
        ])
    lines.extend([
        "    }",
        "",
    ])

    for index, case in enumerate(cases):
        lines.append(f"    static Object[] buildCase{index}() {{")
        for body_line in case.factory_lines:
            lines.append("        " + body_line)
        lines.append("    }")
        lines.append("")

    lines.extend([
        "    static void emit(int index, InvocationOutcome method1, InvocationOutcome method2) {",
        '        System.out.println("CASE\\t" + index + "\\t" + format(method1) + "\\t" + format(method2));',
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


def decode_field(value: str) -> str | None:
    if value == "-":
        return None
    return subprocess.run(
        [sys.executable, "-c", "import base64,sys;print(base64.b64decode(sys.argv[1]).decode('utf-8'), end='')", value],
        capture_output=True,
        text=True,
        check=True,
    ).stdout


def decode_base64_field(value: str) -> str | None:
    if value == "-":
        return None
    return json.loads(json.dumps(value)) and __import__("base64").b64decode(value.encode("ascii")).decode("utf-8")


def parse_probe(parts: list[str], offset: int) -> Probe:
    return Probe(
        status=parts[offset],
        value_snapshot=decode_base64_field(parts[offset + 1]),
        exception_class=decode_base64_field(parts[offset + 2]),
        stdout=decode_base64_field(parts[offset + 3]) or "",
        stderr=decode_base64_field(parts[offset + 4]) or "",
        original_inputs_snapshot=decode_base64_field(parts[offset + 5]) or "",
        input_after_snapshot=decode_base64_field(parts[offset + 6]) or "",
    )


def run_oracle(
    package_name: str,
    class_id: int,
    methods: dict[str, gen.MethodInfo],
    cases: list[CaseSpec],
    class_timeout_seconds: float,
    invocation_timeout_millis: int,
) -> list[CaseOutcome]:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-identity-") as temp_dir:
        temp_path = Path(temp_dir)
        package_dir = temp_path / package_name
        package_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = package_dir / f"ClonePair{class_id}IdentityOracle.java"
        support_path = package_dir / "ClonePairAliasAwareInvocationTestSupport.java"
        oracle_path.write_text(
            build_oracle_source(package_name, class_id, methods, cases, invocation_timeout_millis),
            encoding="utf-8",
        )
        support_path.write_text(alias_aware_support_source(package_name), encoding="utf-8")

        compile_result = subprocess.run(
            [
                "javac",
                "-encoding",
                "UTF-8",
                "-d",
                temp_dir,
                "-sourcepath",
                str(MAIN_SOURCE) + os.pathsep + temp_dir,
                str(oracle_path),
                str(support_path),
            ],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=class_timeout_seconds,
        )
        if compile_result.returncode != 0:
            raise RuntimeError(compile_result.stderr.splitlines()[0] if compile_result.stderr else "oracle compilation failed")

        run_result = subprocess.run(
            ["java", "-ea", "-cp", temp_dir, f"{package_name}.ClonePair{class_id}IdentityOracle"],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=class_timeout_seconds,
        )
        if run_result.returncode != 0:
            raise RuntimeError(run_result.stderr.splitlines()[0] if run_result.stderr else "oracle execution failed")

    outcomes: list[CaseOutcome] = []
    for raw_line in run_result.stdout.splitlines():
        if not raw_line.startswith("CASE\t"):
            continue
        parts = raw_line.split("\t")
        if len(parts) != 16:
            raise RuntimeError(f"unexpected oracle output: {raw_line}")
        case = cases[int(parts[1])]
        outcomes.append(
            CaseOutcome(
                case=case,
                method1=parse_probe(parts, 2),
                method2=parse_probe(parts, 9),
            )
        )
    if len(outcomes) != len(cases):
        raise RuntimeError(f"expected {len(cases)} outcomes, got {len(outcomes)}")
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


def process_class(package_name: str, class_id: int, class_timeout_seconds: float, invocation_timeout_millis: int) -> dict[str, str | int]:
    methods = gen.parse_class(package_name, class_id)
    gut.normalize_signature(methods)
    cases = build_cases(methods)
    outcomes = run_oracle(package_name, class_id, methods, cases, class_timeout_seconds, invocation_timeout_millis)
    diff = next((outcome for outcome in outcomes if difference_kind(outcome) is not None), None)
    if diff is None:
        return {
            "class_id": class_id,
            "status": "no_difference",
            "difference_kind": "",
            "case_count": len(cases),
            "case_label": "",
            "logical_args": "[]",
            "method1_status": "",
            "method2_status": "",
            "method1_exception_class": "",
            "method2_exception_class": "",
            "error": "",
        }
    diff_kind = difference_kind(diff) or ""
    return {
        "class_id": class_id,
        "status": "difference_found",
        "difference_kind": diff_kind,
        "case_count": len(cases),
        "case_label": diff.case.label,
        "logical_args": json.dumps(diff.case.logical_args, ensure_ascii=False),
        "method1_status": diff.method1.status,
        "method2_status": diff.method2.status,
        "method1_exception_class": diff.method1.exception_class or "",
        "method2_exception_class": diff.method2.exception_class or "",
        "error": "",
    }


def main() -> int:
    args = parse_args()
    ids = target_ids(args)
    if not ids:
        print("No target classes.")
        return 0

    args.csv_path.parent.mkdir(parents=True, exist_ok=True)
    status_counter: Counter[str] = Counter()
    difference_counter: Counter[str] = Counter()
    difference_examples: list[dict[str, object]] = []
    errors: list[dict[str, object]] = []
    started = time.perf_counter()

    with args.csv_path.open("w", encoding="utf-8", newline="") as log_file:
        writer = csv.DictWriter(
            log_file,
            fieldnames=[
                "class_id",
                "status",
                "difference_kind",
                "case_count",
                "case_label",
                "logical_args",
                "method1_status",
                "method2_status",
                "method1_exception_class",
                "method2_exception_class",
                "error",
            ],
        )
        writer.writeheader()

        with ThreadPoolExecutor(max_workers=args.workers) as executor:
            futures = {
                executor.submit(
                    process_class,
                    args.package_name,
                    class_id,
                    args.class_timeout_seconds,
                    args.invocation_timeout_millis,
                ): class_id
                for class_id in ids
            }
            for index, future in enumerate(as_completed(futures), 1):
                class_id = futures[future]
                try:
                    row = future.result()
                except Exception as exc:  # noqa: BLE001
                    row = {
                        "class_id": class_id,
                        "status": "error",
                        "difference_kind": "",
                        "case_count": 0,
                        "case_label": "",
                        "logical_args": "[]",
                        "method1_status": "",
                        "method2_status": "",
                        "method1_exception_class": "",
                        "method2_exception_class": "",
                        "error": f"{type(exc).__name__}: {str(exc).splitlines()[0]}",
                    }
                writer.writerow(row)
                log_file.flush()
                status_counter[str(row["status"])] += 1
                if row["difference_kind"]:
                    difference_counter[str(row["difference_kind"])] += 1
                if row["status"] == "difference_found" and len(difference_examples) < 20:
                    difference_examples.append(
                        {
                            "class_id": int(row["class_id"]),
                            "difference_kind": row["difference_kind"],
                            "case_label": row["case_label"],
                            "logical_args": json.loads(str(row["logical_args"])),
                            "method1_status": row["method1_status"],
                            "method2_status": row["method2_status"],
                            "method1_exception_class": row["method1_exception_class"],
                            "method2_exception_class": row["method2_exception_class"],
                        }
                    )
                if row["status"] == "error" and len(errors) < 20:
                    errors.append({"class_id": int(row["class_id"]), "error": row["error"]})
                if index % 100 == 0 or index == len(ids):
                    print(
                        json.dumps(
                            {
                                "completed": index,
                                "total": len(ids),
                                "elapsed_seconds": round(time.perf_counter() - started, 1),
                                "status_counts": dict(status_counter),
                                "difference_counts": dict(difference_counter),
                            },
                            ensure_ascii=False,
                        ),
                        flush=True,
                    )

    summary = {
        "checked_on": time.strftime("%Y-%m-%d"),
        "total_targets": len(ids),
        "workers": args.workers,
        "class_timeout_seconds": args.class_timeout_seconds,
        "invocation_timeout_millis": args.invocation_timeout_millis,
        "elapsed_seconds": round(time.perf_counter() - started, 3),
        "status_counts": dict(status_counter),
        "difference_counts": dict(difference_counter),
        "difference_examples": difference_examples,
        "errors": errors,
    }
    args.summary_path.write_text(json.dumps(summary, ensure_ascii=False, indent=2), encoding="utf-8")
    print("FINAL_SUMMARY")
    print(json.dumps(summary, ensure_ascii=True), flush=True)
    return 0 if status_counter["error"] == 0 else 1


if __name__ == "__main__":
    raise SystemExit(main())
