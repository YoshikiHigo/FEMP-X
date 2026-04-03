package equivalent;

public class ClonePair9144 {
    int method1(String s, int pos) {
        while (pos < s.length() && !Character.isWhitespace(s.charAt(pos))) pos++;
        return pos;
    }

    int method2(String string, int pos) {
        final int length = string.length();
        while ((pos < length) && !Character.isWhitespace(string.charAt(pos))) {
            pos++;
        }
        return pos;
    }
}
