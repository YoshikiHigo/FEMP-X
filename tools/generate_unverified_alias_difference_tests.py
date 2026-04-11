#!/usr/bin/env python3

from __future__ import annotations

import argparse
import csv
import json
import sys
from concurrent.futures import ThreadPoolExecutor, as_completed
from dataclasses import dataclass
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
sys.path.append(str(Path(__file__).resolve().parent))

import generate_clonepair_tests as gen
import generate_unverified_generic_difference_tests as gut
import recheck_unverified_nodiff_identity as identity


DEFAULT_PACKAGE_NAME = "unverified"


@dataclass(frozen=True)
class DifferenceRow:
    class_id: int
    difference_kind: str
    case_label: str
    logical_args: tuple[str, ...]


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--package-name", type=str, default=DEFAULT_PACKAGE_NAME)
    parser.add_argument("--csv-path", type=Path, default=None)
    parser.add_argument("--ids", type=str, default=None)
    parser.add_argument("--workers", type=int, default=8)
    parser.add_argument("--class-timeout-seconds", type=float, default=60.0)
    parser.add_argument("--invocation-timeout-millis", type=int, default=1000)
    args = parser.parse_args()
    if args.csv_path is None:
        args.csv_path = ROOT / "logs" / f"{args.package_name}_nodiff_identity_recheck_final.csv"
    return args


def test_source_dir(package_name: str) -> Path:
    return ROOT / "src" / "test" / "java" / package_name


def alias_support_path(package_name: str) -> Path:
    return test_source_dir(package_name) / "ClonePairAliasAwareInvocationTestSupport.java"


def target_rows(args: argparse.Namespace) -> list[DifferenceRow]:
    rows: list[DifferenceRow] = []
    with args.csv_path.open("r", encoding="utf-8", newline="") as handle:
        for row in csv.DictReader(handle):
            if row["status"] != "difference_found":
                continue
            rows.append(
                DifferenceRow(
                    class_id=int(row["class_id"]),
                    difference_kind=row["difference_kind"],
                    case_label=row["case_label"],
                    logical_args=tuple(json.loads(row["logical_args"])),
                )
            )
    if args.ids:
        allowed = {int(value) for value in args.ids.split(",") if value.strip()}
        rows = [row for row in rows if row.class_id in allowed]
    rows.sort(key=lambda row: row.class_id)
    return rows


def ensure_alias_support_source(package_name: str) -> None:
    support_path = alias_support_path(package_name)
    support_path.parent.mkdir(parents=True, exist_ok=True)
    expected = identity.alias_aware_support_source(package_name)
    if not support_path.exists() or support_path.read_text(encoding="utf-8") != expected:
        support_path.write_text(expected, encoding="utf-8")


def build_case_factory_method(method_name: str, case: identity.CaseSpec) -> list[str]:
    lines = [f"    private Object[] {method_name}() {{"]
    for body_line in case.factory_lines:
        lines.append("        " + body_line)
    lines.append("    }")
    return lines


def core_assert_lines(outcome_var: str, probe: identity.Probe) -> list[str]:
    return [
        "        assertCoreOutcome(",
        f"            {outcome_var},",
        f"            {gut.java_string(probe.status)},",
        f"            {gut.java_string(probe.value_snapshot)},",
        f"            {gut.java_string(probe.exception_class)},",
        f"            {gut.java_string(probe.original_inputs_snapshot)},",
        f"            {gut.java_string(probe.input_after_snapshot)}",
        "        );",
    ]


def timeout_assert_lines(outcome: identity.CaseOutcome) -> list[str]:
    lines: list[str] = []
    if outcome.method1.status != "TIMEOUT":
        lines.extend(core_assert_lines("method1Outcome", outcome.method1))
    else:
        lines.append(
            f'        assertTextEquals("originalInputsSnapshot", {gut.java_string(outcome.method1.original_inputs_snapshot)}, method1Outcome.originalInputsSnapshot);'
        )
    if outcome.method2.status != "TIMEOUT":
        lines.extend(core_assert_lines("method2Outcome", outcome.method2))
    else:
        lines.append(
            f'        assertTextEquals("originalInputsSnapshot", {gut.java_string(outcome.method2.original_inputs_snapshot)}, method2Outcome.originalInputsSnapshot);'
        )
    lines.append("        assertDifferent(method1Outcome, method2Outcome);")
    return lines


def generate_difference_test_source(
    package_name: str,
    class_id: int,
    methods: dict[str, gen.MethodInfo],
    outcome: identity.CaseOutcome,
    invocation_timeout_millis: int,
) -> str:
    lines = [
        f"package {package_name};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        f"import static {package_name}.ClonePairAliasAwareInvocationTestSupport.*;",
        "import static org.junit.jupiter.api.Assertions.assertNotEquals;",
        "import static org.junit.jupiter.api.Assertions.assertTrue;",
        "",
        f"class ClonePair{class_id}DifferenceFindingTest {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
        "    /**",
        "     * Generated by Codex (GPT-5).",
        f"     * separating case: {outcome.case.label} {json.dumps(outcome.case.logical_args, ensure_ascii=False)}",
        "     */",
        "    @Test",
        "    void methodsDisagreeOnGeneratedInput() {",
        (
            f"        InvocationOutcome method1Outcome = captureWithTimeout("
            f"{gut.invocation_expression('method1', methods['method1'])}, "
            f"{invocation_timeout_millis}L, buildMethod1Inputs());"
        ),
        (
            f"        InvocationOutcome method2Outcome = captureWithTimeout("
            f"{gut.invocation_expression('method2', methods['method2'])}, "
            f"{invocation_timeout_millis}L, buildMethod2Inputs());"
        ),
        "",
    ]
    if "TIMEOUT" in {outcome.method1.status, outcome.method2.status}:
        lines.extend(timeout_assert_lines(outcome))
    else:
        lines.extend(core_assert_lines("method1Outcome", outcome.method1))
        lines.extend(core_assert_lines("method2Outcome", outcome.method2))
    lines.extend(gut.stream_assertions("stdout", outcome.method1.stdout, outcome.method2.stdout))
    lines.extend(gut.stream_assertions("stderr", outcome.method1.stderr, outcome.method2.stderr))
    lines.extend([
        "    }",
        "",
    ])
    lines.extend(build_case_factory_method("buildMethod1Inputs", outcome.case))
    lines.extend(["", *build_case_factory_method("buildMethod2Inputs", outcome.case), "", "}", ""])
    return "\n".join(lines)


def write_difference_test(package_name: str, class_id: int, source: str) -> None:
    target_dir = test_source_dir(package_name)
    target = target_dir / f"ClonePair{class_id}DifferenceFindingTest.java"
    opposite = target_dir / f"ClonePair{class_id}NoDifferenceTest.java"
    target.write_text(source, encoding="utf-8")
    if opposite.exists():
        opposite.unlink()


def select_outcome(row: DifferenceRow, outcomes: list[identity.CaseOutcome]) -> identity.CaseOutcome | None:
    for outcome in outcomes:
        if (
            outcome.case.label == row.case_label
            and outcome.case.logical_args == row.logical_args
            and identity.difference_kind(outcome) is not None
        ):
            return outcome
    for outcome in outcomes:
        if identity.difference_kind(outcome) is not None:
            return outcome
    return None


def process_row(
    package_name: str,
    row: DifferenceRow,
    class_timeout_seconds: float,
    invocation_timeout_millis: int,
) -> tuple[int, str, str]:
    methods = gen.parse_class(package_name, row.class_id)
    gut.normalize_signature(methods)
    cases = identity.build_cases(methods)
    outcomes = identity.run_oracle(
        package_name,
        row.class_id,
        methods,
        cases,
        class_timeout_seconds=class_timeout_seconds,
        invocation_timeout_millis=invocation_timeout_millis,
    )
    selected = select_outcome(row, outcomes)
    if selected is None:
        return row.class_id, "skipped", ""
    source = generate_difference_test_source(package_name, row.class_id, methods, selected, invocation_timeout_millis)
    write_difference_test(package_name, row.class_id, source)
    return row.class_id, "wrote", identity.difference_kind(selected) or "unknown"


def main() -> int:
    args = parse_args()
    rows = target_rows(args)
    ensure_alias_support_source(args.package_name)
    failures: list[tuple[int, str]] = []
    with ThreadPoolExecutor(max_workers=args.workers) as executor:
        futures = {
            executor.submit(
                process_row,
                args.package_name,
                row,
                args.class_timeout_seconds,
                args.invocation_timeout_millis,
            ): row
            for row in rows
        }
        for future in as_completed(futures):
            row = futures[future]
            try:
                class_id, status, diff_kind = future.result()
                if status == "skipped":
                    print(f"ClonePair{class_id}: skipped-unreproduced")
                else:
                    print(f"ClonePair{class_id}: wrote-difference:{diff_kind}")
            except Exception as exc:  # noqa: BLE001
                message = str(exc).splitlines()[0]
                failures.append((row.class_id, message))
                print(f"ClonePair{row.class_id}: error:{exc.__class__.__name__}: {message}")
    if failures:
        print("Failures:")
        for class_id, message in failures:
            print(f"ClonePair{class_id}: {message}")
        return 1
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
