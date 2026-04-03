package equivalent;

public class ClonePair10594 {
    int method1(String sb, int offset) {
        int result;
        for (result = offset; result < sb.length(); result++) {
            if (!Character.isWhitespace(sb.charAt(result))) {
                break;
            }
        }
        return result;
    }

    int method2(String str, int startIndex) {
        int i = startIndex;
        for (; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                break;
            }
        }
        return i;
    }
}
