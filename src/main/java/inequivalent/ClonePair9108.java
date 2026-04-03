package inequivalent;

public class ClonePair9108 {

    int method1(String s, int n) {
        while (n < s.length()) {
            final char c = s.charAt(n);
            if (c == ' ' || c == '\t' || c == '\n') n++;
            else break;
        }
        return n;
    }

    int method2(String s, int startIdx) {
        int len = s.length();
        while ((startIdx < len) && Character.isWhitespace(s.charAt(startIdx))) {
            startIdx++;
        }
        return startIdx;
    }
}
