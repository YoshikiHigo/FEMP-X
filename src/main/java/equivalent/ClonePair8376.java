package equivalent;

public class ClonePair8376 {
    int method1(String string, int p) {
        while (p < string.length() && !Character.isWhitespace(string.charAt(p))) {
            p++;
        }
        return p;
    }

    int method2(String sb, int offset) {
        int result;
        for (result = offset; result < sb.length(); result++) {
            if (Character.isWhitespace(sb.charAt(result))) {
                break;
            }
        }
        return result;
    }
}
