#!/opt/homebrew/bin/python3

from __future__ import annotations

import argparse
import itertools
import os
import re
import subprocess
import sys
import tempfile
from dataclasses import dataclass
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
GRADLE_USER_HOME = os.environ.get("GRADLE_USER_HOME", str(Path.home() / ".gradle"))


@dataclass(frozen=True)
class Param:
    declared_type: str
    name: str
    effective_type: str
    aliases: tuple[str, ...]


@dataclass(frozen=True)
class MethodInfo:
    declared_return_type: str
    name: str
    params: tuple[Param, ...]
    body: str


@dataclass(frozen=True)
class OracleResult:
    status: str
    category: str
    payload: str


@dataclass(frozen=True)
class SelectedCase:
    args: tuple[str, ...]
    result: OracleResult


METHOD_PATTERN = re.compile(r"\n\s*([^\n]+?)\s+(method[12])\(([^)]*)\)\s*\{", re.M)
ARRAY_LENGTH_PATTERN = re.compile(r"(\w+)\.length\s*(==|!=|<=|>=|<|>)\s*(\d+)")
CAST_ASSIGNMENT_TEMPLATE = r"{type_name}\s+(\w+)\s*=\s*\({type_name}\)\s*{param_name}\b"


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser()
    parser.add_argument("--start-id", type=int, default=3001)
    parser.add_argument("--end-id", type=int, default=6000)
    parser.add_argument("--limit", type=int, default=None)
    parser.add_argument("--ids", type=str, default=None)
    parser.add_argument("--package-name", type=str, default="inequivalent")
    parser.add_argument("--include-existing", action="store_true")
    parser.add_argument("--verify-before-write", action="store_true")
    return parser.parse_args()


def read_text_with_fallback(path: Path) -> str:
    for encoding in ("utf-8", "cp932", "utf-8-sig"):
        try:
            return path.read_text(encoding=encoding)
        except UnicodeDecodeError:
            continue
    return path.read_text(encoding="utf-8", errors="ignore")


def main_dir(package_name: str) -> Path:
    return ROOT / "src" / "main" / "java" / package_name


def test_dir(package_name: str) -> Path:
    return ROOT / "src" / "test" / "java" / package_name


def java_string(value: str) -> str:
    return '"' + value.replace("\\", "\\\\").replace('"', '\\"').replace("\n", "\\n").replace("\t", "\\t") + '"'


def java_char(value: str) -> str:
    escapes = {"\\": "\\\\", "'": "\\'", "\n": "\\n", "\t": "\\t", "\0": "\\0"}
    return "'" + escapes.get(value, value) + "'"


def dedupe_preserve(items: list[str]) -> list[str]:
    seen: set[str] = set()
    result: list[str] = []
    for item in items:
        if item not in seen:
            seen.add(item)
            result.append(item)
    return result


def split_params(params_source: str) -> list[tuple[str, str]]:
    params_source = params_source.strip()
    if not params_source:
        return []
    parts: list[str] = []
    current: list[str] = []
    generic_depth = 0
    for char in params_source:
        if char == "<":
            generic_depth += 1
        elif char == ">":
            generic_depth -= 1
        elif char == "," and generic_depth == 0:
            parts.append("".join(current).strip())
            current = []
            continue
        current.append(char)
    if current:
        parts.append("".join(current).strip())
    result: list[tuple[str, str]] = []
    for part in parts:
        param_type, param_name = part.rsplit(" ", 1)
        result.append((param_type.strip(), param_name.strip()))
    return result


def find_matching_brace(text: str, open_index: int) -> int:
    depth = 0
    in_string = False
    in_char = False
    in_line_comment = False
    in_block_comment = False
    escaped = False
    for index in range(open_index, len(text)):
        char = text[index]
        next_char = text[index + 1] if index + 1 < len(text) else ""
        if in_line_comment:
            if char == "\n":
                in_line_comment = False
            continue
        if in_block_comment:
            if char == "*" and next_char == "/":
                in_block_comment = False
            continue
        if in_string:
            if escaped:
                escaped = False
            elif char == "\\":
                escaped = True
            elif char == '"':
                in_string = False
            continue
        if in_char:
            if escaped:
                escaped = False
            elif char == "\\":
                escaped = True
            elif char == "'":
                in_char = False
            continue
        if char == "/" and next_char == "/":
            in_line_comment = True
            continue
        if char == "/" and next_char == "*":
            in_block_comment = True
            continue
        if char == '"':
            in_string = True
            continue
        if char == "'":
            in_char = True
            continue
        if char == "{":
            depth += 1
        elif char == "}":
            depth -= 1
            if depth == 0:
                return index
    raise ValueError("Unmatched brace")


def parse_class(package_name: str, class_id: int) -> dict[str, MethodInfo]:
    path = main_dir(package_name) / f"ClonePair{class_id}.java"
    text = read_text_with_fallback(path)
    methods: dict[str, MethodInfo] = {}
    for match in METHOD_PATTERN.finditer(text):
        return_type, method_name, params_source = match.groups()
        open_index = text.find("{", match.end() - 1)
        close_index = find_matching_brace(text, open_index)
        body = text[open_index + 1:close_index]
        params = []
        for declared_type, param_name in split_params(params_source):
            while param_name.endswith("[]"):
                param_name = param_name[:-2].strip()
                declared_type += "[]"
            declared_type = normalized_type_name(declared_type)
            effective_type = infer_effective_type(body, declared_type, param_name)
            effective_type = normalized_type_name(effective_type)
            aliases = infer_aliases(body, effective_type, param_name)
            params.append(Param(declared_type, param_name, effective_type, aliases))
        methods[method_name] = MethodInfo(normalized_type_name(return_type), method_name, tuple(params), body)
    if set(methods) != {"method1", "method2"}:
        raise ValueError(f"Unexpected method set for ClonePair{class_id}: {sorted(methods)}")
    return methods


def infer_effective_type(body: str, declared_type: str, param_name: str) -> str:
    if declared_type != "Object":
        return declared_type
    cast_match = re.search(rf"\(([@\w$.\[\]<>?, ]+)\)\s*{re.escape(param_name)}\b", body)
    if cast_match:
        return normalized_type_name(cast_match.group(1))
    return declared_type


def infer_aliases(body: str, effective_type: str, param_name: str) -> tuple[str, ...]:
    escaped_type = re.escape(effective_type)
    escaped_param = re.escape(param_name)
    pattern = re.compile(CAST_ASSIGNMENT_TEMPLATE.format(type_name=escaped_type, param_name=escaped_param))
    aliases = [match.group(1) for match in pattern.finditer(body)]
    if effective_type == "String":
        for alias_pattern in (
            re.compile(rf"\bString\s+(\w+)\s*=\s*{escaped_param}\s*;"),
            re.compile(rf"\bString\s+(\w+)\s*=\s*{escaped_param}\.(?:toLowerCase|toUpperCase|trim)\(\)\s*;"),
        ):
            aliases.extend(match.group(1) for match in alias_pattern.finditer(body))
    if effective_type in {"int", "long", "short", "byte"}:
        direct_pattern = re.compile(rf"\b(?:int|long|short|byte)\s+(\w+)\s*=\s*{escaped_param}\s*;")
        aliases.extend(match.group(1) for match in direct_pattern.finditer(body))
    return tuple(dict.fromkeys(aliases))


def contains_any(body: str, snippets: tuple[str, ...]) -> bool:
    return any(snippet in body for snippet in snippets)


def parse_array_constraints(body: str, variable_names: tuple[str, ...]) -> tuple[list[int], dict[int, int]]:
    bounds: list[int] = []
    byte_values: dict[int, int] = {}
    for variable_name in variable_names:
        for match in ARRAY_LENGTH_PATTERN.finditer(body):
            if match.group(1) == variable_name:
                bounds.append(int(match.group(3)))

        for match in re.finditer(rf"{re.escape(variable_name)}\[(\d+)\]\s*==\s*(0x[0-9A-Fa-f]+|\d+)", body):
            index, value = match.groups()
            byte_values[int(index)] = int(value, 0) & 0xFF
        for match in re.finditer(rf"{re.escape(variable_name)}\[(\d+)\]\s*==\s*'(.)'", body):
            index, value = match.groups()
            byte_values[int(index)] = ord(value)
        for match in re.finditer(rf"(0x[0-9A-Fa-f]+|\d+)\s*==\s*\({re.escape(variable_name)}\[(\d+)\]\s*&\s*0xff\)", body):
            value, index = match.groups()
            byte_values[int(index)] = int(value, 0) & 0xFF
        for match in re.finditer(rf"'(.)'\s*==\s*{re.escape(variable_name)}\[(\d+)\]", body):
            value, index = match.groups()
            byte_values[int(index)] = ord(value)
    return bounds, byte_values


def default_string_pool(body: str, param_name: str) -> list[str]:
    values = ["null", '""']
    lower_name = param_name.lower()
    if "locale" in lower_name or contains_any(body, ("split(\"_\")", "new Locale", "charAt(2) != '_'", "indexOf('_')")):
        values.extend([java_string("ab"), java_string("ab_CD"), java_string("ab_CD_VAR"), java_string("_"), java_string("ab__VAR")])
    if "formula" in lower_name or contains_any(body, ("Double.parseDouble", "contains(\"+\")", "contains(\"/\")", "contains(\"*\")", "contains(\"r\")")):
        values.extend([java_string(""), java_string("1"), java_string("1.5"), java_string("1,5"), java_string(" 1.5 "), java_string("1+2"), java_string("8/2"), java_string("3*4"), java_string("5r2"), java_string("bad")])
    if contains_any(body, ("Integer.parseInt", "Long.parseLong")) and "16" in body:
        values.extend([java_string(""), java_string("0"), java_string("00"), java_string("0A"), java_string("7F"), java_string("80"), java_string("FF"), java_string("0A0B"), java_string("CAFEBE"), java_string("GG")])
    if contains_any(body, ("split(\":\")", "split(\"/\")", "split(\"\\\\.\")", "Calendar", "GregorianCalendar")):
        values.extend([java_string("2020/05/06:07.08"), java_string("20200506"), java_string("20010101"), java_string("991231"), java_string("bad")])
    if contains_any(body, ("StringTokenizer", "Properties")):
        values.extend([java_string("Key:\"Value\";Other:Two"), java_string("a=1|b=2"), java_string("broken"), java_string("")])
    if contains_any(body, ("indexOf('.')", "lastIndexOf('.')", "charAt(", ".contains(\".\")")):
        values.extend([java_string("a"), java_string("a.b"), java_string("a.b.c"), java_string("ab"), java_string("x/y")])
    if contains_any(body, ("trim()", "substring(", "indexOf(", "lastIndexOf(")) or "delim" in lower_name or "separator" in lower_name:
        values.extend([java_string("foo"), java_string("foo/bar"), java_string("foo.bar"), java_string("bar"), java_string("/")])
    if contains_any(body, ("toLowerCase", "compareToIgnoreCase")):
        values.extend([java_string("Alpha"), java_string("alpha"), java_string("BETA")])
    if "delim" in lower_name or "separator" in lower_name:
        values.extend([java_string("/"), java_string("."), java_string("_"), java_string("ab")])
    values.extend([java_string("a"), java_string("A"), java_string("abc"), java_string("ABC"), java_string("1"), java_string("-1"), java_string("true"), java_string("false")])
    return dedupe_preserve(values)


def byte_array_expr(values: list[int]) -> str:
    rendered = []
    for value in values:
        value &= 0xFF
        if value > 127:
            rendered.append(f"(byte) 0x{value:02X}")
        else:
            rendered.append(f"(byte) 0x{value:02X}" if value > 9 else str(value))
    return "new byte[]{" + ", ".join(rendered) + "}"


def array_expr(component_type: str, values: list[str]) -> str:
    return f"new {component_type}[]{{" + ", ".join(values) + "}"


def helper_list(name: str, *items: str) -> str:
    return f"{name}(" + ", ".join(items) + ")"


def normalized_type_name(type_name: str) -> str:
    type_name = type_name.strip()
    while type_name.startswith("@"):
        updated = re.sub(r"^@[\w$.]+(?:\([^()]*\))?\s*", "", type_name)
        if updated == type_name:
            break
        type_name = updated.strip()
    type_name = re.sub(r"\s+", " ", type_name)
    type_name = re.sub(r"\s*<\s*", "<", type_name)
    type_name = re.sub(r"\s*>\s*", ">", type_name)
    type_name = re.sub(r"\s*,\s*", ",", type_name)
    type_name = re.sub(r"\s*\[\s*\]", "[]", type_name)
    if type_name.endswith("..."):
        return type_name[:-3] + "[]"
    return type_name


def pool_for_param(param: Param, body: str) -> list[str]:
    type_name = normalized_type_name(param.effective_type)
    raw_type_name = re.sub(r"<.*>", "", type_name).strip()
    lower_name = param.name.lower()
    if type_name == "String":
        return default_string_pool(body, param.name)
    if type_name == "CharSequence":
        return default_string_pool(body, param.name)
    if type_name == "Object":
        return dedupe_preserve([
            "null",
            java_string("a"),
            java_string("A"),
            "Integer.valueOf(1)",
            "Double.valueOf(1.5)",
            "date(0L)",
            "sb(" + java_string("a") + ")",
        ])
    if type_name == "Comparable":
        return dedupe_preserve([
            "null",
            java_string("a"),
            java_string("A"),
            "Integer.valueOf(1)",
            "Double.valueOf(1.5)",
            "date(0L)",
        ])
    if type_name == "Integer":
        return ["null", "Integer.valueOf(-1)", "Integer.valueOf(0)", "Integer.valueOf(1)", "Integer.valueOf(2)", "Integer.valueOf(16)"]
    if type_name == "Short":
        return ["null", "Short.valueOf((short) -1)", "Short.valueOf((short) 0)", "Short.valueOf((short) 1)", "Short.valueOf((short) 8)", "Short.valueOf((short) 16)"]
    if type_name == "Byte":
        return ["null", "Byte.valueOf((byte) -1)", "Byte.valueOf((byte) 0)", "Byte.valueOf((byte) 1)", "Byte.valueOf((byte) 8)", "Byte.valueOf((byte) 16)"]
    if type_name == "Double":
        return ["null", "Double.valueOf(-1.0)", "Double.valueOf(0.0)", "Double.valueOf(1.0)", "Double.valueOf(1.5)", "Double.valueOf(Double.NaN)"]
    if type_name == "Float":
        return ["null", "Float.valueOf(-1.0f)", "Float.valueOf(0.0f)", "Float.valueOf(1.0f)", "Float.valueOf(1.5f)", "Float.valueOf(Float.NaN)"]
    if type_name == "Number":
        return dedupe_preserve([
            "null",
            "Integer.valueOf(-1)",
            "Integer.valueOf(0)",
            "Integer.valueOf(1)",
            "Double.valueOf(1.5)",
            "Double.valueOf(-2.0)",
        ])
    if type_name == "Boolean":
        return ["null", "Boolean.FALSE", "Boolean.TRUE"]
    if type_name == "int":
        values = ["-1", "0", "1", "2", "3", "4", "7", "8", "15", "16"]
        if any(token in lower_name for token in ("size", "length", "len", "index", "offset", "count")):
            values.extend(["31", "32", "63", "64"])
        return dedupe_preserve(values)
    if type_name == "long":
        return ["-1L", "0L", "1L", "2L", "16L", "255L"]
    if type_name == "short":
        return ["(short) -1", "(short) 0", "(short) 1", "(short) 8", "(short) 16"]
    if type_name == "Long":
        return ["null", "Long.valueOf(-1L)", "Long.valueOf(0L)", "Long.valueOf(1L)", "Long.valueOf(255L)", "Long.valueOf(256L)"]
    if type_name == "double":
        return ["-1.0", "0.0", "0.5", "1.0", "2.0", "3.5", "Double.NaN"]
    if type_name == "float":
        return ["-1.0f", "0.0f", "0.5f", "1.0f", "2.0f", "Float.NaN"]
    if type_name == "boolean":
        return ["false", "true"]
    if type_name == "char":
        return [java_char("\0"), java_char("a"), java_char("A"), java_char("."), java_char("/"), java_char("0"), java_char("x")]
    if type_name == "byte":
        return ["(byte) -1", "(byte) 0", "(byte) 1", "(byte) 16", "(byte) 0x7F", "(byte) 0xFF"]
    if type_name == "byte[]":
        bounds, matches = parse_array_constraints(body, (param.name,) + param.aliases)
        expressions = [
            "null",
            "new byte[]{}",
            byte_array_expr([0]),
            byte_array_expr([0, 1, 2]),
            byte_array_expr([1, 2, 3, 4]),
            byte_array_expr(list(range(8))),
            byte_array_expr(list(range(16))),
            byte_array_expr(list(range(32))),
            byte_array_expr(list(range(64))),
        ]
        for bound in sorted(set(bounds)):
            if bound > 0:
                expressions.append(byte_array_expr([0] * (bound - 1)))
            expressions.append(byte_array_expr([0] * bound))
            expressions.append(byte_array_expr([0] * (bound + 1)))
        if matches:
            size = max(max(matches) + 1, max(bounds, default=0))
            if size == 0:
                size = 4
            matched = [0] * size
            for index, value in matches.items():
                if index >= len(matched):
                    matched.extend([0] * (index + 1 - len(matched)))
                matched[index] = value
            expressions.append(byte_array_expr(matched))
            mismatched = matched[:]
            first_index = min(matches)
            mismatched[first_index] = (mismatched[first_index] + 1) & 0xFF
            expressions.append(byte_array_expr(mismatched))
        return dedupe_preserve(expressions)
    if type_name == "double[]":
        return dedupe_preserve(["null", "new double[]{}", "new double[]{0.0}", "new double[]{1.0}", "new double[]{1.0, 2.0}", "new double[]{-1.0, 0.0, 1.0}"])
    if type_name == "double[][]":
        return dedupe_preserve(["null", "d2()", "d2(new double[]{0.0})", "d2(new double[]{1.0, 2.0}, new double[]{3.0, 4.0})"])
    if type_name == "float[]":
        return dedupe_preserve(["null", "new float[]{}", "new float[]{0.0f}", "new float[]{1.0f}", "new float[]{1.0f, 2.0f}"])
    if type_name == "float[][]":
        return dedupe_preserve(["null", "f2()", "f2(new float[]{0.0f})", "f2(new float[]{1.0f, 2.0f}, new float[]{3.0f})"])
    if type_name == "int[]":
        return dedupe_preserve(["null", "new int[]{}", "new int[]{0}", "new int[]{1}", "new int[]{1, 2}", "new int[]{-1, 0, 1}"])
    if type_name == "int[][]":
        return dedupe_preserve(["null", "i2()", "i2(new int[]{0})", "i2(new int[]{1, 2}, new int[]{3})"])
    if type_name == "int[][][]":
        return dedupe_preserve(["null", "i3()", "i3(i2(new int[]{0}))", "i3(i2(new int[]{1, 2}), i2(new int[]{3, 4}))"])
    if type_name == "long[]":
        return dedupe_preserve(["null", "new long[]{}", "new long[]{0L}", "new long[]{1L, 2L}"])
    if type_name == "long[][]":
        return dedupe_preserve([
            "null",
            "new long[][]{}",
            "longMatrix(10, 16)",
            "longMatrixSequential(10, 16)",
            "longMatrix(9, 16)",
            "longMatrix(10, 15)",
        ])
    if type_name == "short[]":
        return dedupe_preserve(["null", "new short[]{}", "new short[]{0}", "new short[]{1, 2}", "new short[]{-1, 0, 1}"])
    if type_name == "char[]":
        return dedupe_preserve(["null", "new char[]{}", array_expr("char", [java_char("a")]), array_expr("char", [java_char("a"), java_char(".")]), array_expr("char", [java_char("A"), java_char("B"), java_char("C")])])
    if type_name == "char[][]":
        return dedupe_preserve([
            "null",
            "new char[][]{}",
            "new char[][]{new char[]{}}",
            "new char[][]{new char[]{'a'}}",
            "new char[][]{new char[]{'a', 'b'}, new char[]{'c'}}",
        ])
    if type_name == "CharSequence[]":
        return dedupe_preserve([
            "null",
            "new CharSequence[]{}",
            "new CharSequence[]{" + java_string("a") + "}",
            "new CharSequence[]{" + java_string("a") + ", " + java_string("bc") + "}",
            "new CharSequence[]{" + java_string("a") + ", null}",
        ])
    if type_name == "String[]":
        if "System.exit" in body and "charAt(" in body:
            return dedupe_preserve([
                "null",
                "new String[]{}",
                "new String[]{\"A\"}",
                "new String[]{\"AC\", \"GT\"}",
                "new String[]{\"AAAA\", \"CCCC\"}",
                "new String[]{\"X\"}",
                "new String[]{\"A\", null}",
            ])
        return dedupe_preserve(["null", "new String[]{}", "new String[]{" + java_string("a") + "}", "new String[]{" + java_string("a") + ", " + java_string("b") + "}", "new String[]{" + java_string("a") + ", null}"])
    if type_name == "boolean[]":
        return dedupe_preserve(["null", "new boolean[]{}", "new boolean[]{true}", "new boolean[]{false, true}"])
    if type_name == "Object[]":
        return dedupe_preserve([
            "null",
            "new Object[]{}",
            "new Object[]{" + java_string("a") + "}",
            "new Object[]{null}",
            "new Object[]{" + java_string("a") + ", Integer.valueOf(1)}",
            "new Object[]{null, Integer.valueOf(1)}",
        ])
    if type_name == "Number[]":
        return dedupe_preserve(["null", "new Number[]{}", "new Number[]{Integer.valueOf(1)}", "new Number[]{Integer.valueOf(1), Double.valueOf(2.0)}", "new Number[]{Double.valueOf(1.5), Long.valueOf(2L), Integer.valueOf(3)}"])
    if type_name == "Class[]":
        return dedupe_preserve(["null", "new Class[]{}", "new Class[]{String.class}", "new Class[]{String.class, Integer.class}", "new Class[]{int.class, double.class}"])
    if type_name == "StackTraceElement[]":
        return dedupe_preserve([
            "null",
            "new StackTraceElement[]{}",
            'new StackTraceElement[]{new StackTraceElement("A", "m1", "A.java", 10)}',
            'new StackTraceElement[]{new StackTraceElement("A", "m1", "A.java", 10), new StackTraceElement("B", "m2", "B.java", 20)}',
        ])
    if type_name == "byte[][][]":
        return dedupe_preserve([
            "null",
            "new byte[][][]{}",
            "b3(new byte[][]{new byte[]{0}})",
            "b3(new byte[][]{new byte[]{1}}, new byte[][]{new byte[]{2}}, new byte[][]{new byte[]{3}}, new byte[][]{new byte[]{4}}, new byte[][]{new byte[]{5}})",
            "b3(new byte[][]{new byte[]{1, 2}, new byte[]{3, 4}}, new byte[][]{new byte[]{5, 6}, new byte[]{7, 8}}, new byte[][]{new byte[]{9, 10}, new byte[]{11, 12}}, new byte[][]{new byte[]{13, 14}, new byte[]{15, 16}}, new byte[][]{new byte[]{17, 18}, new byte[]{19, 20}})",
        ])
    if type_name == "Date":
        return ["null", "date(0L)", "date(86_400_000L)", "date(-86_400_000L)"]
    if type_name == "Calendar":
        return ["null", "calendar(0L)", "calendar(86_400_000L)", "calendar(1_000_000_000L)"]
    if type_name == "GregorianCalendar":
        return [
            "null",
            "new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone(\"UTC\"))",
            "new java.util.GregorianCalendar(2020, java.util.Calendar.JANUARY, 2)",
            "new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone(\"Asia/Tokyo\"))",
        ]
    if type_name == "Locale":
        return ["null", 'locale("en", "US", "")', 'locale("ja", "JP", "")', 'locale("fr", "CA", "POSIX")']
    if type_name == "TimeZone":
        return [
            "null",
            'java.util.TimeZone.getTimeZone("UTC")',
            'java.util.TimeZone.getTimeZone("Asia/Tokyo")',
            'java.util.TimeZone.getTimeZone("America/Los_Angeles")',
        ]
    if type_name == "List":
        return ["null", "list()", "list(" + java_string("alpha") + ")", "list(" + java_string("alpha") + ", " + java_string("beta") + ")", "list(" + java_string("beta") + ", " + java_string("gamma") + ")"]
    if type_name == "List<String>" or type_name == "Collection<String>":
        return ["null", "list()", "list(" + java_string("alpha") + ")", "list(" + java_string("alpha") + ", " + java_string("beta") + ")", "list(" + java_string("beta") + ", " + java_string("gamma") + ")"]
    if type_name == "List<Double>":
        return ["null", "list()", "list(Double.valueOf(1.0))", "list(Double.valueOf(1.0), Double.valueOf(2.0))", "list(Double.valueOf(-1.0), Double.valueOf(0.0), Double.valueOf(1.0))"]
    if type_name == "List<Integer>" or type_name == "Collection<Integer>":
        return [
            "null",
            "list()",
            "list(Integer.valueOf(0))",
            "list(Integer.valueOf(1), Integer.valueOf(2))",
            "list(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2))",
            "list(Integer.valueOf(-1), Integer.valueOf(0), Integer.valueOf(1))",
        ]
    if type_name == "List<HashMap<String,Object>>":
        return [
            "null",
            "list()",
            "list(hashMap(" + java_string("a") + ", Integer.valueOf(1)))",
            "list(hashMap(" + java_string("a") + ", Integer.valueOf(1), " + java_string("b") + ", " + java_string("two") + "))",
            "list(hashMap(" + java_string("x") + ", Double.valueOf(1.5)), hashMap(" + java_string("y") + ", Boolean.TRUE))",
        ]
    if type_name == "List<Object>":
        return ["null", "list()", "list(Integer.valueOf(1))", "list(Integer.valueOf(1), Integer.valueOf(2))", "list(Double.valueOf(1.5), Integer.valueOf(2))", "list(null, Integer.valueOf(2))"]
    if type_name == "ArrayList":
        return ["null", "list()", "list(" + java_string("alpha") + ")", "list(" + java_string("alpha") + ", " + java_string("beta") + ")", "list(" + java_string("beta") + ", " + java_string("gamma") + ")"]
    if type_name == "ArrayList<String>":
        return ["null", "list()", "list(" + java_string("alpha") + ")", "list(" + java_string("alpha") + ", " + java_string("beta") + ")", "list(" + java_string("beta") + ", " + java_string("gamma") + ")"]
    if type_name == "ArrayList<Double>":
        return ["null", "list()", "list(Double.valueOf(1.0))", "list(Double.valueOf(1.0), Double.valueOf(2.0))", "list(Double.valueOf(-1.0), Double.valueOf(0.0), Double.valueOf(1.0))"]
    if type_name == "ArrayList<Integer>":
        return [
            "null",
            "list()",
            "list(Integer.valueOf(0))",
            "list(Integer.valueOf(1), Integer.valueOf(2))",
            "list(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2))",
            "list(Integer.valueOf(-1), Integer.valueOf(0), Integer.valueOf(1))",
        ]
    if type_name == "ArrayList<Object>":
        return ["null", "list()", "list(Integer.valueOf(1))", "list(Integer.valueOf(1), Integer.valueOf(2))", "list(Double.valueOf(1.5), Integer.valueOf(2))", "list(null, Integer.valueOf(2))"]
    if type_name == "Collection":
        return ["null", "list()", "list(" + java_string("alpha") + ")", "list(" + java_string("alpha") + ", " + java_string("beta") + ")"]
    if type_name == "Iterable":
        return ["null", "list()", "list(" + java_string("alpha") + ")", "list(" + java_string("alpha") + ", " + java_string("beta") + ")"]
    if type_name == "Vector":
        return ["null", "vector()", "vector(" + java_string("alpha") + ")", "vector(" + java_string("alpha") + ", " + java_string("beta") + ")", "vector(" + java_string("beta") + ", " + java_string("gamma") + ")"]
    if type_name == "Vector<Double>":
        return ["null", "vectorOfDoubles()", "vectorOfDoubles(1.0)", "vectorOfDoubles(1.0, 2.0)", "vectorOfDoubles(-1.0, 0.0, 1.0)"]
    if type_name == "Vector<String>":
        return ["null", "vectorOfStrings()", "vectorOfStrings(" + java_string("alpha") + ")", "vectorOfStrings(" + java_string("alpha") + ", " + java_string("beta") + ")"]
    if type_name == "Enumeration":
        return [
            "null",
            "enumeration()",
            "enumeration(" + java_string("alpha") + ")",
            "enumeration(" + java_string("alpha") + ", " + java_string("beta") + ")",
        ]
    if type_name == "Set<String>":
        return ["null", "stringSet()", "stringSet(" + java_string("alpha") + ")", "stringSet(" + java_string("alpha") + ", " + java_string("beta") + ")"]
    if type_name == "Set" or raw_type_name == "Set":
        return [
            "null",
            "linkedSet()",
            "linkedSet(" + java_string("alpha") + ")",
            "linkedSet(" + java_string("alpha") + ", " + java_string("beta") + ")",
            "linkedSet(" + java_string("beta") + ", " + java_string("gamma") + ")",
        ]
    if type_name == "StringBuffer":
        return ["null", "sb(" + java_string("") + ")", "sb(" + java_string("a") + ")", "sb(" + java_string("abc") + ")"]
    if type_name == "StringBuilder":
        return [
            "null",
            "new StringBuilder(" + java_string("") + ")",
            "new StringBuilder(" + java_string("a") + ")",
            "new StringBuilder(" + java_string("abc") + ")",
            "new StringBuilder(" + java_string("suffix") + ")",
        ]
    if type_name == "Hashtable":
        return ["null", "hashtable()", "hashtable(" + java_string("a") + ", " + java_string("1") + ")", "hashtable(" + java_string("a") + ", " + java_string("1") + ", " + java_string("b") + ", " + java_string("2") + ")"]
    if type_name == "Map":
        return ["null", "map()", "map(" + java_string("a") + ", " + java_string("1") + ")", "map(" + java_string("a") + ", " + java_string("1") + ", " + java_string("b") + ", " + java_string("2") + ")"]
    if type_name == "HashMap":
        return ["null", "hashMap()", "hashMap(" + java_string("a") + ", " + java_string("1") + ")", "hashMap(" + java_string("a") + ", " + java_string("1") + ", " + java_string("b") + ", " + java_string("2") + ")"]
    if type_name == "Properties":
        return ["null", "props()", "props(" + java_string("a") + ", " + java_string("1") + ")", "props(" + java_string("a") + ", " + java_string("1") + ", " + java_string("b") + ", " + java_string("2") + ")"]
    if type_name == "Double[]":
        return ["null", "new Double[]{}", "new Double[]{1.0}", "new Double[]{1.0, 2.0}", "new Double[]{1.0, null}"]
    if type_name == "BitSet":
        return ["null", "bitset()", "bitset(0)", "bitset(1, 3, 5)", "bitset(63, 64)"]
    if type_name == "Class":
        return ["null", "String.class", "Integer.class", "Object.class", "int.class", "double.class"]
    if type_name == "ClassLoader":
        return [
            "null",
            "ClassLoader.getSystemClassLoader()",
            "ClassLoader.getPlatformClassLoader()",
            "new java.net.URLClassLoader(new java.net.URL[0], null)",
            "new java.net.URLClassLoader(new java.net.URL[0], ClassLoader.getPlatformClassLoader())",
        ]
    if type_name == "Random":
        return ["null", "new java.util.Random(0L)", "new java.util.Random(1L)", "new java.util.Random(2L)"]
    if type_name == "Comparator" or raw_type_name == "Comparator":
        return ["null", "naturalComparator()", "reverseComparator()"]
    if raw_type_name == "Map":
        return ["null", "map()", "map(" + java_string("a") + ", " + java_string("1") + ")", "map(" + java_string("a") + ", " + java_string("1") + ", " + java_string("b") + ", " + java_string("2") + ")"]
    raise ValueError(f"Unsupported parameter type: {type_name}")


def safe_default(pool: list[str]) -> str:
    for value in pool:
        if value != "null":
            return value
    return pool[0]


def default_value_for_param(param: Param, body: str, pool: list[str]) -> str:
    type_name = normalized_type_name(param.effective_type)
    if type_name == "String[]" and "System.exit" in body and "charAt(" in body:
        for value in pool:
            literals = string_array_literals(value)
            if literals and all(all(ch in "ACGT" for ch in literal) for literal in literals):
                return value
    if type_name == "String":
        if re.search(rf"indexOf\(\s*{re.escape(param.name)}\s*\)", body) or re.search(rf"{re.escape(param.name)}\.length\(\)", body):
            for value in pool:
                if value not in {"null", '""'}:
                    return value
    if type_name in {"int", "long", "short", "byte", "double", "float", "Integer", "Long", "Double", "Float", "Short", "Byte", "Number"}:
        loop_sensitive = (
            re.search(rf"(\+=|-=)\s*{re.escape(param.name)}\b", body)
            or re.search(rf"{re.escape(param.name)}\.length\(\)", body)
            or re.search(rf"\[\s*{re.escape(param.name)}\b", body)
            or re.search(rf"<\s*{re.escape(param.name)}\b", body)
            or re.search(rf">\s*{re.escape(param.name)}\b", body)
            or any(token in param.name.lower() for token in ("len", "length", "size", "count", "width", "height", "start"))
        )
        if loop_sensitive:
            for value in pool:
                numeric_value = numeric_literal_value(value)
                if numeric_value is not None and numeric_value > 0:
                    return value
    return safe_default(pool)


def numeric_literal_value(expression: str) -> float | None:
    if expression == "Float.NaN" or expression == "Double.NaN":
        return None
    if expression.startswith("Integer.valueOf(") and expression.endswith(")"):
        return float(expression[len("Integer.valueOf("):-1])
    if expression.startswith("Long.valueOf(") and expression.endswith(")"):
        inner = expression[len("Long.valueOf("):-1].rstrip("L")
        return float(inner)
    if expression.startswith("Double.valueOf(") and expression.endswith(")"):
        inner = expression[len("Double.valueOf("):-1]
        if inner == "Double.NaN":
            return None
        return float(inner)
    if expression.startswith("Float.valueOf(") and expression.endswith(")"):
        inner = expression[len("Float.valueOf("):-1]
        if inner == "Float.NaN":
            return None
        return float(inner.rstrip("f"))
    try:
        return float(expression.rstrip("f").rstrip("L"))
    except ValueError:
        return None


def string_literal_value(expression: str) -> str | None:
    if expression == "null":
        return None
    if len(expression) >= 2 and expression[0] == '"' and expression[-1] == '"':
        value = expression[1:-1]
        return value.replace("\\n", "\n").replace("\\t", "\t").replace('\\"', '"').replace("\\\\", "\\")
    return None


def char_literal_value(expression: str) -> str | None:
    if expression == "null":
        return None
    if len(expression) >= 3 and expression[0] == "'" and expression[-1] == "'":
        value = expression[1:-1]
        escapes = {"\\n": "\n", "\\t": "\t", "\\0": "\0", "\\'": "'", "\\\\": "\\"}
        return escapes.get(value, value)
    return None


def string_array_literals(expression: str) -> list[str] | None:
    if not expression.startswith("new String[]{") or not expression.endswith("}"):
        return None
    return re.findall(r'"((?:[^"\\]|\\.)*)"', expression)


def string_array_startswith_any(expression: str, prefixes: list[str]) -> bool:
    values = string_array_literals(expression)
    if values is None:
        return False
    for value in values:
        for prefix in prefixes:
            if prefix != "" and value.startswith(prefix):
                return True
    return False


def respects_min_max(params: tuple[Param, ...], case: tuple[str, ...]) -> bool:
    name_to_index = {param.name.lower(): index for index, param in enumerate(params)}
    if "min" not in name_to_index or "max" not in name_to_index:
        return True
    min_value = numeric_literal_value(case[name_to_index["min"]])
    max_value = numeric_literal_value(case[name_to_index["max"]])
    if min_value is None or max_value is None:
        return True
    return min_value < max_value


def respects_loop_progress_constraints(method: MethodInfo, case: tuple[str, ...]) -> bool:
    if "while" not in method.body and "for" not in method.body:
        return True
    param_indices = {param.name: index for index, param in enumerate(method.params)}
    for derived_name, source_name, _ in re.findall(
        r"\b(?:final\s+)?(?:int|long|short|byte)\s+(\w+)\s*=\s*(\w+)\s*>>>\s*(\d+)\b",
        method.body,
    ):
        if source_name not in param_indices:
            continue
        if not re.search(rf"new\s+[A-Za-z_][\w\[\]<>]*\s*\[\s*{re.escape(derived_name)}\s*\]", method.body):
            continue
        source_value = numeric_literal_value(case[param_indices[source_name]])
        if source_value is not None and source_value < 0:
            return False
    string_values = {
        param.name: string_literal_value(case[index])
        for index, param in enumerate(method.params)
        if normalized_type_name(param.effective_type) in {"String", "CharSequence"}
    }
    char_values = {
        param.name: char_literal_value(case[index])
        for index, param in enumerate(method.params)
        if normalized_type_name(param.effective_type) == "char"
    }
    indexof_pairs = [
        (receiver, needle)
        for receiver, needle in re.findall(r"\b(\w+)\.indexOf\(\s*(\w+)\b", method.body)
        if receiver in param_indices and needle in param_indices
    ]
    if indexof_pairs and ("while" in method.body or "for" in method.body):
        for receiver, needle in indexof_pairs:
            needle_value = string_values.get(needle)
            if needle_value == "":
                return False
    for loop_index in re.findall(r"while\s*\(\s*(\w+)\s*!=\s*-1\b", method.body):
        if re.search(rf"if\s*\(\s*{re.escape(loop_index)}\s*>\s*0\s*\)", method.body):
            for receiver, needle in indexof_pairs:
                receiver_value = string_values.get(receiver)
                needle_value = string_values.get(needle)
                if receiver_value is not None and needle_value not in {None, ""} and receiver_value.startswith(needle_value):
                    return False
    for loop_index, receiver, needle in re.findall(r"\b(\w+)\s*=\s*(\w+)\.indexOf\(\s*(\w+)\s*\)\s*;", method.body):
        if receiver not in string_values or needle not in param_indices:
            continue
        if not re.search(rf"while\s*\(\s*{re.escape(loop_index)}\s*>=\s*0\s*\)", method.body) and not re.search(
            rf"while\s*\(\s*{re.escape(loop_index)}\s*!=\s*-1\b",
            method.body,
        ):
            continue
        receiver_value = string_values.get(receiver)
        if receiver_value is None:
            continue
        needle_string = string_values.get(needle)
        needle_char = char_values.get(needle)
        if needle_string not in {None, ""} and needle_string in receiver_value:
            return False
        if needle_char is not None and needle_char in receiver_value:
            return False
    string_array_params = {
        param.name: case[index]
        for index, param in enumerate(method.params)
        if normalized_type_name(param.effective_type) == "String[]"
    }
    indexed_string_arrays = [name for name in string_array_params if re.search(rf"\bindexOf\(\s*{re.escape(name)}\s*\[\s*i\s*\]", method.body)]
    for name in indexed_string_arrays:
        values = string_array_literals(string_array_params[name])
        if values is not None and any(value == "" for value in values):
            return False
    for old_name in indexed_string_arrays:
        old_values = string_array_literals(string_array_params[old_name])
        if not old_values:
            continue
        for new_name, new_expr in string_array_params.items():
            if new_name == old_name:
                continue
            if re.search(rf"\b{re.escape(new_name)}\s*\[\s*i\s*\]", method.body):
                if string_array_startswith_any(new_expr, old_values):
                    return False
    colors_match = re.search(r"colors\[i\]\s*>=\s*(\w+)", method.body)
    while_positive_match = re.search(r"while\s*\(\s*(\w+)\s*>\s*0\s*\)", method.body)
    if colors_match and while_positive_match:
        quantity_name = colors_match.group(1)
        kids_name = while_positive_match.group(1)
        if quantity_name in param_indices and kids_name in param_indices and re.search(rf"{re.escape(quantity_name)}\s*-\s*1\b", method.body):
            kids_value = numeric_literal_value(case[param_indices[kids_name]])
            quantity_value = numeric_literal_value(case[param_indices[quantity_name]])
            if kids_value is not None and quantity_value is not None and kids_value > 0 and quantity_value > 0:
                return False
    for left_name, right_name in re.findall(r"while\s*\(\s*(\w+)\s*!=\s*(\w+)\s*\)", method.body):
        if left_name in param_indices and right_name in param_indices:
            if re.search(rf"{re.escape(left_name)}\s*=\s*{re.escape(left_name)}\s*-\s*{re.escape(right_name)}\b", method.body) and re.search(
                rf"{re.escape(right_name)}\s*=\s*{re.escape(right_name)}\s*-\s*{re.escape(left_name)}\b",
                method.body,
            ):
                left_value = numeric_literal_value(case[param_indices[left_name]])
                right_value = numeric_literal_value(case[param_indices[right_name]])
                if left_value is not None and right_value is not None and (left_value <= 0 or right_value <= 0):
                    return False
    for left_name, right_name in itertools.permutations(param_indices, 2):
        if re.search(rf"{re.escape(left_name)}\s*=\s*{re.escape(left_name)}\s*%\s*{re.escape(right_name)}\b", method.body) and re.search(
            rf"{re.escape(right_name)}\s*=\s*{re.escape(right_name)}\s*%\s*{re.escape(left_name)}\b",
            method.body,
        ):
            left_value = numeric_literal_value(case[param_indices[left_name]])
            right_value = numeric_literal_value(case[param_indices[right_name]])
            if left_value is not None and right_value is not None and (left_value <= 0 or right_value <= 0):
                return False
    if "t = a - b" in method.body and "while (t != 0)" in method.body and "a" in param_indices and "b" in param_indices:
        a_value = numeric_literal_value(case[param_indices["a"]])
        b_value = numeric_literal_value(case[param_indices["b"]])
        if a_value is not None and b_value is not None and (a_value <= 0 or b_value <= 0):
            return False
    if "while (t != 0)" in method.body and re.search(r"while\s*\(\s*\(\w+\s*&\s*1\)\s*==\s*0\s*&&\s*\(\w+\s*&\s*1\)\s*==\s*0\s*\)", method.body):
        numeric_values = [numeric_literal_value(case[index]) for index, _ in enumerate(method.params)]
        if any(value is not None and value <= 0 for value in numeric_values):
            return False
    if ">>= 1" in method.body and "while ((" in method.body and "do {" in method.body:
        numeric_values = [numeric_literal_value(case[index]) for index, _ in enumerate(method.params)]
        if any(value is not None and value <= 0 for value in numeric_values):
            if any(re.search(rf"\(\s*{re.escape(param.name)}\s*&\s*1\s*\)\s*==\s*0", method.body) for param in method.params):
                return False
    if ">>>=" in method.body:
        for param_name in ("p", "q"):
            if param_name in param_indices:
                value = numeric_literal_value(case[param_indices[param_name]])
                if value is not None and value < 0:
                    return False
    if "while (true)" in method.body or "while(true)" in method.body:
        for param in method.params:
            if param.name not in param_indices:
                continue
            if re.search(rf"<\s*{re.escape(param.name)}\b", method.body) and re.search(rf"==\s*{re.escape(param.name)}\b", method.body):
                value = numeric_literal_value(case[param_indices[param.name]])
                if value is not None and value < 0:
                    return False
    for while_match in re.finditer(r"while\s*\(\s*(\w+)\s*<\s*(\w+)\s*\)", method.body):
        loop_var, bound_name = while_match.groups()
        if bound_name not in param_indices or loop_var in param_indices:
            continue
        if not re.search(rf"\b(?:int|long|short|byte)\s+{re.escape(loop_var)}\s*=\s*0\b", method.body):
            continue
        trailing_body = method.body[while_match.end():]
        if re.search(
            rf"(\+\+{re.escape(loop_var)}\b|\b{re.escape(loop_var)}\+\+|\-\-{re.escape(loop_var)}\b|\b{re.escape(loop_var)}\-\-|\b{re.escape(loop_var)}\s*[\+\-\*/%]?=)",
            trailing_body,
        ):
            continue
        bound_value = numeric_literal_value(case[param_indices[bound_name]])
        if bound_value is not None and bound_value > 0:
            return False
    for while_match in re.finditer(r"while\s*\(\s*(\w+)\s*<\s*(\w+)\.length\s*\)", method.body):
        loop_var, array_name = while_match.groups()
        if not re.search(rf"\b(?:int|long|short|byte)\s+{re.escape(loop_var)}\s*=\s*0\b", method.body):
            continue
        trailing_body = method.body[while_match.end():]
        if re.search(
            rf"(\+\+{re.escape(loop_var)}\b|\b{re.escape(loop_var)}\+\+|\-\-{re.escape(loop_var)}\b|\b{re.escape(loop_var)}\-\-|\b{re.escape(loop_var)}\s*[\+\-\*/%]?=)",
            trailing_body,
        ):
            continue
        source_match = re.search(rf"{re.escape(array_name)}\s*=\s*(\w+)\.toCharArray\(\)", method.body)
        if source_match and source_match.group(1) in param_indices:
            source_value = string_literal_value(case[param_indices[source_match.group(1)]])
            if source_value is not None and source_value != "":
                return False
    for index, param in enumerate(method.params):
        if not re.search(rf"(\+=|-=)\s*{re.escape(param.name)}\b", method.body):
            continue
        value = numeric_literal_value(case[index])
        if value is not None and value <= 0:
            return False
    for delta_name, left_name, right_name in re.findall(
        r"\b(?:final\s+)?(?:int|long|short|byte|float|double)\s+(\w+)\s*=\s*(\w+)\s*-\s*(\w+)\s*;",
        method.body,
    ):
        if left_name not in param_indices or right_name not in param_indices:
            continue
        if not re.search(rf"\b\w+\s*\+=\s*{re.escape(delta_name)}\b", method.body) and not re.search(
            rf"\b\w+\s*-=\s*{re.escape(delta_name)}\b",
            method.body,
        ):
            continue
        left_value = numeric_literal_value(case[param_indices[left_name]])
        right_value = numeric_literal_value(case[param_indices[right_name]])
        if left_value is None or right_value is None or left_value - right_value <= 0:
            return False
    for index, param in enumerate(method.params):
        value = numeric_literal_value(case[index])
        if re.search(rf"for\s*\([^;]*;[^;]*;[^)]*\+=\s*{re.escape(param.name)}\b", method.body):
            if value is not None and value <= 0:
                return False
        if value is not None and value <= 0:
            if (
                ("substring(" in method.body or "charAt(" in method.body)
                and re.search(rf"\b\w+\s*=\s*\w+\s*\+\s*{re.escape(param.name)}\b", method.body)
            ):
                return False
            if re.search(rf"substring\(\s*0\s*,\s*{re.escape(param.name)}\b", method.body) or re.search(
                rf"substring\(\s*{re.escape(param.name)}\s*\)",
                method.body,
            ):
                return False
            if re.search(
                rf"for\s*\(\s*int\s+\w+\s*=\s*{re.escape(param.name)}\s*;\s*\w+\s*>\s*0\s*;",
                method.body,
            ):
                return False
            assigned_increments = [
                match.group(1)
                for match in re.finditer(rf"\b(?:int|long|short|byte)\s+(\w+)\s*=\s*{re.escape(param.name)}\s*;", method.body)
            ]
            assigned_increments.extend(
                match.group(1)
                for match in re.finditer(rf"\b(\w+)\s*=\s*{re.escape(param.name)}\s*;", method.body)
            )
            if any(re.search(rf"for\s*\([^;]*;[^;]*;[^)]*\+=\s*{re.escape(name)}\b", method.body) for name in assigned_increments):
                return False
    for index, param in enumerate(method.params):
        if param.effective_type != "String":
            continue
        value = string_literal_value(case[index])
        names = (param.name,) + param.aliases
        name_pattern = "|".join(re.escape(name) for name in names)
        if value == "" and re.search(rf"while\s*\([^)]*indexOf\(\s*(?:{name_pattern})\b", method.body):
            return False
        if value == "" and ("while" in method.body or "for" in method.body) and re.search(rf"indexOf\(\s*(?:{name_pattern})\b", method.body):
            return False
        if value == "" and re.search(rf"regionMatches\([^,]+,\s*(?:{name_pattern})\b", method.body):
            return False
        if value == "" and ("while" in method.body or "for" in method.body) and re.search(rf"startsWith\(\s*(?:{name_pattern})\s*\)", method.body):
            return False
        if value == "" and ("while" in method.body or "for" in method.body) and re.search(rf"endsWith\(\s*(?:{name_pattern})\s*\)", method.body):
            return False
        if value == "" and ("while" in method.body or "for" in method.body) and re.search(rf"(?:{name_pattern})\.length\(\)", method.body):
            return False
        if value == "" and "replace(" in method.body and re.search(rf"(?:{name_pattern})\.length\(\)", method.body):
            return False
        if value == "" and re.search(rf"\+=\s*(?:{name_pattern})\.length\(\)", method.body):
            return False
        if value == "" and "while" in method.body and re.search(rf"\+=\s*(?:{name_pattern})\b", method.body):
            return False
        if value == "" and "while" in method.body and re.search(rf"=\s*(?:{name_pattern})\s*\+", method.body):
            return False
        if value == "" and "while" in method.body and re.search(rf"append\(\s*(?:{name_pattern})\s*\)", method.body):
            return False
        if value == "" and "while" in method.body and re.search(rf"insert\([^,]+,\s*(?:{name_pattern})\s*\)", method.body):
            return False
        if (
            value is not None
            and len(value) % 2 == 1
            and "while" in method.body
            and re.search(r"substring\(\s*\w+\s*,\s*\w+\s*\+\s*2\s*\)", method.body)
            and re.search(r"while\s*\(\s*\w+\s*<\s*\w+\.length\(\)\s*\)", method.body)
            and re.search(r"\w+\s*\+=\s*2\b", method.body)
        ):
            return False
    for target_index, target_param in enumerate(method.params):
        if target_param.effective_type != "String":
            continue
        if ("while" not in method.body and "for" not in method.body) or not re.search(
            rf"indexOf\(\s*{re.escape(target_param.name)}\b",
            method.body,
        ):
            continue
        target_value = string_literal_value(case[target_index])
        if not target_value:
            continue
        for replacement_index, replacement_param in enumerate(method.params):
            if replacement_param.name == target_param.name or replacement_param.effective_type != "String":
                continue
            if not (
                re.search(rf"replace(?:All|First)?\s*\([^;]*\b{re.escape(replacement_param.name)}\b", method.body)
                or re.search(rf"\+\s*{re.escape(replacement_param.name)}\s*\+", method.body)
                or re.search(rf"append\(\s*{re.escape(replacement_param.name)}\s*\)", method.body)
                or re.search(rf"insert\([^,]+,\s*{re.escape(replacement_param.name)}\s*\)", method.body)
            ):
                continue
            replacement_value = string_literal_value(case[replacement_index])
            if replacement_value is not None and target_value in replacement_value:
                return False
    if "while" in method.body:
        for target_index, target_param in enumerate(method.params):
            if target_param.effective_type != "String":
                continue
            target_value = string_literal_value(case[target_index])
            if target_value is None:
                continue
            for replacement_index, replacement_param in enumerate(method.params):
                if replacement_param.name == target_param.name or replacement_param.effective_type != "String":
                    continue
                if not re.search(
                    rf"replace(?:All|First)?\s*\(\s*{re.escape(target_param.name)}\s*,\s*{re.escape(replacement_param.name)}\s*\)",
                    method.body,
                ):
                    continue
                replacement_value = string_literal_value(case[replacement_index])
                if replacement_value is None:
                    continue
                if (target_value == "" and replacement_value != "") or (target_value != "" and target_value in replacement_value):
                    return False
    string_params = [param for param in method.params if param.effective_type == "String"]
    numeric_params = [param for param in method.params if param.effective_type in {"int", "long", "short", "byte"}]
    if ("while" in method.body or "for" in method.body) and (
        ("== '\\\\'" in method.body and "== '/'" in method.body)
        or ("case '\\\\':" in method.body and "case '/':" in method.body)
    ):
        for string_param in string_params:
            string_index = param_indices[string_param.name]
            string_value = string_literal_value(case[string_index])
            if string_value is None:
                continue
            for numeric_param in numeric_params:
                numeric_index = param_indices[numeric_param.name]
                numeric_value = numeric_literal_value(case[numeric_index])
                if numeric_value is not None and len(string_value) > numeric_value and "/" not in string_value and "\\" not in string_value:
                    return False
    for loop_match in re.finditer(r"for\s*\(\s*int\s+(\w+)\s*=\s*(\w+)\.indexOf\((\w+)\)\s*;\s*\1\s*>\s*0\s*;\s*\)", method.body):
        _, source_name, target_name = loop_match.groups()
        source_index = next((i for i, param in enumerate(method.params) if param.name == source_name), None)
        if source_index is None:
            alias_match = re.search(rf"\bString\s+{re.escape(source_name)}\s*=\s*(\w+)\s*;", method.body)
            if alias_match:
                source_index = next((i for i, param in enumerate(method.params) if param.name == alias_match.group(1)), None)
        target_index = next((i for i, param in enumerate(method.params) if param.name == target_name), None)
        if source_index is None or target_index is None:
            continue
        source_value = string_literal_value(case[source_index])
        target_value = string_literal_value(case[target_index])
        if source_value is not None and target_value is not None and source_value.find(target_value) > 0:
            return False
    for index, param in enumerate(method.params):
        divide_match = re.search(rf"while\s*\(\s*(\w+)\s*%\s*{re.escape(param.name)}\s*==\s*0\s*\)", method.body)
        if divide_match and re.search(rf"{re.escape(divide_match.group(1))}\s*/=\s*{re.escape(param.name)}\b", method.body):
            divisor_value = numeric_literal_value(case[index])
            if divisor_value is not None and abs(divisor_value) <= 1:
                return False
            tracked_name = divide_match.group(1)
            if tracked_name in param_indices:
                tracked_value = numeric_literal_value(case[param_indices[tracked_name]])
                if tracked_value == 0:
                    return False
        subtract_match = re.search(rf"while\s*\(\s*(\w+)\s*>\s*{re.escape(param.name)}\s*\)", method.body)
        if subtract_match and re.search(
            rf"{re.escape(subtract_match.group(1))}\s*=\s*{re.escape(subtract_match.group(1))}\s*-\s*{re.escape(param.name)}\b",
            method.body,
        ):
            step_value = numeric_literal_value(case[index])
            if step_value is not None and step_value <= 0:
                return False
        if re.search(rf"while\s*\(\s*\(\s*{re.escape(param.name)}\s*&", method.body) and re.search(rf"{re.escape(param.name)}\s*>>=", method.body):
            shifted_value = numeric_literal_value(case[index])
            if shifted_value == 0:
                return False
        if re.search(rf"{re.escape(param.name)}\s*/=\s*10", method.body) and re.search(rf"{re.escape(param.name)}\s*\*=\s*10", method.body):
            scaled_value = numeric_literal_value(case[index])
            if scaled_value == 0:
                return False
    return True


def respects_exit_guards(method: MethodInfo, case: tuple[str, ...]) -> bool:
    if "System.exit" not in method.body:
        return True
    for index, param in enumerate(method.params):
        if param.effective_type == "String[]":
            literals = string_array_literals(case[index])
            if literals is not None and "charAt(" in method.body and any(any(ch not in "ACGT" for ch in literal) for literal in literals):
                return False
        value = numeric_literal_value(case[index])
        if value is None:
            continue
        if re.search(rf"{re.escape(param.name)}\s*<=\s*0", method.body) and value <= 0:
            return False
        if re.search(rf"{re.escape(param.name)}\s*<\s*0", method.body) and value < 0:
            return False
        if re.search(rf"{re.escape(param.name)}\s*==\s*0", method.body) and value == 0:
            return False
    return True


def build_candidate_args(method: MethodInfo) -> list[tuple[str, ...]]:
    pools = [pool_for_param(param, method.body) for param in method.params]
    if not pools:
        return [tuple()]

    cases: list[tuple[str, ...]] = []
    limits = [min(len(pool), 6 if len(method.params) <= 2 else 4) for pool in pools]
    limited_pools = [pool[:limit] for pool, limit in zip(pools, limits)]
    defaults = [default_value_for_param(param, method.body, pool) for param, pool in zip(method.params, pools)]

    cases.append(tuple(defaults))
    for index, pool in enumerate(limited_pools):
        for value in pool:
            args = list(defaults)
            args[index] = value
            cases.append(tuple(args))

    if len(method.params) <= 3:
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
        if respects_min_max(method.params, case)
        and respects_loop_progress_constraints(method, case)
        and respects_exit_guards(method, case)
    ]


def oracle_helpers_source() -> str:
    return """
    static <T> java.util.ArrayList<T> list(T... items) {
        return new java.util.ArrayList<>(java.util.Arrays.asList(items));
    }

    static <T> java.util.Vector<T> vector(T... items) {
        return new java.util.Vector<>(java.util.Arrays.asList(items));
    }

    static java.util.Vector<Double> vectorOfDoubles(double... items) {
        java.util.Vector<Double> values = new java.util.Vector<>();
        for (double item : items) {
            values.add(item);
        }
        return values;
    }

    static java.util.Vector<String> vectorOfStrings(String... items) {
        return new java.util.Vector<>(java.util.Arrays.asList(items));
    }

    static java.util.LinkedHashSet<String> stringSet(String... items) {
        return new java.util.LinkedHashSet<>(java.util.Arrays.asList(items));
    }

    static <T> java.util.LinkedHashSet<T> linkedSet(T... items) {
        return new java.util.LinkedHashSet<>(java.util.Arrays.asList(items));
    }

    static java.util.Comparator<Object> naturalComparator() {
        return (left, right) -> ((java.lang.Comparable<Object>) left).compareTo(right);
    }

    static java.util.Comparator<Object> reverseComparator() {
        return (left, right) -> ((java.lang.Comparable<Object>) right).compareTo(left);
    }

    static java.util.Date date(long millis) {
        return new java.util.Date(millis);
    }

    static java.util.Calendar calendar(long millis) {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(millis);
        return calendar;
    }

    static java.util.Locale locale(String language, String country, String variant) {
        return new java.util.Locale(language, country, variant);
    }

    static StringBuffer sb(String value) {
        return new StringBuffer(value);
    }

    static java.util.Properties props(String... keyValues) {
        java.util.Properties properties = new java.util.Properties();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            properties.setProperty(keyValues[i], keyValues[i + 1]);
        }
        return properties;
    }

    static <K, V> java.util.Hashtable<K, V> hashtable(Object... keyValues) {
        java.util.Hashtable<K, V> table = new java.util.Hashtable<>();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            table.put((K) keyValues[i], (V) keyValues[i + 1]);
        }
        return table;
    }

    static <K, V> java.util.Map<K, V> map(Object... keyValues) {
        java.util.Map<K, V> values = new java.util.HashMap<>();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            values.put((K) keyValues[i], (V) keyValues[i + 1]);
        }
        return values;
    }

    static <K, V> java.util.HashMap<K, V> hashMap(Object... keyValues) {
        java.util.HashMap<K, V> values = new java.util.HashMap<>();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            values.put((K) keyValues[i], (V) keyValues[i + 1]);
        }
        return values;
    }

    static java.util.BitSet bitset(int... bits) {
        java.util.BitSet bitSet = new java.util.BitSet();
        for (int bit : bits) {
            bitSet.set(bit);
        }
        return bitSet;
    }

    static double[][] d2(double[]... rows) {
        return rows;
    }

    static float[][] f2(float[]... rows) {
        return rows;
    }

    static int[][] i2(int[]... rows) {
        return rows;
    }

    static int[][][] i3(int[][]... planes) {
        return planes;
    }

    static byte[][][] b3(byte[][]... planes) {
        return planes;
    }

    static long[][] longMatrix(int rows, int columns) {
        return new long[rows][columns];
    }

    static long[][] longMatrixSequential(int rows, int columns) {
        long[][] values = new long[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                values[row][column] = (((long) row) << 8) | column;
            }
        }
        return values;
    }
"""


def build_oracle_source(package_name: str, class_id: int, cases_by_method: dict[str, list[tuple[str, ...]]]) -> str:
    lines = [
        f"package {package_name};",
        "",
        "import java.io.ByteArrayOutputStream;",
        "import java.io.ObjectOutputStream;",
        "import java.util.Arrays;",
        "import java.util.Base64;",
        "",
        f"public class ClonePair{class_id}Oracle {{",
        "",
        "    @FunctionalInterface",
        "    interface Invocation {",
        "        Object call() throws Throwable;",
        "    }",
        "",
        "    public static void main(String[] args) {",
        f"        ClonePair{class_id} subject = new ClonePair{class_id}();",
    ]
    for method_name in ("method1", "method2"):
        for index, arg_tuple in enumerate(cases_by_method[method_name]):
            arg_source = ", ".join(arg_tuple)
            lines.append(f'        record("{method_name}", {index}, () -> subject.{method_name}({arg_source}));')
    lines.extend([
        "    }",
        "",
        "    static void record(String method, int index, Invocation invocation) {",
        "        try {",
        "            Object value = invocation.call();",
        '            System.out.println(method + "\\t" + index + "\\tOK\\t" + category(value) + "\\t" + serialize(value));',
        "        } catch (Throwable throwable) {",
        '            System.out.println(method + "\\t" + index + "\\tEX\\t" + throwable.getClass().getName());',
        "        }",
        "    }",
        "",
        "    static String category(Object value) {",
        "        if (value == null) {",
        '            return "NULL";',
        "        }",
        "        if (value instanceof Boolean booleanValue) {",
        '            return "BOOL:" + booleanValue;',
        "        }",
        "        if (value instanceof Integer integerValue) {",
        '            return integerValue < 0 ? "INT:neg" : (integerValue == 0 ? "INT:zero" : "INT:pos");',
        "        }",
        "        if (value instanceof Double doubleValue) {",
        "            if (doubleValue.isNaN()) {",
        '                return "DOUBLE:nan";',
        "            }",
        '            return doubleValue < 0 ? "DOUBLE:neg" : (doubleValue == 0.0 ? "DOUBLE:zero" : "DOUBLE:pos");',
        "        }",
        "        if (value instanceof Float floatValue) {",
        "            if (floatValue.isNaN()) {",
        '                return "FLOAT:nan";',
        "            }",
        '            return floatValue < 0 ? "FLOAT:neg" : (floatValue == 0.0f ? "FLOAT:zero" : "FLOAT:pos");',
        "        }",
        "        if (value instanceof Character characterValue) {",
        '            return "CHAR:" + (int) characterValue.charValue();',
        "        }",
        "        if (value instanceof java.util.Date dateValue) {",
        '            return Math.abs(dateValue.getTime() - System.currentTimeMillis()) <= 5000L ? "DATE:now" : "OBJ";',
        "        }",
        '        return "OBJ";',
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


def run_oracle(package_name: str, class_id: int, cases_by_method: dict[str, list[tuple[str, ...]]]) -> dict[str, list[OracleResult]]:
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-oracle-") as temp_dir:
        temp_path = Path(temp_dir)
        source_dir = temp_path / package_name
        source_dir.mkdir(parents=True, exist_ok=True)
        oracle_path = source_dir / f"ClonePair{class_id}Oracle.java"
        oracle_path.write_text(build_oracle_source(package_name, class_id, cases_by_method))

        compile_result = subprocess.run(
            ["javac", "-d", temp_dir, "-sourcepath", str(ROOT / "src" / "main" / "java"), str(oracle_path)],
            cwd=ROOT,
            capture_output=True,
            text=True,
        )
        if compile_result.returncode != 0:
            raise RuntimeError(f"Oracle compilation failed for ClonePair{class_id}\n{compile_result.stdout}\n{compile_result.stderr}")

        try:
            run_result = subprocess.run(
            ["java", "-ea", "-cp", temp_dir, f"{package_name}.ClonePair{class_id}Oracle"],
                cwd=ROOT,
                capture_output=True,
                text=True,
                timeout=15,
            )
        except subprocess.TimeoutExpired as exception:
            raise RuntimeError(f"Oracle execution timed out for ClonePair{class_id}") from exception
        if run_result.returncode != 0:
            raise RuntimeError(f"Oracle execution failed for ClonePair{class_id}\n{run_result.stdout}\n{run_result.stderr}")

    results = {"method1": [], "method2": []}
    for raw_line in run_result.stdout.splitlines():
        line = raw_line.strip()
        if not line:
            continue
        parts = line.split("\t")
        if len(parts) < 4 or parts[0] not in results:
            continue
        method_name = parts[0]
        if parts[2] == "OK":
            results[method_name].append(OracleResult(parts[2], parts[3], parts[4]))
        else:
            results[method_name].append(OracleResult(parts[2], parts[3], ""))
    for method_name, cases in cases_by_method.items():
        if len(results[method_name]) != len(cases):
            raise RuntimeError(
                f"Oracle result count mismatch for ClonePair{class_id} {method_name}: "
                f"expected {len(cases)}, got {len(results[method_name])}"
            )
    return results


def select_cases(method: MethodInfo, candidate_args: list[tuple[str, ...]], oracle_results: list[OracleResult]) -> list[SelectedCase]:
    records = [SelectedCase(args, result) for args, result in zip(candidate_args, oracle_results)]
    selected: list[SelectedCase] = []
    used_indices: set[int] = set()

    def add_first(predicate) -> None:
        for index, record in enumerate(records):
            if index in used_indices:
                continue
            if predicate(record):
                selected.append(record)
                used_indices.add(index)
                return

    add_first(lambda record: record.result.status == "EX")

    if method.declared_return_type == "boolean":
        add_first(lambda record: record.result.status == "OK" and record.result.category == "BOOL:true")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "BOOL:false")
    elif method.declared_return_type == "int":
        add_first(lambda record: record.result.status == "OK" and record.result.category == "INT:neg")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "INT:zero")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "INT:pos")
    elif method.declared_return_type in {"double", "Double"}:
        add_first(lambda record: record.result.status == "OK" and record.result.category == "DOUBLE:nan")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "DOUBLE:neg")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "DOUBLE:zero")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "DOUBLE:pos")
    elif method.declared_return_type == "float":
        add_first(lambda record: record.result.status == "OK" and record.result.category == "FLOAT:nan")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "FLOAT:neg")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "FLOAT:zero")
        add_first(lambda record: record.result.status == "OK" and record.result.category == "FLOAT:pos")
    else:
        add_first(lambda record: record.result.status == "OK" and record.result.category == "NULL")
        seen_payloads: set[str] = set()
        for index, record in enumerate(records):
            if index in used_indices or record.result.status != "OK" or record.result.category == "NULL":
                continue
            if record.result.payload not in seen_payloads:
                selected.append(record)
                used_indices.add(index)
                seen_payloads.add(record.result.payload)
            if len(selected) >= 3:
                break

    seen_categories: set[tuple[str, str, str]] = {(record.result.status, record.result.category, record.result.payload) for record in selected}
    for index, record in enumerate(records):
        if len(selected) >= 5:
            break
        key = (record.result.status, record.result.category, record.result.payload if record.result.status == "OK" and record.result.category == "OBJ" else "")
        if index not in used_indices and key not in seen_categories:
            selected.append(record)
            used_indices.add(index)
            seen_categories.add(key)

    for index, record in enumerate(records):
        if len(selected) >= 3:
            break
        if index not in used_indices:
            selected.append(record)
            used_indices.add(index)

    if len(selected) < 3:
        raise RuntimeError(f"Could not select 3 cases for {method.name}")
    return selected[:5]


def generate_test_source(package_name: str, class_id: int, method: MethodInfo, selected_cases: list[SelectedCase]) -> str:
    lines = [
        f"package {package_name};",
        "",
        "import org.junit.jupiter.api.Test;",
        "",
        f"import static {package_name}.ClonePairGeneratedTestSupport.*;",
        "import static org.junit.jupiter.api.Assertions.assertThrows;",
        "",
        f"class ClonePair{class_id}{method.name[0].upper() + method.name[1:]}Test {{",
        "",
        f"    private final ClonePair{class_id} subject = new ClonePair{class_id}();",
        "",
    ]

    for index, case in enumerate(selected_cases, start=1):
        lines.append("    @Test")
        lines.append(f"    void {method.name}Case{index:02d}() {{")
        lines.append("        // Generated by Codex (gpt-5.4).")
        arguments = ", ".join(case.args)
        if case.result.status == "EX":
            lines.append(f"        assertThrows({case.result.category}.class, () -> subject.{method.name}({arguments}));")
        elif case.result.category == "DATE:now":
            lines.append(f"        assertDateCloseToNow(subject.{method.name}({arguments}));")
        else:
            lines.append(f'        assertExpectedSerialized("{case.result.payload}", subject.{method.name}({arguments}));')
        lines.append("    }")
        lines.append("")

    lines.append("}")
    lines.append("")
    return "\n".join(lines)


def junit_classpath() -> str:
    cache_root = Path(GRADLE_USER_HOME) / "caches" / "modules-2" / "files-2.1"
    required_patterns = (
        "org.junit.jupiter/junit-jupiter-api/*/*/junit-jupiter-api-*.jar",
        "org.junit.jupiter/junit-jupiter-engine/*/*/junit-jupiter-engine-*.jar",
        "org.junit.platform/junit-platform-launcher/*/*/junit-platform-launcher-*.jar",
        "org.junit.platform/junit-platform-engine/*/*/junit-platform-engine-*.jar",
        "org.junit.platform/junit-platform-commons/*/*/junit-platform-commons-*.jar",
        "org.opentest4j/opentest4j/*/*/opentest4j-*.jar",
        "org.apiguardian/apiguardian-api/*/*/apiguardian-api-*.jar",
    )
    jars: list[Path] = []
    for pattern in required_patterns:
        matches = sorted(path for path in cache_root.glob(pattern) if not path.name.endswith("-sources.jar"))
        if not matches:
            raise RuntimeError(f"Missing JUnit dependency for pattern: {pattern}")
        jars.append(matches[-1])
    return os.pathsep.join(str(path) for path in jars)


def build_test_launcher_source(package_name: str, class_id: int) -> str:
    return f"""
import java.io.PrintWriter;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class GeneratedTestLauncher {{

    public static void main(String[] args) {{
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                        selectClass("{package_name}.ClonePair{class_id}Method1Test"),
                        selectClass("{package_name}.ClonePair{class_id}Method2Test"))
                .build();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out, true));
        summary.printFailuresTo(new PrintWriter(System.err, true));
        if (summary.getTestsFailedCount() > 0 || summary.getTestsFoundCount() == 0) {{
            System.exit(1);
        }}
    }}
}}
""".strip()


def run_generated_tests(package_name: str, class_id: int, method1_source: str, method2_source: str) -> None:
    classpath = junit_classpath()
    with tempfile.TemporaryDirectory(prefix=f"clonepair-{class_id}-tests-") as temp_dir:
        temp_path = Path(temp_dir)
        package_dir = temp_path / package_name
        package_dir.mkdir(parents=True, exist_ok=True)
        launcher_path = temp_path / "GeneratedTestLauncher.java"
        launcher_path.write_text(build_test_launcher_source(package_name, class_id))
        method1_path = package_dir / f"ClonePair{class_id}Method1Test.java"
        method2_path = package_dir / f"ClonePair{class_id}Method2Test.java"
        method1_path.write_text(method1_source)
        method2_path.write_text(method2_source)
        sources = [
            main_dir(package_name) / f"ClonePair{class_id}.java",
            test_dir(package_name) / "ClonePairGeneratedTestSupport.java",
            method1_path,
            method2_path,
            launcher_path,
        ]
        compile_result = subprocess.run(
            ["javac", "-d", temp_dir, "-cp", classpath, *map(str, sources)],
            cwd=ROOT,
            capture_output=True,
            text=True,
        )
        if compile_result.returncode != 0:
            raise RuntimeError(
                f"Custom test compilation failed for ClonePair{class_id}\n{compile_result.stdout}\n{compile_result.stderr}"
            )

        run_result = subprocess.run(
            ["java", "-ea", "-cp", os.pathsep.join([temp_dir, classpath]), "GeneratedTestLauncher"],
            cwd=ROOT,
            capture_output=True,
            text=True,
        )
        if run_result.returncode != 0:
            raise RuntimeError(f"Custom test run failed for ClonePair{class_id}\n{run_result.stdout}\n{run_result.stderr}")


def existing_test_ids(package_name: str) -> set[int]:
    ids = set()
    for path in test_dir(package_name).glob("ClonePair*Method*Test.java"):
        stem = path.stem
        class_part = stem.replace("ClonePair", "").split("Method", 1)[0]
        ids.add(int(class_part))
    return ids


def target_ids(package_name: str, start_id: int, end_id: int, explicit_ids: str | None, include_existing: bool) -> list[int]:
    all_main_ids = sorted(int(path.stem.replace("ClonePair", "")) for path in main_dir(package_name).glob("ClonePair*.java"))
    tested_ids = existing_test_ids(package_name)
    if explicit_ids:
        requested = [int(value) for value in explicit_ids.split(",") if value.strip()]
        return [class_id for class_id in requested if class_id in all_main_ids and (include_existing or class_id not in tested_ids)]
    return [class_id for class_id in all_main_ids if start_id <= class_id <= end_id and (include_existing or class_id not in tested_ids)]


def ensure_support_compiles() -> None:
    return


def main() -> int:
    args = parse_args()
    package_name = args.package_name
    class_ids = target_ids(package_name, args.start_id, args.end_id, args.ids, args.include_existing)
    if args.limit is not None:
        class_ids = class_ids[:args.limit]
    if not class_ids:
        print("No target classes.")
        return 0

    ensure_support_compiles()

    total = len(class_ids)
    for position, class_id in enumerate(class_ids, start=1):
        methods = parse_class(package_name, class_id)
        cases_by_method = {name: build_candidate_args(method) for name, method in methods.items()}
        oracle_results = run_oracle(package_name, class_id, cases_by_method)
        selected_by_method = {
            name: select_cases(methods[name], cases_by_method[name], oracle_results[name])
            for name in ("method1", "method2")
        }
        method_sources = {
            method_name: generate_test_source(package_name, class_id, methods[method_name], selected_by_method[method_name])
            for method_name in ("method1", "method2")
        }

        if args.verify_before_write:
            run_generated_tests(package_name, class_id, method_sources["method1"], method_sources["method2"])

        for method_name in ("method1", "method2"):
            test_path = test_dir(package_name) / f"ClonePair{class_id}{method_name[0].upper() + method_name[1:]}Test.java"
            test_path.write_text(method_sources[method_name])

        if not args.verify_before_write:
            run_generated_tests(package_name, class_id, method_sources["method1"], method_sources["method2"])
        print(f"[{position}/{total}] ClonePair{class_id} complete", flush=True)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
