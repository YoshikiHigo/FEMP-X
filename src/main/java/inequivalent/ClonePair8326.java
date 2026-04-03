package inequivalent;

public class ClonePair8326 {

    int method1(String str, int start) {
        int pos = start;
        int open = 1;
        while (open > 0 && pos < str.length()) {
            if (str.charAt(pos) == '(') open++;
            if (str.charAt(pos) == ')') open--;
            pos++;
        }
        if (open > 0) return -1;
        return pos;
    }

    int method2(String expr, int offset) {
        int depth = 1, i, len = expr.length();
        for (i = offset + 1; i < len && depth != 0; i++) {
            char c = expr.charAt(i);
            if (c == ')') depth--;
            else if (c == '(') depth++;
        }
        return (i < len || depth == 0) ? i : -1;
    }
}
