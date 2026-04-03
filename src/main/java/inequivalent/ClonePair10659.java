package inequivalent;

public class ClonePair10659 {

    int method1(String src, int from) {
        for (final int len = src.length(); from < len && !Character.isWhitespace(src.charAt(from)); ++from) ;
        return from;
    }

    int method2(String s, int start) {
        char c;
        int len = s.length();
        while (start < len && !((c = s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t')) start++;
        return start;
    }
}
