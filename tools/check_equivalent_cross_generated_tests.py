#!/usr/bin/env python3

from __future__ import annotations

import argparse
import concurrent.futures
import csv
import json
import os
import re
import subprocess
import sys
import tempfile
import textwrap
import time
from dataclasses import dataclass
from pathlib import Path

import generate_clonepair_tests as gen


ROOT = Path(__file__).resolve().parents[1]
PACKAGE_NAME = "equivalent"
SUPPORT_PACKAGE = "support"
GRADLEW = "gradlew.bat"
JAVAC_MEMORY_ARGS = ["-J-Xms64m", "-J-Xmx256m"]
JAVA_MEMORY_ARGS = ["-Xms64m", "-Xmx256m", "-XX:ReservedCodeCacheSize=128m"]
TEST_METHOD_PATTERN = re.compile(r"@Test\s+void\s+(\w+)\(\)\s*\{", re.M)
CSV_HEADER = [
    "class_id",
    "method1_test_count",
    "method2_test_count",
    "method1_tests_success_on_method2",
    "method2_tests_success_on_method1",
    "all_cross_tests_succeeded",
    "status",
    "detail",
]


@dataclass(frozen=True)
class ExtractedTest:
    name: str
    body: str


@dataclass(frozen=True)
class ExtractedTestSource:
    imports: list[str]
    members: list[str]
    tests: list[ExtractedTest]


@dataclass(frozen=True)
class ClassResult:
    class_id: int
    method1_test_count: int
    method2_test_count: int
    method1_tests_success_on_method2: int
    method2_tests_success_on_method1: int
    all_cross_tests_succeeded: bool
    status: str
    detail: str


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--class-id", type=int, default=None)
    parser.add_argument("--package-name", type=str, default="equivalent")
    parser.add_argument("--start-id", type=int, default=None)
    parser.add_argument("--end-id", type=int, default=None)
    parser.add_argument("--ids", type=str, default=None)
    parser.add_argument("--workers", type=int, default=6)
    parser.add_argument("--timeout-seconds", type=float, default=60.0)
    parser.add_argument("--resume", action="store_true")
    parser.add_argument("--csv-path", type=Path, default=None)
    return parser.parse_args()


def target_ids(args: argparse.Namespace) -> list[int]:
    main_ids = {
        int(path.stem.replace("ClonePair", ""))
        for path in (ROOT / "src" / "main" / "java" / args.package_name).glob("ClonePair*.java")
    }
    method1_ids = {
        int(path.stem.replace("ClonePair", "").split("Method1Test", 1)[0])
        for path in (ROOT / "src" / "test" / "java" / args.package_name).glob("ClonePair*Method1Test.java")
    }
    method2_ids = {
        int(path.stem.replace("ClonePair", "").split("Method2Test", 1)[0])
        for path in (ROOT / "src" / "test" / "java" / args.package_name).glob("ClonePair*Method2Test.java")
    }
    ids = sorted(main_ids & method1_ids & method2_ids)
    if args.ids:
        requested = {int(part.strip()) for part in args.ids.split(",") if part.strip()}
        ids = [class_id for class_id in ids if class_id in requested]
    if args.start_id is not None:
        ids = [class_id for class_id in ids if class_id >= args.start_id]
    if args.end_id is not None:
        ids = [class_id for class_id in ids if class_id <= args.end_id]
    return ids


def read_existing_results(csv_path: Path) -> dict[int, ClassResult]:
    if not csv_path.exists():
        return {}
    results: dict[int, ClassResult] = {}
    with csv_path.open(encoding="utf-8", newline="") as csv_file:
        reader = csv.DictReader(csv_file)
        for row in reader:
            class_id = int(row["class_id"])
            results[class_id] = ClassResult(
                class_id=class_id,
                method1_test_count=int(row["method1_test_count"]),
                method2_test_count=int(row["method2_test_count"]),
                method1_tests_success_on_method2=int(row["method1_tests_success_on_method2"]),
                method2_tests_success_on_method1=int(row["method2_tests_success_on_method1"]),
                all_cross_tests_succeeded=(row["all_cross_tests_succeeded"].strip().lower() == "true"),
                status=row["status"],
                detail=row["detail"],
            )
    return results


def write_result_row(writer: csv.writer, result: ClassResult) -> None:
    writer.writerow([
        result.class_id,
        result.method1_test_count,
        result.method2_test_count,
        result.method1_tests_success_on_method2,
        result.method2_tests_success_on_method1,
        str(result.all_cross_tests_succeeded).lower(),
        result.status,
        result.detail,
    ])


def run_class_subprocess(class_id: int, timeout_seconds: float) -> ClassResult:
    method1_path = ROOT / "src" / "test" / "java" / PACKAGE_NAME / f"ClonePair{class_id}Method1Test.java"
    method2_path = ROOT / "src" / "test" / "java" / PACKAGE_NAME / f"ClonePair{class_id}Method2Test.java"
    fallback_method1_count = len(extract_test_source(method1_path).tests) if method1_path.exists() else 0
    fallback_method2_count = len(extract_test_source(method2_path).tests) if method2_path.exists() else 0
    command = [
        sys.executable,
        str(Path(__file__).resolve()),
        "--class-id",
        str(class_id),
        "--package-name",
        PACKAGE_NAME,
        "--timeout-seconds",
        str(timeout_seconds),
    ]
    started = time.perf_counter()
    try:
        completed = subprocess.run(
            command,
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds + 5.0,
        )
    except subprocess.TimeoutExpired:
        return ClassResult(
            class_id=class_id,
            method1_test_count=fallback_method1_count,
            method2_test_count=fallback_method2_count,
            method1_tests_success_on_method2=0,
            method2_tests_success_on_method1=0,
            all_cross_tests_succeeded=False,
            status="class_timeout",
            detail=f"class processing exceeded {timeout_seconds} seconds",
        )

    if completed.returncode != 0:
        detail = (completed.stderr.strip() or completed.stdout.strip() or "child process failed").replace("\n", " ")[:400]
        return ClassResult(
            class_id=class_id,
            method1_test_count=fallback_method1_count,
            method2_test_count=fallback_method2_count,
            method1_tests_success_on_method2=0,
            method2_tests_success_on_method1=0,
            all_cross_tests_succeeded=False,
            status="child_error",
            detail=detail,
        )

    output_lines = [line for line in completed.stdout.splitlines() if line.strip()]
    if not output_lines:
        return ClassResult(
            class_id=class_id,
            method1_test_count=fallback_method1_count,
            method2_test_count=fallback_method2_count,
            method1_tests_success_on_method2=0,
            method2_tests_success_on_method1=0,
            all_cross_tests_succeeded=False,
            status="child_error",
            detail="child process produced no output",
        )

    try:
        payload = json.loads(output_lines[-1])
    except json.JSONDecodeError:
        detail = output_lines[-1].replace("\n", " ")[:400]
        return ClassResult(
            class_id=class_id,
            method1_test_count=fallback_method1_count,
            method2_test_count=fallback_method2_count,
            method1_tests_success_on_method2=0,
            method2_tests_success_on_method1=0,
            all_cross_tests_succeeded=False,
            status="child_error",
            detail=f"unexpected child output: {detail}",
        )

    return ClassResult(
        class_id=class_id,
        method1_test_count=int(payload["method1_test_count"]),
        method2_test_count=int(payload["method2_test_count"]),
        method1_tests_success_on_method2=int(payload["method1_tests_success_on_method2"]),
        method2_tests_success_on_method1=int(payload["method2_tests_success_on_method1"]),
        all_cross_tests_succeeded=bool(payload["all_cross_tests_succeeded"]),
        status=str(payload["status"]),
        detail=str(payload["detail"]),
    )


def extract_imports(text: str) -> list[str]:
    return [line.strip() for line in text.splitlines() if line.strip().startswith("import ")]


def extract_class_body(text: str) -> str:
    class_match = re.search(r"\bclass\s+\w+[^{]*\{", text)
    if class_match is None:
        raise ValueError("Could not find class declaration")
    open_index = text.find("{", class_match.end() - 1)
    close_index = gen.find_matching_brace(text, open_index)
    return text[open_index + 1:close_index]


def strip_test_methods(class_body: str) -> tuple[str, list[ExtractedTest]]:
    tests: list[ExtractedTest] = []
    spans: list[tuple[int, int]] = []
    for match in TEST_METHOD_PATTERN.finditer(class_body):
        name = match.group(1)
        open_index = class_body.find("{", match.end() - 1)
        close_index = gen.find_matching_brace(class_body, open_index)
        body = class_body[open_index + 1:close_index].strip("\n")
        tests.append(ExtractedTest(name=name, body=textwrap.dedent(body).strip()))
        spans.append((match.start(), close_index + 1))

    pieces: list[str] = []
    cursor = 0
    for start, end in spans:
        pieces.append(class_body[cursor:start])
        cursor = end
    pieces.append(class_body[cursor:])
    return "".join(pieces), tests


def split_top_level_members(class_body: str) -> list[str]:
    members: list[str] = []
    index = 0
    length = len(class_body)
    while index < length:
        while index < length and class_body[index].isspace():
            index += 1
        if index >= length:
            break

        start = index
        brace_depth = 0
        paren_depth = 0
        bracket_depth = 0
        in_string = False
        in_char = False
        in_line_comment = False
        in_block_comment = False
        escaped = False
        ends_on_brace = False

        while index < length:
            char = class_body[index]
            next_char = class_body[index + 1] if index + 1 < length else ""
            if in_line_comment:
                index += 1
                if char == "\n":
                    in_line_comment = False
                continue
            if in_block_comment:
                index += 1
                if char == "*" and next_char == "/":
                    in_block_comment = False
                    index += 1
                continue
            if in_string:
                index += 1
                if escaped:
                    escaped = False
                elif char == "\\":
                    escaped = True
                elif char == '"':
                    in_string = False
                continue
            if in_char:
                index += 1
                if escaped:
                    escaped = False
                elif char == "\\":
                    escaped = True
                elif char == "'":
                    in_char = False
                continue

            if char == "/" and next_char == "/":
                in_line_comment = True
                index += 2
                continue
            if char == "/" and next_char == "*":
                in_block_comment = True
                index += 2
                continue
            if char == '"':
                in_string = True
                index += 1
                continue
            if char == "'":
                in_char = True
                index += 1
                continue
            if char == "(":
                paren_depth += 1
                index += 1
                continue
            if char == ")" and paren_depth > 0:
                paren_depth -= 1
                index += 1
                continue
            if char == "[":
                bracket_depth += 1
                index += 1
                continue
            if char == "]" and bracket_depth > 0:
                bracket_depth -= 1
                index += 1
                continue
            if char == "{":
                brace_depth += 1
                index += 1
                continue
            if char == "}":
                if brace_depth > 0:
                    brace_depth -= 1
                    index += 1
                    if brace_depth == 0 and paren_depth == 0 and bracket_depth == 0:
                        ends_on_brace = True
                        break
                    continue
                index += 1
                break
            if char == ";" and brace_depth == 0 and paren_depth == 0 and bracket_depth == 0:
                index += 1
                break
            index += 1

        member = class_body[start:index].strip()
        if member:
            members.append(member)
        while index < length and class_body[index].isspace():
            index += 1
        if ends_on_brace:
            continue
    return members


def normalize_member_key(member: str) -> str:
    return re.sub(r"\s+", " ", member).strip()


def extract_test_source(path: Path) -> ExtractedTestSource:
    text = path.read_text(encoding="utf-8")
    class_body = extract_class_body(text)
    remaining_body, tests = strip_test_methods(class_body)
    members = split_top_level_members(remaining_body)
    return ExtractedTestSource(
        imports=extract_imports(text),
        members=members,
        tests=tests,
    )


def transformed_body(body: str, source_method_name: str, target_method_name: str) -> str:
    pattern = re.compile(rf"\bsubject\s*\.\s*{re.escape(source_method_name)}\s*\(")
    return pattern.sub(f"subject.{target_method_name}(", body)


def java_string(value: str) -> str:
    return '"' + (
        value
        .replace("\\", "\\\\")
        .replace('"', '\\"')
        .replace("\r", "\\r")
        .replace("\n", "\\n")
        .replace("\t", "\\t")
    ) + '"'


def case_block(
    _runner_name: str,
    counter_name: str,
    label: str,
    method_name: str,
) -> str:
    return "\n".join([
        "        try {",
        f"            runner.{method_name}();",
        f"            {counter_name}++;",
        "        } catch (Throwable throwable) {",
        f"            recordFailure({java_string(label)}, throwable);",
        "        }",
    ])


def build_runner_source(class_id: int, method1_source: ExtractedTestSource, method2_source: ExtractedTestSource) -> str:
    runner_name = f"ClonePair{class_id}CrossGeneratedTestRunner"
    imports: list[str] = []
    seen_imports: set[str] = set()
    for import_line in method1_source.imports + method2_source.imports:
        key = normalize_member_key(import_line)
        if key in seen_imports:
            continue
        seen_imports.add(key)
        imports.append(import_line)

    members: list[str] = []
    seen_members: set[str] = set()
    for member in method1_source.members + method2_source.members:
        key = normalize_member_key(member)
        if key in seen_members:
            continue
        seen_members.add(key)
        members.append(member)

    method_blocks: list[str] = []
    for test in method1_source.tests:
        body = transformed_body(test.body, "method1", "method2")
        method_blocks.append("\n".join([
            f"    private void crossFromMethod1_{test.name}() throws Throwable {{",
            textwrap.indent(body, "        "),
            "    }",
        ]))
    for test in method2_source.tests:
        body = transformed_body(test.body, "method2", "method1")
        method_blocks.append("\n".join([
            f"    private void crossFromMethod2_{test.name}() throws Throwable {{",
            textwrap.indent(body, "        "),
            "    }",
        ]))

    lines = [f"package {PACKAGE_NAME};", ""]
    if imports:
        lines.extend(imports)
        lines.append("")
    lines.extend([
        f"public class {runner_name} {{",
        "",
    ])
    if members:
        lines.append(textwrap.indent("\n\n".join(members), ""))
        lines.append("")
    if method_blocks:
        lines.append("\n\n".join(method_blocks))
        lines.append("")
    lines.extend([
        "    static void recordFailure(String label, Throwable throwable) {",
        '        String message = throwable.getMessage() == null ? "" : throwable.getMessage().replace("\\r", "\\\\r").replace("\\n", "\\\\n").replace("\\t", "\\\\t");',
        '        System.err.println(label + "\\t" + throwable.getClass().getName() + "\\t" + message);',
        "    }",
        "",
        "    public static void main(String[] args) {",
        f"        {runner_name} runner = new {runner_name}();",
        f"        int method1TestCount = {len(method1_source.tests)};",
        f"        int method2TestCount = {len(method2_source.tests)};",
        "        int method1TestsSuccessOnMethod2 = 0;",
        "        int method2TestsSuccessOnMethod1 = 0;",
    ])
    for test in method1_source.tests:
        lines.append(case_block(
            runner_name,
            "method1TestsSuccessOnMethod2",
            f"{test.name}->method2",
            f"crossFromMethod1_{test.name}",
        ))
    for test in method2_source.tests:
        lines.append(case_block(
            runner_name,
            "method2TestsSuccessOnMethod1",
            f"{test.name}->method1",
            f"crossFromMethod2_{test.name}",
        ))
    lines.extend([
        "        boolean allCrossTestsSucceeded = method1TestsSuccessOnMethod2 == method1TestCount",
        "                && method2TestsSuccessOnMethod1 == method2TestCount;",
        '        System.out.println(method1TestCount + "\\t" + method2TestCount + "\\t"',
        '                + method1TestsSuccessOnMethod2 + "\\t" + method2TestsSuccessOnMethod1 + "\\t" + allCrossTestsSucceeded);',
        "    }",
        "}",
        "",
    ])
    return "\n".join(lines)


def runtime_classpath() -> str:
    return os.pathsep.join([
        str((ROOT / "build" / "classes" / "java" / "main").resolve()),
        str((ROOT / "build" / "classes" / "java" / "test").resolve()),
        gen.junit_classpath(),
    ])


def parse_runner_stdout(stdout: str) -> tuple[int, int, int, int, bool]:
    lines = [line.strip() for line in stdout.splitlines() if line.strip()]
    if not lines:
        raise RuntimeError("runner produced no stdout")
    parts = lines[-1].split("\t")
    if len(parts) != 5:
        raise RuntimeError(f"unexpected runner output: {lines[-1]}")
    return (
        int(parts[0]),
        int(parts[1]),
        int(parts[2]),
        int(parts[3]),
        parts[4].lower() == "true",
    )


def process_class(class_id: int, classpath: str, timeout_seconds: float) -> ClassResult:
    method1_path = ROOT / "src" / "test" / "java" / PACKAGE_NAME / f"ClonePair{class_id}Method1Test.java"
    method2_path = ROOT / "src" / "test" / "java" / PACKAGE_NAME / f"ClonePair{class_id}Method2Test.java"
    method1_source = extract_test_source(method1_path)
    method2_source = extract_test_source(method2_path)
    runner_source = build_runner_source(class_id, method1_source, method2_source)

    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-cross-") as temp_dir_name:
        temp_dir = Path(temp_dir_name)
        package_dir = temp_dir / PACKAGE_NAME
        package_dir.mkdir(parents=True, exist_ok=True)
        runner_path = package_dir / f"ClonePair{class_id}CrossGeneratedTestRunner.java"
        runner_path.write_text(runner_source, encoding="utf-8")

        try:
            compile_result = subprocess.run(
                ["javac", *JAVAC_MEMORY_ARGS, "-encoding", "UTF-8", "-d", str(temp_dir), "-cp", classpath, str(runner_path)],
                cwd=ROOT,
                capture_output=True,
                text=True,
                timeout=timeout_seconds,
            )
        except subprocess.TimeoutExpired:
            return ClassResult(
                class_id=class_id,
                method1_test_count=len(method1_source.tests),
                method2_test_count=len(method2_source.tests),
                method1_tests_success_on_method2=0,
                method2_tests_success_on_method1=0,
                all_cross_tests_succeeded=False,
                status="compile_timeout",
                detail=f"compilation exceeded {timeout_seconds} seconds",
            )
        if compile_result.returncode != 0:
            detail = (compile_result.stderr.strip() or compile_result.stdout.strip() or "javac failed").replace("\n", " ")[:400]
            return ClassResult(
                class_id=class_id,
                method1_test_count=len(method1_source.tests),
                method2_test_count=len(method2_source.tests),
                method1_tests_success_on_method2=0,
                method2_tests_success_on_method1=0,
                all_cross_tests_succeeded=False,
                status="compile_error",
                detail=detail,
            )

        run_classpath = os.pathsep.join([str(temp_dir), classpath])
        try:
            run_result = subprocess.run(
                ["java", *JAVA_MEMORY_ARGS, "-ea", "-cp", run_classpath, f"{PACKAGE_NAME}.ClonePair{class_id}CrossGeneratedTestRunner"],
                cwd=ROOT,
                capture_output=True,
                text=True,
                timeout=timeout_seconds,
            )
        except subprocess.TimeoutExpired:
            return ClassResult(
                class_id=class_id,
                method1_test_count=len(method1_source.tests),
                method2_test_count=len(method2_source.tests),
                method1_tests_success_on_method2=0,
                method2_tests_success_on_method1=0,
                all_cross_tests_succeeded=False,
                status="run_timeout",
                detail=f"execution exceeded {timeout_seconds} seconds",
            )
        if run_result.returncode != 0:
            detail = (run_result.stderr.strip() or run_result.stdout.strip() or "java failed").replace("\n", " ")[:400]
            return ClassResult(
                class_id=class_id,
                method1_test_count=len(method1_source.tests),
                method2_test_count=len(method2_source.tests),
                method1_tests_success_on_method2=0,
                method2_tests_success_on_method1=0,
                all_cross_tests_succeeded=False,
                status="run_error",
                detail=detail,
            )

        try:
            method1_count, method2_count, method1_success, method2_success, all_cross = parse_runner_stdout(run_result.stdout)
        except Exception as exception:  # noqa: BLE001
            detail = f"{exception}".replace("\n", " ")[:400]
            return ClassResult(
                class_id=class_id,
                method1_test_count=len(method1_tests),
                method2_test_count=len(method2_tests),
                method1_tests_success_on_method2=0,
                method2_tests_success_on_method1=0,
                all_cross_tests_succeeded=False,
                status="parse_error",
                detail=detail,
            )

        detail = run_result.stderr.strip().replace("\n", " ")[:400]
        return ClassResult(
            class_id=class_id,
            method1_test_count=method1_count,
            method2_test_count=method2_count,
            method1_tests_success_on_method2=method1_success,
            method2_tests_success_on_method1=method2_success,
            all_cross_tests_succeeded=all_cross,
            status="ok",
            detail=detail,
        )


def main() -> int:
    args = parse_args()
    global PACKAGE_NAME
    PACKAGE_NAME = args.package_name
    if args.csv_path is None:
        args.csv_path = ROOT / "logs" / f"{PACKAGE_NAME}_cross_generated_tests.csv"
    args.csv_path.parent.mkdir(parents=True, exist_ok=True)

    if args.class_id is not None:
        result = process_class(args.class_id, runtime_classpath(), args.timeout_seconds)
        print(json.dumps({
            "class_id": result.class_id,
            "method1_test_count": result.method1_test_count,
            "method2_test_count": result.method2_test_count,
            "method1_tests_success_on_method2": result.method1_tests_success_on_method2,
            "method2_tests_success_on_method1": result.method2_tests_success_on_method1,
            "all_cross_tests_succeeded": result.all_cross_tests_succeeded,
            "status": result.status,
            "detail": result.detail,
        }, ensure_ascii=False))
        return 0

    class_ids = target_ids(args)
    if not class_ids:
        print("No target classes.")
        return 0

    subprocess.run([GRADLEW, "testClasses"], cwd=ROOT, check=True, timeout=3600)
    classpath = runtime_classpath()

    existing_results = read_existing_results(args.csv_path) if args.resume else {}
    remaining_ids = [class_id for class_id in class_ids if class_id not in existing_results]
    csv_mode = "a" if args.resume and args.csv_path.exists() else "w"

    with args.csv_path.open(csv_mode, encoding="utf-8", newline="") as csv_file:
        writer = csv.writer(csv_file)
        if csv_mode == "w":
            writer.writerow(CSV_HEADER)
        with concurrent.futures.ThreadPoolExecutor(max_workers=args.workers) as executor:
            future_map = {
                executor.submit(run_class_subprocess, class_id, args.timeout_seconds): class_id
                for class_id in remaining_ids
            }
            completed = len(existing_results)
            total = len(class_ids)
            if completed:
                print(f"resuming_from={completed}", flush=True)
            for future in concurrent.futures.as_completed(future_map):
                result = future.result()
                existing_results[result.class_id] = result
                write_result_row(writer, result)
                csv_file.flush()
                completed += 1
                print(f"[{completed}/{total}] ClonePair{result.class_id}: {result.status}", flush=True)

    results = sorted(existing_results.values(), key=lambda result: result.class_id)
    with args.csv_path.open("w", encoding="utf-8", newline="") as csv_file:
        writer = csv.writer(csv_file)
        writer.writerow(CSV_HEADER)
        for result in results:
            write_result_row(writer, result)

    failed = sum(1 for result in results if result.status != "ok" or not result.all_cross_tests_succeeded)
    print(f"classes={len(results)}")
    print(f"cross_failures={failed}")
    return 0 if failed == 0 else 1


if __name__ == "__main__":
    raise SystemExit(main())
