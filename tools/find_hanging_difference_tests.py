#!/usr/bin/env python3

from __future__ import annotations

import argparse
import concurrent.futures
import subprocess
import tempfile
from dataclasses import dataclass
from pathlib import Path

import generate_clonepair_tests as gen


ROOT = Path(__file__).resolve().parents[1]
GRADLEW = "gradlew.bat"

RUNNER_SOURCE = """
public class SingleDifferenceTestRunner {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("expected fully-qualified test class name");
        }

        Class<?> testClass = Class.forName(args[0]);
        java.lang.reflect.Constructor<?> constructor = testClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();
        int invoked = 0;
        for (java.lang.reflect.Method method : testClass.getDeclaredMethods()) {
            if (method.isSynthetic() || method.getParameterCount() != 0 || method.getReturnType() != void.class) {
                continue;
            }
            method.setAccessible(true);
            invoked++;
            method.invoke(instance);
        }
        if (invoked == 0) {
            throw new IllegalStateException("no zero-argument void methods found in " + args[0]);
        }
    }
}
""".strip()


@dataclass(frozen=True)
class TestOutcome:
    class_name: str
    package_name: str
    status: str
    detail: str


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--packages", nargs="+", default=["all", "equivalent", "inequivalent"])
    parser.add_argument("--timeout-seconds", type=float, default=10.0)
    parser.add_argument("--workers", type=int, default=6)
    parser.add_argument("--include-unverified", action="store_true")
    return parser.parse_args()


def test_class_names(package_name: str) -> list[str]:
    test_dir = ROOT / "src" / "test" / "java" / package_name
    if not test_dir.exists():
        return []
    return sorted(
        f"{package_name}.{path.stem}"
        for path in test_dir.glob("ClonePair*DifferenceTest.java")
        if path.name != "ClonePairDifferenceTestSupport.java"
    )


def junit_runtime_classpath() -> str:
    return gen.junit_classpath()


def compile_runner(temp_dir: Path) -> Path:
    runner_path = temp_dir / "SingleDifferenceTestRunner.java"
    runner_path.write_text(RUNNER_SOURCE, encoding="utf-8")
    compile_result = subprocess.run(
        ["javac", "-d", str(temp_dir), str(runner_path)],
        cwd=ROOT,
        capture_output=True,
        text=True,
        timeout=120,
    )
    if compile_result.returncode != 0:
        raise RuntimeError(f"failed to compile runner\n{compile_result.stdout}\n{compile_result.stderr}")
    return temp_dir


def runtime_classpath(runner_dir: Path) -> str:
    entries = [
        str(runner_dir),
        str(ROOT / "build" / "classes" / "java" / "main"),
        str(ROOT / "build" / "classes" / "java" / "test"),
        str(ROOT / "build" / "resources" / "main"),
        str(ROOT / "build" / "resources" / "test"),
        junit_runtime_classpath(),
    ]
    return ";".join(entry for entry in entries if entry)


def run_one(class_name: str, classpath: str, timeout_seconds: float) -> TestOutcome:
    package_name = class_name.split(".", 1)[0]
    try:
        completed = subprocess.run(
            ["java", "-ea", "-cp", classpath, "SingleDifferenceTestRunner", class_name],
            cwd=ROOT,
            capture_output=True,
            text=True,
            timeout=timeout_seconds,
        )
    except subprocess.TimeoutExpired:
        return TestOutcome(class_name, package_name, "timeout", f"exceeded {timeout_seconds} seconds")

    if completed.returncode == 0:
        return TestOutcome(class_name, package_name, "ok", "")

    detail = (completed.stderr.strip() or completed.stdout.strip() or f"exit={completed.returncode}").replace("\n", " ")
    return TestOutcome(class_name, package_name, "failed", detail[:500])


def main() -> int:
    args = parse_args()
    packages = list(args.packages)
    if args.include_unverified and "unverified" not in packages:
        packages.append("unverified")

    class_names: list[str] = []
    for package_name in packages:
        class_names.extend(test_class_names(package_name))

    if not class_names:
        print("No difference tests found.")
        return 0

    subprocess.run([GRADLEW, "testClasses"], cwd=ROOT, check=True, timeout=3600)

    with tempfile.TemporaryDirectory(prefix="difference-test-runner-") as temp_dir_name:
        runner_dir = compile_runner(Path(temp_dir_name))
        classpath = runtime_classpath(runner_dir)

        outcomes: list[TestOutcome] = []
        with concurrent.futures.ThreadPoolExecutor(max_workers=args.workers) as executor:
            future_map = {
                executor.submit(run_one, class_name, classpath, args.timeout_seconds): class_name
                for class_name in class_names
            }
            for future in concurrent.futures.as_completed(future_map):
                outcomes.append(future.result())

    timeouts = sorted((outcome for outcome in outcomes if outcome.status == "timeout"), key=lambda outcome: outcome.class_name)
    failures = sorted((outcome for outcome in outcomes if outcome.status == "failed"), key=lambda outcome: outcome.class_name)

    print(f"checked={len(outcomes)}")
    print(f"timeouts={len(timeouts)}")
    for outcome in timeouts:
        print(f"TIMEOUT {outcome.class_name}: {outcome.detail}")
    print(f"failures={len(failures)}")
    for outcome in failures[:50]:
        print(f"FAILED {outcome.class_name}: {outcome.detail}")
    if len(failures) > 50:
        print(f"... {len(failures) - 50} more failures omitted")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
