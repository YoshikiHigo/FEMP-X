package equivalent;

public class ClonePair10928 {
    int method1(String template, int i) {
        while (i < template.length() && Character.isWhitespace(template.charAt(i))) {
            i++;
        }
        return i;
    }

    int method2(String s, int pos) {
        while (pos < s.length() && Character.isWhitespace(s.charAt(pos))) pos++;
        return pos;
    }
}
