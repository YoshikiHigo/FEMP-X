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
    value: int | None
    exception_class: str | None
    stdout: str
    stderr: str
    input_after_snapshot: str


@dataclass(frozen=True)
class CaseOutcome:
    case: CandidateCase
    method1: Probe
    method2: Probe


CASES = [
    CandidateCase("nullInput", "null"),
    CandidateCase("integer", "Integer.valueOf(7)"),
    CandidateCase("longValue", "Long.valueOf(3L)"),
    CandidateCase("doubleValue", "Double.valueOf(3.9)"),
    CandidateCase("nanDouble", "Double.valueOf(Double.NaN)"),
    CandidateCase("atomicInt", "atomicInt(5)"),
    CandidateCase("trueBoolean", "Boolean.TRUE"),
    CandidateCase("falseBoolean", "Boolean.FALSE"),
    CandidateCase("numericString", '"42"'),
    CandidateCase("decimalString", '"42.0"'),
    CandidateCase("trimmedString", '" 42 "'),
    CandidateCase("nonNumericString", '"abc"'),
    CandidateCase("textObjectInt", 'textObject("42")'),
    CandidateCase("textObjectDecimal", 'textObject("42.0")'),
    CandidateCase("textObjectTrimmed", 'textObject(" 42 ")'),
    CandidateCase("builderInt", 'builder("42")'),
    CandidateCase("builderDecimal", 'builder("42.0")'),
    CandidateCase("builderTrimmed", 'builder(" 42 ")'),
    CandidateCase("throwingToString", "throwingToStringObject()"),
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


def supports_object_integer_signature(class_id: int) -> bool:
    methods = gen.parse_class(PACKAGE_NAME, class_id)
    method1 = methods["method1"]
    method2 = methods["method2"]
    return (
        method1.declared_return_type == "Integer"
        and method2.declared_return_type == "Integer"
        and len(method1.params) == 1
        and len(method2.params) == 1
        and method1.params[0].declared_type == "Object"
        and method2.params[0].declared_type == "Object"
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
        "import java.util.Base64;",
        "import java.util.concurrent.atomic.AtomicInteger;",
        "",
        f"public class ClonePair{class_id}ObjectIntegerOracle {{",
        "",
        "    @FunctionalInterface",
        "    interface Invocation {",
        "        Integer call(Object input) throws Throwable;",
        "    }",
        "",
        "    static final class Probe {",
        "        final String status;",
        "        final Integer value;",
        "        final String exceptionClass;",
        "        final String stdout;",
        "        final String stderr;",
        "        final String inputAfterSnapshot;",
        "",
        "        Probe(String status, Integer value, String exceptionClass, String stdout, String stderr, String inputAfterSnapshot) {",
        "            this.status = status;",
        "            this.value = value;",
        "            this.exceptionClass = exceptionClass;",
        "            this.stdout = stdout;",
        "            this.stderr = stderr;",
        "            this.inputAfterSnapshot = inputAfterSnapshot;",
        "        }",
        "    }",
        "",
        "    static final class ToStringObject {",
        "        final String text;",
        "",
        "        ToStringObject(String text) {",
        "            this.text = text;",
        "        }",
        "",
        "        @Override",
        "        public String toString() {",
        "            return text;",
        "        }",
        "    }",
        "",
        "    static final class ThrowingToStringObject {",
        "        @Override",
        "        public String toString() {",
        '            throw new IllegalStateException("boom");',
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
        "    static void emit(int index, Object inputSource) {",
        f"        Probe method1 = capture(input -> new ClonePair{class_id}().method1(input), inputSource);",
        f"        Probe method2 = capture(input -> new ClonePair{class_id}().method2(input), inputSource);",
        '        System.out.println(index + "\\t" + format(method1) + "\\t" + format(method2));',
        "    }",
        "",
        "    static Probe capture(Invocation invocation, Object inputSource) {",
        "        Object input = cloneInput(inputSource);",
        "        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();",
        "        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();",
        "        PrintStream originalOut = System.out;",
        "        PrintStream originalErr = System.err;",
        "        PrintStream capturedOut = new PrintStream(stdoutBuffer, true);",
        "        PrintStream capturedErr = new PrintStream(stderrBuffer, true);",
        "        try {",
        "            System.setOut(capturedOut);",
        "            System.setErr(capturedErr);",
        '            return new Probe("OK", invocation.call(input), "-", encode(stdoutBuffer.toString(StandardCharsets.UTF_8)), encode(stderrBuffer.toString(StandardCharsets.UTF_8)), encode(snapshot(input)));',
        "        } catch (Throwable throwable) {",
        '            return new Probe("EX", null, throwable.getClass().getName(), encode(stdoutBuffer.toString(StandardCharsets.UTF_8)), encode(stderrBuffer.toString(StandardCharsets.UTF_8)), encode(snapshot(input)));',
        "        } finally {",
        "            System.setOut(originalOut);",
        "            System.setErr(originalErr);",
        "            capturedOut.close();",
        "            capturedErr.close();",
        "        }",
        "    }",
        "",
        "    static Object textObject(String text) {",
        "        return new ToStringObject(text);",
        "    }",
        "",
        "    static Object builder(String text) {",
        "        return new StringBuilder(text);",
        "    }",
        "",
        "    static Object atomicInt(int value) {",
        "        return new AtomicInteger(value);",
        "    }",
        "",
        "    static Object throwingToStringObject() {",
        "        return new ThrowingToStringObject();",
        "    }",
        "",
        "    static Object cloneInput(Object input) {",
        "        if (input == null || input instanceof String || input instanceof Number || input instanceof Boolean) {",
        "            return input;",
        "        }",
        "        if (input instanceof StringBuilder) {",
        "            return new StringBuilder(input.toString());",
        "        }",
        "        if (input instanceof AtomicInteger) {",
        "            return new AtomicInteger(((AtomicInteger) input).get());",
        "        }",
        "        if (input instanceof ToStringObject) {",
        "            return new ToStringObject(((ToStringObject) input).text);",
        "        }",
        "        if (input instanceof ThrowingToStringObject) {",
        "            return new ThrowingToStringObject();",
        "        }",
        '        throw new IllegalArgumentException("Unsupported input type: " + input.getClass().getName());',
        "    }",
        "",
        "    static String snapshot(Object input) {",
        "        if (input == null) {",
        '            return "null";',
        "        }",
        "        if (input instanceof StringBuilder) {",
        '            return "StringBuilder:" + input;',
        "        }",
        "        if (input instanceof AtomicInteger) {",
        '            return "AtomicInteger:" + ((AtomicInteger) input).get();',
        "        }",
        "        if (input instanceof ToStringObject) {",
        '            return "ToStringObject:" + ((ToStringObject) input).text;',
        "        }",
        "        if (input instanceof ThrowingToStringObject) {",
        '            return "ThrowingToStringObject";',
        "        }",
        '        return input.getClass().getName() + ":" + String.valueOf(input);',
        "    }",
        "",
        "    static String format(Probe probe) {",
        '        return probe.status + "\\t" + (probe.value == null ? "-" : probe.value.toString()) + "\\t" + probe.exceptionClass + "\\t" + probe.stdout + "\\t" + probe.stderr + "\\t" + probe.inputAfterSnapshot;',
        "    }",
        "",
        "    static String encode(String value) {",
        "        return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));",
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def decode_b64(value: str) -> str:
    return base64.b64decode(value.encode("ascii")).decode("utf-8")


def run_oracle(class_id: int, timeout_seconds: float) -> list[CaseOutcome]:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-object-") as temp_dir:
        temp_path = Path(temp_dir)
        oracle_dir = temp_path / PACKAGE_NAME
        oracle_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = oracle_dir / f"ClonePair{class_id}ObjectIntegerOracle.java"
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
            ["java", "-cp", temp_dir, f"{PACKAGE_NAME}.ClonePair{class_id}ObjectIntegerOracle"],
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
            None if parts[2] == "-" else int(parts[2]),
            None if parts[3] == "-" else parts[3],
            decode_b64(parts[4]),
            decode_b64(parts[5]),
            decode_b64(parts[6]),
        )
        method2 = Probe(
            parts[7],
            None if parts[8] == "-" else int(parts[8]),
            None if parts[9] == "-" else parts[9],
            decode_b64(parts[10]),
            decode_b64(parts[11]),
            decode_b64(parts[12]),
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
    if outcome.method1.input_after_snapshot != outcome.method2.input_after_snapshot:
        return "mutation"
    return None


def render_value_assertion(name: str, value: int | None) -> list[str]:
    if value is None:
        return [f"        assertNull({name}.value);"]
    return [f"        assertEquals(Integer.valueOf({value}), {name}.value);"]


def render_assertions(name: str, probe: Probe) -> list[str]:
    if probe.status == "OK":
        return [
            f'        assertEquals("OK", {name}.status);',
            *render_value_assertion(name, probe.value),
            f"        assertNull({name}.exceptionClass);",
        ]
    return [
        f'        assertEquals("EX", {name}.status);',
        f'        assertEquals("{probe.exception_class}", {name}.exceptionClass);',
        f"        assertNull({name}.value);",
    ]


def render_expected_integer(value: int | None) -> str:
    if value is None:
        return "null"
    return f"Integer.valueOf({value})"


def render_difference_test(class_id: int, outcome: CaseOutcome, kind: str) -> str:
    lines = [
        f"package {PACKAGE_NAME};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        "import static org.junit.jupiter.api.Assertions.assertEquals;",
        "import static org.junit.jupiter.api.Assertions.assertNotEquals;",
        "import static org.junit.jupiter.api.Assertions.assertNull;",
        "import static unverified.ClonePairObjectIntegerTestSupport.*;",
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
            "        assertNotEquals(method1Outcome.inputAfterSnapshot, method2Outcome.inputAfterSnapshot);",
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
        "import static org.junit.jupiter.api.Assertions.assertNull;",
        "import static unverified.ClonePairObjectIntegerTestSupport.*;",
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
            f"        assertBothMethodsReturn({render_expected_integer(outcome.method1.value)}, {outcome.case.source});"
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
        lines.append("        assertBothMethodsReturn(Integer.valueOf(7), Integer.valueOf(7));")
    lines.extend([
        "    }",
        "",
        "    private void assertBothMethodsReturn(Integer expected, Object input) {",
        "        InvocationOutcome method1Outcome = capture(subject::method1, input);",
        "        InvocationOutcome method2Outcome = capture(subject::method2, input);",
        "",
        '        assertEquals("OK", method1Outcome.status);',
        '        assertEquals("OK", method2Outcome.status);',
        "        assertEquals(expected, method1Outcome.value);",
        "        assertEquals(expected, method2Outcome.value);",
        "        assertNull(method1Outcome.exceptionClass);",
        "        assertNull(method2Outcome.exceptionClass);",
        "        assertEquals(method1Outcome.stdout, method2Outcome.stdout);",
        "        assertEquals(method1Outcome.stderr, method2Outcome.stderr);",
        "        assertInputStatePreserved(method1Outcome);",
        "        assertInputStatePreserved(method2Outcome);",
        "    }",
        "",
        "    private void assertBothMethodsThrow(String exceptionClass, Object input) {",
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


def process_class(class_id: int, overwrite: bool, timeout_seconds: float) -> str:
    if not source_path(class_id).exists():
        return "missing"
    if not supports_object_integer_signature(class_id):
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
