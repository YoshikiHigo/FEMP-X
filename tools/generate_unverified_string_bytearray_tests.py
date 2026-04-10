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
    source: str


@dataclass(frozen=True)
class Probe:
    status: str
    value: str | None
    exception_class: str | None
    stdout: str
    stderr: str


@dataclass(frozen=True)
class CaseOutcome:
    case: CandidateCase
    method1: Probe
    method2: Probe


CASES = [
    CandidateCase("nullInput", "null"),
    CandidateCase("empty", "new byte[]{}"),
    CandidateCase("zero", "new byte[]{0}"),
    CandidateCase("fifteen", "new byte[]{15}"),
    CandidateCase("sixteen", "new byte[]{16}"),
    CandidateCase("negativeOne", "new byte[]{-1}"),
    CandidateCase("negative128", "new byte[]{-128}"),
    CandidateCase("positive127", "new byte[]{127}"),
    CandidateCase("pair", "new byte[]{1, 2}"),
    CandidateCase("mixedSigns", "new byte[]{-1, 0, 1}"),
    CandidateCase("hexLetters", "new byte[]{10, 11, 12}"),
    CandidateCase("negativePair", "new byte[]{-16, -15}"),
]


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--start-id", type=int, default=1)
    parser.add_argument("--end-id", type=int, default=1500)
    parser.add_argument("--overwrite", action="store_true")
    parser.add_argument("--class-timeout-seconds", type=float, default=180.0)
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


def supports_string_bytearray_signature(class_id: int) -> bool:
    methods = gen.parse_class(PACKAGE_NAME, class_id)
    method1 = methods["method1"]
    method2 = methods["method2"]
    return (
        method1.declared_return_type == "String"
        and method2.declared_return_type == "String"
        and len(method1.params) == 1
        and len(method2.params) == 1
        and method1.params[0].declared_type == "byte[]"
        and method2.params[0].declared_type == "byte[]"
    )


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


def build_oracle_source(class_id: int) -> str:
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import java.io.ByteArrayOutputStream;",
        "import java.io.PrintStream;",
        "import java.nio.charset.StandardCharsets;",
        "import java.util.Arrays;",
        "import java.util.Base64;",
        "",
        f"public class ClonePair{class_id}StringByteArrayOracle {{",
        "",
        "    @FunctionalInterface",
        "    interface Invocation {",
        "        String call(byte[] input) throws Throwable;",
        "    }",
        "",
        "    static final class Probe {",
        "        final String status;",
        "        final String value;",
        "        final String exceptionClass;",
        "        final String stdout;",
        "        final String stderr;",
        "",
        "        Probe(String status, String value, String exceptionClass, String stdout, String stderr) {",
        "            this.status = status;",
        "            this.value = value;",
        "            this.exceptionClass = exceptionClass;",
        "            this.stdout = stdout;",
        "            this.stderr = stderr;",
        "        }",
        "    }",
        "",
        "    public static void main(String[] args) {",
    ]
    for index, case in enumerate(CASES):
        lines.append(f"        emit({index}, {case.source});")
    lines.extend([
        "    }",
        "",
        "    static void emit(int index, byte[] inputSource) {",
        f"        Probe method1 = capture(input -> new ClonePair{class_id}().method1(input), inputSource);",
        f"        Probe method2 = capture(input -> new ClonePair{class_id}().method2(input), inputSource);",
        '        System.out.println(index + "\\t" + format(method1) + "\\t" + format(method2));',
        "    }",
        "",
        "    static Probe capture(Invocation invocation, byte[] inputSource) {",
        "        byte[] input = inputSource == null ? null : inputSource.clone();",
        "        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();",
        "        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();",
        "        PrintStream originalOut = System.out;",
        "        PrintStream originalErr = System.err;",
        "        PrintStream capturedOut = new PrintStream(stdoutBuffer, true);",
        "        PrintStream capturedErr = new PrintStream(stderrBuffer, true);",
        "        try {",
        "            System.setOut(capturedOut);",
        "            System.setErr(capturedErr);",
        '            return new Probe("OK", invocation.call(input), "-",',
        "                base64(stdoutBuffer.toByteArray()), base64(stderrBuffer.toByteArray()));",
        "        } catch (Throwable throwable) {",
        '            return new Probe("EX", "-", throwable.getClass().getName(),',
        "                base64(stdoutBuffer.toByteArray()), base64(stderrBuffer.toByteArray()));",
        "        } finally {",
        "            System.setOut(originalOut);",
        "            System.setErr(originalErr);",
        "            capturedOut.close();",
        "            capturedErr.close();",
        "        }",
        "    }",
        "",
        "    static String format(Probe probe) {",
        '        return probe.status + "\\t" + (probe.value == null ? "-" : base64(probe.value.getBytes(StandardCharsets.UTF_8)))',
        '            + "\\t" + probe.exceptionClass + "\\t" + probe.stdout + "\\t" + probe.stderr;',
        "    }",
        "",
        "    static String base64(byte[] bytes) {",
        "        return Base64.getEncoder().encodeToString(bytes);",
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def decode_b64(value: str) -> str:
    return base64.b64decode(value.encode("ascii")).decode("utf-8")


def run_oracle(class_id: int, timeout_seconds: float) -> list[CaseOutcome]:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-string-bytearray-") as temp_dir:
        temp_path = Path(temp_dir)
        oracle_dir = temp_path / PACKAGE_NAME
        oracle_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = oracle_dir / f"ClonePair{class_id}StringByteArrayOracle.java"
        oracle_path.write_text(build_oracle_source(class_id), encoding="utf-8")

        compile_result = subprocess.run(
            ["javac", "-encoding", "UTF-8", "-d", temp_dir, "-sourcepath", str(MAIN_SOURCE), str(oracle_path)],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds,
        )
        if compile_result.returncode != 0:
            raise RuntimeError(compile_result.stderr)

        run_result = subprocess.run(
            ["java", "-cp", temp_dir, f"{PACKAGE_NAME}.ClonePair{class_id}StringByteArrayOracle"],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds,
        )
        if run_result.returncode != 0:
            raise RuntimeError(run_result.stderr)

    outcomes: list[CaseOutcome] = []
    for line in run_result.stdout.splitlines():
        parts = line.split("\t")
        case = CASES[int(parts[0])]
        method1 = Probe(
            parts[1],
            None if parts[2] == "-" else decode_b64(parts[2]),
            None if parts[3] == "-" else parts[3],
            decode_b64(parts[4]),
            decode_b64(parts[5]),
        )
        method2 = Probe(
            parts[6],
            None if parts[7] == "-" else decode_b64(parts[7]),
            None if parts[8] == "-" else parts[8],
            decode_b64(parts[9]),
            decode_b64(parts[10]),
        )
        outcomes.append(CaseOutcome(case, method1, method2))
    return outcomes


def diff_kind(outcome: CaseOutcome) -> str | None:
    if outcome.method1.status != outcome.method2.status:
        return "exception" if "EX" in {outcome.method1.status, outcome.method2.status} else "return"
    if outcome.method1.status == "EX":
        if outcome.method1.exception_class != outcome.method2.exception_class:
            return "exception"
    elif outcome.method1.value != outcome.method2.value:
        return "return"
    if outcome.method1.stdout != outcome.method2.stdout:
        return "stdout"
    if outcome.method1.stderr != outcome.method2.stderr:
        return "stderr"
    return None


def render_difference_test(class_id: int, outcome: CaseOutcome) -> str:
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        "import static org.junit.jupiter.api.Assertions.assertEquals;",
        "import static org.junit.jupiter.api.Assertions.assertNull;",
        "import static org.junit.jupiter.api.Assertions.assertTrue;",
        "import static unverified.ClonePairByteArrayStringTestSupport.*;",
        "",
        f"class ClonePair{class_id}DifferenceFindingTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
        "    @Test",
        "    void methodsDisagreeOnGeneratedInput() {",
        f"        InvocationOutcome method1Outcome = capture(subject::method1, {outcome.case.source});",
        f"        InvocationOutcome method2Outcome = capture(subject::method2, {outcome.case.source});",
        "",
    ]
    lines.extend(render_assertions("method1Outcome", outcome.method1))
    lines.extend(render_assertions("method2Outcome", outcome.method2))
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


def render_assertions(name: str, probe: Probe) -> list[str]:
    if probe.status == "OK":
        lines = [
            f'        assertEquals("OK", {name}.status);',
            f"        assertNull({name}.exceptionClass);",
        ]
        if probe.value is None:
            lines.append(f"        assertNull({name}.value);")
        else:
            lines.append(f"        assertEquals({java_string(probe.value)}, {name}.value);")
        return lines
    return [
        f'        assertEquals("EX", {name}.status);',
        f'        assertEquals("{probe.exception_class}", {name}.exceptionClass);',
        f"        assertNull({name}.value);",
    ]


def render_no_difference_test(class_id: int, outcomes: list[CaseOutcome]) -> str:
    returns = [item for item in outcomes if item.method1.status == "OK"][:4]
    exceptions = [item for item in outcomes if item.method1.status == "EX"][:2]
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        "import static org.junit.jupiter.api.Assertions.assertEquals;",
        "import static unverified.ClonePairByteArrayStringTestSupport.*;",
        "",
        f"class ClonePair{class_id}NoDifferenceTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
        "    // No separating input was found; these tests document representative equivalent paths.",
        "    @Test",
        "    void noDifferenceFoundForRepresentativeReturnValues() {",
    ]
    for outcome in returns:
        lines.append(
            f"        assertBothMethodsReturn({render_expected_value(outcome.method1.value)}, {outcome.case.source});"
        )
    lines.extend([
        "    }",
        "",
        "    @Test",
        "    void noDifferenceFoundForRepresentativeExceptionOutcomes() {",
    ])
    if exceptions:
        for outcome in exceptions:
            lines.append(
                f'        assertBothMethodsThrow("{outcome.method1.exception_class}", {outcome.case.source});'
            )
    else:
        lines.append("        assertBothMethodsReturn(\"\", new byte[]{});")
    lines.extend([
        "    }",
        "",
        "    private void assertBothMethodsReturn(String expected, byte[] input) {",
        "        InvocationOutcome method1Outcome = capture(subject::method1, input);",
        "        InvocationOutcome method2Outcome = capture(subject::method2, input);",
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
        "    private void assertBothMethodsThrow(String exceptionClass, byte[] input) {",
        "        InvocationOutcome method1Outcome = capture(subject::method1, input);",
        "        InvocationOutcome method2Outcome = capture(subject::method2, input);",
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


def render_expected_value(value: str | None) -> str:
    if value is None:
        return "null"
    return java_string(value)


def process_class(class_id: int, overwrite: bool, timeout_seconds: float) -> str:
    if not source_path(class_id).exists():
        return "missing"
    if not supports_string_bytearray_signature(class_id):
        return "skipped:unsupported-signature"
    existing = existing_test_path(class_id)
    if existing is not None and not overwrite:
        return f"skipped:{existing.name}"
    outcomes = run_oracle(class_id, timeout_seconds)
    diff = next((outcome for outcome in outcomes if diff_kind(outcome) is not None), None)
    if diff is None:
        test_path(class_id, False).write_text(render_no_difference_test(class_id, outcomes), encoding="utf-8")
        return "no-difference"
    test_path(class_id, True).write_text(render_difference_test(class_id, diff), encoding="utf-8")
    return f"difference:{diff.case.label}"


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
