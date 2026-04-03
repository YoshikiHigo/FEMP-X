package inequivalent;

public class ClonePair9945 {

    int method1(String s, int start) {
        char c;
        int len = s.length();
        while (start < len && ((c = s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t')) start++;
        return start;
    }

    int method2(String s, int start) {
        while ((start < s.length()) && Character.isWhitespace(s.charAt(start))) start++;
        return start;
    }
}
