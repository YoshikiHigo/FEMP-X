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
    input_after: str | None


@dataclass(frozen=True)
class CaseOutcome:
    case: CandidateCase
    method1: Probe
    method2: Probe


CASES = [
    CandidateCase("nullInput", "null"),
    CandidateCase("empty", "list()"),
    CandidateCase("singleAlpha", 'list("alpha")'),
    CandidateCase("pairAlphaBeta", 'list("alpha", "beta")'),
    CandidateCase("pairBetaGamma", 'list("beta", "gamma")'),
    CandidateCase("triple", 'list("alpha", "beta", "gamma")'),
    CandidateCase("duplicate", 'list("alpha", "alpha")'),
    CandidateCase("leadingNull", 'list((Object) null, "beta")'),
    CandidateCase("trailingNull", 'list("alpha", (Object) null)'),
]


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--start-id", type=int, default=1501)
    parser.add_argument("--end-id", type=int, default=2000)
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


def supports_list_string_signature(class_id: int) -> bool:
    methods = gen.parse_class(PACKAGE_NAME, class_id)
    method1 = methods["method1"]
    method2 = methods["method2"]
    return (
        method1.declared_return_type == "String"
        and method2.declared_return_type == "String"
        and len(method1.params) == 1
        and len(method2.params) == 1
        and method1.params[0].declared_type == "List"
        and method2.params[0].declared_type == "List"
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
        "import java.util.ArrayList;",
        "import java.util.Arrays;",
        "import java.util.Base64;",
        "import java.util.List;",
        "",
        f"public class ClonePair{class_id}ListStringOracle {{",
        "",
        "    @FunctionalInterface",
        "    interface Invocation {",
        "        String call(List input) throws Throwable;",
        "    }",
        "",
        "    static final class Probe {",
        "        final String status;",
        "        final String value;",
        "        final String exceptionClass;",
        "        final String stdout;",
        "        final String stderr;",
        "        final String inputAfter;",
        "",
        "        Probe(String status, String value, String exceptionClass, String stdout, String stderr, String inputAfter) {",
        "            this.status = status;",
        "            this.value = value;",
        "            this.exceptionClass = exceptionClass;",
        "            this.stdout = stdout;",
        "            this.stderr = stderr;",
        "            this.inputAfter = inputAfter;",
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
        "    static void emit(int index, List inputSource) {",
        f"        Probe method1 = capture(input -> new ClonePair{class_id}().method1(input), inputSource);",
        f"        Probe method2 = capture(input -> new ClonePair{class_id}().method2(input), inputSource);",
        '        System.out.println(index + "\\t" + format(method1) + "\\t" + format(method2));',
        "    }",
        "",
        "    static Probe capture(Invocation invocation, List inputSource) {",
        "        List input = cloneOrNull(inputSource);",
        "        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();",
        "        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();",
        "        PrintStream originalOut = System.out;",
        "        PrintStream originalErr = System.err;",
        "        PrintStream capturedOut = new PrintStream(stdoutBuffer, true);",
        "        PrintStream capturedErr = new PrintStream(stderrBuffer, true);",
        "        try {",
        "            System.setOut(capturedOut);",
        "            System.setErr(capturedErr);",
        '            return new Probe("OK", invocation.call(input), "-", encode(stdoutBuffer.toString(StandardCharsets.UTF_8)), encode(stderrBuffer.toString(StandardCharsets.UTF_8)), encodeList(input));',
        "        } catch (Throwable throwable) {",
        '            return new Probe("EX", "-", throwable.getClass().getName(), encode(stdoutBuffer.toString(StandardCharsets.UTF_8)), encode(stderrBuffer.toString(StandardCharsets.UTF_8)), encodeList(input));',
        "        } finally {",
        "            System.setOut(originalOut);",
        "            System.setErr(originalErr);",
        "            capturedOut.close();",
        "            capturedErr.close();",
        "        }",
        "    }",
        "",
        "    static List list(Object... values) {",
        "        return new ArrayList(Arrays.asList(values));",
        "    }",
        "",
        "    static List cloneOrNull(List value) {",
        "        return value == null ? null : new ArrayList(value);",
        "    }",
        "",
        "    static String format(Probe probe) {",
        '        return probe.status + "\\t" + (probe.value == null ? "-" : encode(probe.value)) + "\\t" + probe.exceptionClass + "\\t" + probe.stdout + "\\t" + probe.stderr + "\\t" + probe.inputAfter;',
        "    }",
        "",
        "    static String encode(String value) {",
        "        return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));",
        "    }",
        "",
        "    static String encodeList(List value) {",
        '        return value == null ? "NULL" : encode(value.toString());',
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def decode_b64(value: str) -> str:
    return base64.b64decode(value.encode("ascii")).decode("utf-8")


def decode_list(value: str) -> str | None:
    if value == "NULL":
        return None
    return decode_b64(value)


def run_oracle(class_id: int, timeout_seconds: float) -> list[CaseOutcome]:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-list-") as temp_dir:
        temp_path = Path(temp_dir)
        oracle_dir = temp_path / PACKAGE_NAME
        oracle_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = oracle_dir / f"ClonePair{class_id}ListStringOracle.java"
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
            ["java", "-cp", temp_dir, f"{PACKAGE_NAME}.ClonePair{class_id}ListStringOracle"],
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
            decode_list(parts[6]),
        )
        method2 = Probe(
            parts[7],
            None if parts[8] == "-" else decode_b64(parts[8]),
            None if parts[9] == "-" else parts[9],
            decode_b64(parts[10]),
            decode_b64(parts[11]),
            decode_list(parts[12]),
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
    if outcome.method1.input_after != outcome.method2.input_after:
        return "mutation"
    return None


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


def render_difference_test(class_id: int, outcome: CaseOutcome, kind: str) -> str:
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        "import static org.junit.jupiter.api.Assertions.assertEquals;",
        "import static org.junit.jupiter.api.Assertions.assertNotEquals;",
        "import static org.junit.jupiter.api.Assertions.assertNull;",
        "import static unverified.ClonePairListStringTestSupport.*;",
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
    if kind in {"return", "exception"}:
        lines.extend([
            "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
            "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
            "        assertInputStatePreserved(method1Outcome);",
            "        assertInputStatePreserved(method2Outcome);",
        ])
    elif kind == "stdout":
        lines.extend([
            "        assertNotEquals(method1Outcome.stdout, method2Outcome.stdout);",
            f"        assertEquals({java_string(outcome.method1.stdout)}, method1Outcome.stdout);",
            f"        assertEquals({java_string(outcome.method2.stdout)}, method2Outcome.stdout);",
            "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
            "        assertInputStatePreserved(method1Outcome);",
            "        assertInputStatePreserved(method2Outcome);",
        ])
    elif kind == "stderr":
        lines.extend([
            "        assertNotEquals(method1Outcome.stderr, method2Outcome.stderr);",
            f"        assertEquals({java_string(outcome.method1.stderr)}, method1Outcome.stderr);",
            f"        assertEquals({java_string(outcome.method2.stderr)}, method2Outcome.stderr);",
            "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
            "        assertInputStatePreserved(method1Outcome);",
            "        assertInputStatePreserved(method2Outcome);",
        ])
    else:
        lines.extend([
            "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
            "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
            "        assertNotEquals(method1Outcome.inputAfter, method2Outcome.inputAfter);",
        ])
    lines.extend([
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def render_no_difference_test(class_id: int, outcomes: list[CaseOutcome]) -> str:
    returns = [item for item in outcomes if item.method1.status == "OK"][:4]
    exceptions = [item for item in outcomes if item.method1.status == "EX"][:2]
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        "import static org.junit.jupiter.api.Assertions.assertEquals;",
        "import static unverified.ClonePairListStringTestSupport.*;",
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
        lines.append('        assertBothMethodsReturn("alpha,beta", list("alpha", "beta"));')
    lines.extend([
        "    }",
        "",
        "    private void assertBothMethodsReturn(String expected, java.util.List input) {",
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
        "    private void assertBothMethodsThrow(String exceptionClass, java.util.List input) {",
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
    if not supports_list_string_signature(class_id):
        return "skipped:unsupported-signature"
    existing = existing_test_path(class_id)
    if existing is not None and not overwrite:
        return f"skipped:{existing.name}"
    outcomes = run_oracle(class_id, timeout_seconds)
    difference = next((outcome for outcome in outcomes if diff_kind(outcome) is not None), None)
    if difference is None:
        test_path(class_id, False).write_text(render_no_difference_test(class_id, outcomes), encoding="utf-8")
        return "no-difference"
    kind = diff_kind(difference)
    test_path(class_id, True).write_text(render_difference_test(class_id, difference, str(kind)), encoding="utf-8")
    return f"difference:{difference.case.label}:{kind}"


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
