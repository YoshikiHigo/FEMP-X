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
PACKAGE_NAME = "unverified"


@dataclass(frozen=True)
class CandidateCase:
    label: str
    left_source: str
    right_source: str


@dataclass(frozen=True)
class Probe:
    status: str
    value: bool | None
    exception_class: str | None
    stdout: str
    stderr: str
    left_after: bytes | None
    right_after: bytes | None


@dataclass(frozen=True)
class CaseOutcome:
    case: CandidateCase
    method1: Probe
    method2: Probe


SOURCE_VALUES: list[tuple[str, str]] = [
    ("null", "null"),
    ("empty", "new byte[]{}"),
    ("zero", "new byte[]{0}"),
    ("one", "new byte[]{1}"),
    ("two", "new byte[]{2}"),
    ("minusOne", "new byte[]{-1}"),
    ("oneZero", "new byte[]{1, 0}"),
    ("oneOne", "new byte[]{1, 1}"),
    ("oneTwo", "new byte[]{1, 2}"),
    ("oneThree", "new byte[]{1, 3}"),
    ("twoTwo", "new byte[]{2, 2}"),
    ("oneTwoThree", "new byte[]{1, 2, 3}"),
    ("oneTwoFour", "new byte[]{1, 2, 4}"),
]


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--start-id", type=int, default=201)
    parser.add_argument("--end-id", type=int, default=500)
    parser.add_argument("--class-timeout-seconds", type=float, default=180.0)
    parser.add_argument("--overwrite", action="store_true")
    return parser.parse_args()


def source_path(class_id: int) -> Path:
    return MAIN_SOURCE / PACKAGE_NAME / f"ClonePair{class_id}.java"


def difference_test_path(class_id: int) -> Path:
    return TEST_SOURCE / f"ClonePair{class_id}DifferenceFindingTest.java"


def no_difference_test_path(class_id: int) -> Path:
    return TEST_SOURCE / f"ClonePair{class_id}NoDifferenceTest.java"


def existing_test_path(class_id: int) -> Path | None:
    for path in (difference_test_path(class_id), no_difference_test_path(class_id)):
        if path.exists():
            return path
    return None


def supports_boolean_bytearray_signature(class_id: int) -> bool:
    methods = gen.parse_class(PACKAGE_NAME, class_id)
    method1 = methods["method1"]
    method2 = methods["method2"]
    return (
        method1.declared_return_type == "boolean"
        and method2.declared_return_type == "boolean"
        and len(method1.params) == 2
        and len(method2.params) == 2
        and all(param.declared_type == "byte[]" for param in method1.params)
        and all(param.declared_type == "byte[]" for param in method2.params)
    )


def build_candidate_cases() -> list[CandidateCase]:
    cases: list[CandidateCase] = []
    seen: set[tuple[str, str]] = set()

    def add(label: str, left_source: str, right_source: str) -> None:
        key = (left_source, right_source)
        if key in seen:
            return
        seen.add(key)
        cases.append(CandidateCase(label, left_source, right_source))

    preferred = [
        ("bothNull", "null", "null"),
        ("leftNullRightEmpty", "null", "new byte[]{}"),
        ("leftEmptyRightNull", "new byte[]{}", "null"),
        ("leftNullRightOne", "null", "new byte[]{1}"),
        ("leftOneRightNull", "new byte[]{1}", "null"),
        ("bothEmpty", "new byte[]{}", "new byte[]{}"),
        ("equalSingleZero", "new byte[]{0}", "new byte[]{0}"),
        ("equalSingleOne", "new byte[]{1}", "new byte[]{1}"),
        ("differentSingleValue", "new byte[]{1}", "new byte[]{2}"),
        ("leftEmptyRightOne", "new byte[]{}", "new byte[]{1}"),
        ("leftOneRightEmpty", "new byte[]{1}", "new byte[]{}"),
        ("equalTwoBytes", "new byte[]{1, 2}", "new byte[]{1, 2}"),
        ("differentSecondByteAfterEqualPrefix", "new byte[]{1, 2}", "new byte[]{1, 3}"),
        ("differentFirstByteSameLength", "new byte[]{1, 2}", "new byte[]{2, 2}"),
        ("leftShorterWithEqualPrefix", "new byte[]{1}", "new byte[]{1, 2}"),
        ("leftLongerWithEqualPrefix", "new byte[]{1, 2}", "new byte[]{1}"),
        ("equalThreeBytes", "new byte[]{1, 2, 3}", "new byte[]{1, 2, 3}"),
        ("differentLastByteThreeBytes", "new byte[]{1, 2, 3}", "new byte[]{1, 2, 4}"),
        ("equalNegativeByte", "new byte[]{-1}", "new byte[]{-1}"),
        ("differentNegativeAndPositive", "new byte[]{-1}", "new byte[]{1}"),
    ]
    for label, left_source, right_source in preferred:
        add(label, left_source, right_source)

    for left_name, left_source in SOURCE_VALUES:
        for right_name, right_source in SOURCE_VALUES:
            add(f"{left_name}__{right_name}", left_source, right_source)

    return cases


CANDIDATE_CASES = build_candidate_cases()


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


def decode_base64_or_null(value: str) -> bytes | None:
    if value == "NULL":
        return None
    return base64.b64decode(value.encode("ascii"))


def java_byte_array_literal(value: bytes | None) -> str:
    if value is None:
        return "null"
    if not value:
        return "new byte[]{}"
    elements = ", ".join(str(int.from_bytes(bytes([byte]), byteorder="big", signed=True)) for byte in value)
    return f"new byte[]{{{elements}}}"


def method_outcome_diff_kind(outcome: CaseOutcome) -> str | None:
    left = outcome.method1
    right = outcome.method2
    if left.status != right.status:
        return "exception" if "EX" in {left.status, right.status} else "return"
    if left.status == "EX":
        if left.exception_class != right.exception_class:
            return "exception"
    elif left.value != right.value:
        return "return"
    if left.stdout != right.stdout:
        return "stdout"
    if left.stderr != right.stderr:
        return "stderr"
    if left.left_after != right.left_after or left.right_after != right.right_after:
        return "mutation"
    return None


def representative_return_cases(outcomes: list[CaseOutcome]) -> list[CaseOutcome]:
    labels = [
        "bothNull",
        "bothEmpty",
        "equalSingleOne",
        "differentSingleValue",
        "leftOneRightEmpty",
        "leftShorterWithEqualPrefix",
        "equalThreeBytes",
        "differentLastByteThreeBytes",
    ]
    selected: list[CaseOutcome] = []
    seen_keys: set[tuple[bool, str]] = set()
    for label in labels:
        outcome = next((item for item in outcomes if item.case.label == label and item.method1.status == "OK"), None)
        if outcome is None:
            continue
        key = (bool(outcome.method1.value), label)
        if key in seen_keys:
            continue
        seen_keys.add(key)
        selected.append(outcome)
        if len(selected) >= 5:
            break
    if selected:
        return selected
    return [item for item in outcomes if item.method1.status == "OK"][:4]


def representative_exception_cases(outcomes: list[CaseOutcome]) -> list[CaseOutcome]:
    labels = [
        "leftNullRightEmpty",
        "leftEmptyRightNull",
        "leftNullRightOne",
        "leftOneRightNull",
        "bothNull",
    ]
    selected: list[CaseOutcome] = []
    seen_classes: set[str] = set()
    for label in labels:
        outcome = next((item for item in outcomes if item.case.label == label and item.method1.status == "EX"), None)
        if outcome is None:
            continue
        if outcome.method1.exception_class in seen_classes:
            continue
        seen_classes.add(str(outcome.method1.exception_class))
        selected.append(outcome)
        if len(selected) >= 3:
            break
    return selected


def representative_boundary_cases(outcomes: list[CaseOutcome], excluded: set[str]) -> list[CaseOutcome]:
    labels = [
        "bothNull",
        "leftNullRightEmpty",
        "leftEmptyRightNull",
        "equalTwoBytes",
        "differentSecondByteAfterEqualPrefix",
        "leftLongerWithEqualPrefix",
        "equalNegativeByte",
    ]
    selected: list[CaseOutcome] = []
    for label in labels:
        if label in excluded:
            continue
        outcome = next((item for item in outcomes if item.case.label == label and item.method1.status == "OK"), None)
        if outcome is None:
            continue
        selected.append(outcome)
        if len(selected) >= 3:
            break
    return selected


def build_oracle_source(class_id: int) -> str:
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import java.io.ByteArrayOutputStream;",
        "import java.io.PrintStream;",
        "import java.util.Base64;",
        "",
        f"public class ClonePair{class_id}ByteArrayOracle {{",
        "",
        "    @FunctionalInterface",
        "    interface Invocation {",
        "        boolean call(byte[] left, byte[] right) throws Throwable;",
        "    }",
        "",
        "    static final class Probe {",
        "        final String status;",
        "        final Boolean value;",
        "        final String exceptionClass;",
        "        final String stdout;",
        "        final String stderr;",
        "        final byte[] leftAfter;",
        "        final byte[] rightAfter;",
        "",
        "        Probe(String status, Boolean value, String exceptionClass, String stdout, String stderr, byte[] leftAfter, byte[] rightAfter) {",
        "            this.status = status;",
        "            this.value = value;",
        "            this.exceptionClass = exceptionClass;",
        "            this.stdout = stdout;",
        "            this.stderr = stderr;",
        "            this.leftAfter = leftAfter;",
        "            this.rightAfter = rightAfter;",
        "        }",
        "    }",
        "",
        "    public static void main(String[] args) {",
    ]
    for index, case in enumerate(CANDIDATE_CASES):
        lines.append(f"        emit({index}, {case.left_source}, {case.right_source});")
    lines.extend([
        "    }",
        "",
        "    static void emit(int index, byte[] leftSource, byte[] rightSource) {",
        f"        Probe method1 = capture((left, right) -> new ClonePair{class_id}().method1(left, right), leftSource, rightSource);",
        f"        Probe method2 = capture((left, right) -> new ClonePair{class_id}().method2(left, right), leftSource, rightSource);",
        "        System.out.println(",
        '            index + "\\t"',
        '                + format(method1) + "\\t"',
        '                + format(method2)',
        "        );",
        "    }",
        "",
        "    static Probe capture(Invocation invocation, byte[] leftSource, byte[] rightSource) {",
        "        byte[] left = cloneOrNull(leftSource);",
        "        byte[] right = cloneOrNull(rightSource);",
        "        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();",
        "        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();",
        "        PrintStream originalOut = System.out;",
        "        PrintStream originalErr = System.err;",
        "        PrintStream capturedOut = new PrintStream(stdoutBuffer, true);",
        "        PrintStream capturedErr = new PrintStream(stderrBuffer, true);",
        "        try {",
        "            System.setOut(capturedOut);",
        "            System.setErr(capturedErr);",
        "            boolean value = invocation.call(left, right);",
        '            return new Probe("OK", value, "-", stdoutBuffer.toString(), stderrBuffer.toString(), left, right);',
        "        } catch (Throwable throwable) {",
        '            return new Probe("EX", null, throwable.getClass().getName(), stdoutBuffer.toString(), stderrBuffer.toString(), left, right);',
        "        } finally {",
        "            System.setOut(originalOut);",
        "            System.setErr(originalErr);",
        "            capturedOut.close();",
        "            capturedErr.close();",
        "        }",
        "    }",
        "",
        "    static byte[] cloneOrNull(byte[] value) {",
        "        return value == null ? null : value.clone();",
        "    }",
        "",
        "    static String format(Probe probe) {",
        '        return probe.status + "\\t"',
        '            + (probe.value == null ? "-" : probe.value.toString()) + "\\t"',
        '            + probe.exceptionClass + "\\t"',
        '            + encodeString(probe.stdout) + "\\t"',
        '            + encodeString(probe.stderr) + "\\t"',
        '            + encodeBytes(probe.leftAfter) + "\\t"',
        "            + encodeBytes(probe.rightAfter);",
        "    }",
        "",
        "    static String encodeString(String value) {",
        '        return Base64.getEncoder().encodeToString(value.getBytes(java.nio.charset.StandardCharsets.UTF_8));',
        "    }",
        "",
        "    static String encodeBytes(byte[] value) {",
        '        return value == null ? "NULL" : Base64.getEncoder().encodeToString(value);',
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def run_oracle(class_id: int, timeout_seconds: float) -> list[CaseOutcome]:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-byte-array-") as temp_dir:
        temp_path = Path(temp_dir)
        oracle_dir = temp_path / PACKAGE_NAME
        oracle_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = oracle_dir / f"ClonePair{class_id}ByteArrayOracle.java"
        oracle_path.write_text(build_oracle_source(class_id), encoding="utf-8")

        compile_result = subprocess.run(
            [
                "javac",
                "-encoding",
                "UTF-8",
                "-d",
                temp_dir,
                "-sourcepath",
                str(MAIN_SOURCE),
                str(oracle_path),
            ],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds,
        )
        if compile_result.returncode != 0:
            raise RuntimeError(
                f"oracle compilation failed for ClonePair{class_id}\n{compile_result.stdout}\n{compile_result.stderr}"
            )

        run_result = subprocess.run(
            ["java", "-cp", temp_dir, f"{PACKAGE_NAME}.ClonePair{class_id}ByteArrayOracle"],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds,
        )
        if run_result.returncode != 0:
            raise RuntimeError(
                f"oracle execution failed for ClonePair{class_id}\n{run_result.stdout}\n{run_result.stderr}"
            )

    outcomes: list[CaseOutcome] = []
    for line in run_result.stdout.splitlines():
        parts = line.split("\t")
        if len(parts) != 15:
            raise RuntimeError(f"unexpected oracle output for ClonePair{class_id}: {line}")
        case = CANDIDATE_CASES[int(parts[0])]
        method1 = Probe(
            status=parts[1],
            value=None if parts[2] == "-" else parts[2] == "true",
            exception_class=None if parts[3] == "-" else parts[3],
            stdout=base64.b64decode(parts[4].encode("ascii")).decode("utf-8"),
            stderr=base64.b64decode(parts[5].encode("ascii")).decode("utf-8"),
            left_after=decode_base64_or_null(parts[6]),
            right_after=decode_base64_or_null(parts[7]),
        )
        method2 = Probe(
            status=parts[8],
            value=None if parts[9] == "-" else parts[9] == "true",
            exception_class=None if parts[10] == "-" else parts[10],
            stdout=base64.b64decode(parts[11].encode("ascii")).decode("utf-8"),
            stderr=base64.b64decode(parts[12].encode("ascii")).decode("utf-8"),
            left_after=decode_base64_or_null(parts[13]),
            right_after=decode_base64_or_null(parts[14]),
        )
        outcomes.append(CaseOutcome(case, method1, method2))
    return outcomes


def render_difference_test(class_id: int, outcome: CaseOutcome, diff_kind: str) -> str:
    imports = [
        "import org.junit.jupiter.api.Test;",
        "",
        "import static org.junit.jupiter.api.Assertions.assertEquals;",
        "import static org.junit.jupiter.api.Assertions.assertFalse;",
        "import static org.junit.jupiter.api.Assertions.assertNotEquals;",
        "import static org.junit.jupiter.api.Assertions.assertNull;",
        "import static org.junit.jupiter.api.Assertions.assertTrue;",
        "import static unverified.ClonePairByteArrayTestSupport.*;",
    ]

    lines = [
        f"package {PACKAGE_NAME};",
        "",
        *imports,
        "",
        f"class ClonePair{class_id}DifferenceFindingTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
    ]

    method1 = outcome.method1
    method2 = outcome.method2
    left_literal = outcome.case.left_source
    right_literal = outcome.case.right_source

    if diff_kind in {"return", "exception"}:
        lines.extend([
            "    @Test",
            "    void methodsDisagreeOnGeneratedInput() {",
            f"        InvocationOutcome method1Outcome = capture(subject::method1, {left_literal}, {right_literal});",
            f"        InvocationOutcome method2Outcome = capture(subject::method2, {left_literal}, {right_literal});",
            "",
        ])
        lines.extend(render_outcome_assertions("method1Outcome", method1))
        lines.extend(render_outcome_assertions("method2Outcome", method2))
        lines.extend([
            "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
            "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
            "        assertInputStatePreserved(method1Outcome);",
            "        assertInputStatePreserved(method2Outcome);",
            "    }",
            "}",
            "",
        ])
        return "\n".join(lines)

    test_name = {
        "stdout": "methodsDisagreeOnStandardOutputSideEffectsForGeneratedInput",
        "stderr": "methodsDisagreeOnStandardErrorSideEffectsForGeneratedInput",
        "mutation": "methodsDisagreeOnInputMutationSideEffectsForGeneratedInput",
    }[diff_kind]

    lines.extend([
        "    @Test",
        f"    void {test_name}() {{",
        f"        InvocationOutcome method1Outcome = capture(subject::method1, {left_literal}, {right_literal});",
        f"        InvocationOutcome method2Outcome = capture(subject::method2, {left_literal}, {right_literal});",
        "",
    ])
    lines.extend(render_outcome_assertions("method1Outcome", method1))
    lines.extend(render_outcome_assertions("method2Outcome", method2))

    if diff_kind == "stdout":
        lines.extend([
            "        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);",
            f"        assertEquals({java_string(method1.stdout)}, method1Outcome.stdout);",
            f"        assertEquals({java_string(method2.stdout)}, method2Outcome.stdout);",
            "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
            "        assertInputStatePreserved(method1Outcome);",
            "        assertInputStatePreserved(method2Outcome);",
        ])
    elif diff_kind == "stderr":
        lines.extend([
            "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
            "        assertNotEquals(method1Outcome.stderr, method2Outcome.stderr);",
            f"        assertEquals({java_string(method1.stderr)}, method1Outcome.stderr);",
            f"        assertEquals({java_string(method2.stderr)}, method2Outcome.stderr);",
            "        assertInputStatePreserved(method1Outcome);",
            "        assertInputStatePreserved(method2Outcome);",
        ])
    else:
        lines.extend([
            "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
            "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
            f"        assertArrayEqualsOrNull({java_byte_array_literal(method1.left_after)}, method1Outcome.leftAfter);",
            f"        assertArrayEqualsOrNull({java_byte_array_literal(method1.right_after)}, method1Outcome.rightAfter);",
            f"        assertArrayEqualsOrNull({java_byte_array_literal(method2.left_after)}, method2Outcome.leftAfter);",
            f"        assertArrayEqualsOrNull({java_byte_array_literal(method2.right_after)}, method2Outcome.rightAfter);",
        ])

    lines.extend([
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def render_outcome_assertions(variable_name: str, probe: Probe) -> list[str]:
    if probe.status == "OK":
        value_assertion = "true" if probe.value else "false"
        return [
            f'        assertEquals("OK", {variable_name}.status);',
            f"        assertEquals({value_assertion}, {variable_name}.value);",
            f"        assertNull({variable_name}.exceptionClass);",
        ]
    return [
        f'        assertEquals("EX", {variable_name}.status);',
        f'        assertEquals("{probe.exception_class}", {variable_name}.exceptionClass);',
        f"        assertNull({variable_name}.value);",
    ]


def render_no_difference_test(class_id: int, outcomes: list[CaseOutcome]) -> str:
    return_cases = representative_return_cases(outcomes)
    exception_cases = representative_exception_cases(outcomes)
    used_labels = {case.case.label for case in return_cases}
    boundary_cases = representative_boundary_cases(outcomes, used_labels)

    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        "import static org.junit.jupiter.api.Assertions.assertEquals;",
        "import static unverified.ClonePairByteArrayTestSupport.*;",
        "",
        f"class ClonePair{class_id}NoDifferenceTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
        "    // No separating input was found; these tests document representative equivalent paths.",
        "    @Test",
        "    void noDifferenceFoundForRepresentativeReturnValues() {",
    ]
    for outcome in return_cases:
        expected = "true" if outcome.method1.value else "false"
        lines.append(
            f"        assertBothMethodsReturn({expected}, {outcome.case.left_source}, {outcome.case.right_source});"
        )
    lines.extend([
        "    }",
        "",
        "    @Test",
    ])

    if exception_cases:
        lines.append("    void noDifferenceFoundForRepresentativeExceptionOutcomes() {")
        for outcome in exception_cases:
            lines.append(
                f'        assertBothMethodsThrow("{outcome.method1.exception_class}", {outcome.case.left_source}, {outcome.case.right_source});'
            )
    else:
        lines.append("    void noDifferenceFoundForRepresentativeBoundaryCases() {")
        for outcome in boundary_cases:
            expected = "true" if outcome.method1.value else "false"
            lines.append(
                f"        assertBothMethodsReturn({expected}, {outcome.case.left_source}, {outcome.case.right_source});"
            )
    lines.extend([
        "    }",
        "",
        "    private void assertBothMethodsReturn(boolean expected, byte[] left, byte[] right) {",
        "        InvocationOutcome method1Outcome = capture(subject::method1, left, right);",
        "        InvocationOutcome method2Outcome = capture(subject::method2, left, right);",
        "",
        '        assertEquals("OK", method1Outcome.status);',
        '        assertEquals("OK", method2Outcome.status);',
        "        assertEquals(expected, method1Outcome.value);",
        "        assertEquals(expected, method2Outcome.value);",
        "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
        "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
        "        assertInputStatePreserved(method1Outcome);",
        "        assertInputStatePreserved(method2Outcome);",
        "    }",
        "",
        "    private void assertBothMethodsThrow(String exceptionClass, byte[] left, byte[] right) {",
        "        InvocationOutcome method1Outcome = capture(subject::method1, left, right);",
        "        InvocationOutcome method2Outcome = capture(subject::method2, left, right);",
        "",
        '        assertEquals("EX", method1Outcome.status);',
        '        assertEquals("EX", method2Outcome.status);',
        "        assertEquals(exceptionClass, method1Outcome.exceptionClass);",
        "        assertEquals(exceptionClass, method2Outcome.exceptionClass);",
        "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
        "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
        "        assertInputStatePreserved(method1Outcome);",
        "        assertInputStatePreserved(method2Outcome);",
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def process_class(class_id: int, overwrite: bool, timeout_seconds: float) -> str:
    source = source_path(class_id)
    if not source.exists():
        return "missing"
    if not supports_boolean_bytearray_signature(class_id):
        return "skipped:unsupported-signature"
    existing = existing_test_path(class_id)
    if existing is not None and not overwrite:
        return f"skipped:{existing.name}"

    outcomes = run_oracle(class_id, timeout_seconds)
    diff = next((outcome for outcome in outcomes if method_outcome_diff_kind(outcome) is not None), None)

    if diff is None:
        target = no_difference_test_path(class_id)
        target.write_text(render_no_difference_test(class_id, outcomes), encoding="utf-8")
        return "no-difference"

    diff_kind = method_outcome_diff_kind(diff)
    assert diff_kind is not None
    target = difference_test_path(class_id)
    target.write_text(render_difference_test(class_id, diff, diff_kind), encoding="utf-8")
    return f"difference:{diff_kind}:{diff.case.label}"


def main() -> int:
    args = parse_args()
    for class_id in range(args.start_id, args.end_id + 1):
        if not source_path(class_id).exists():
            continue
        result = process_class(class_id, args.overwrite, args.class_timeout_seconds)
        print(f"ClonePair{class_id}: {result}", flush=True)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
