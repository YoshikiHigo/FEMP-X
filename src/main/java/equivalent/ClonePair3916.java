package equivalent;

public class ClonePair3916 {
    int method1(CharSequence text, char ch, int start) {
        final int n = text.length();
        for (; start < n; start++) {
            if (text.charAt(start) == ch) {
                return start;
            }
        }
        return n;
    }

    int method2(CharSequence text, char ch, int start) {
        final int n = text.length();
        for (; start < n; start++) if (text.charAt(start) == ch) return start;
        return n;
    }
}
