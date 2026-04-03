package inequivalent;

public class ClonePair10853 {

    int method1(String s, int i) {
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ' && ch != '\t') return i;
        }
        return -1;
    }

    int method2(String str, int fromIndex) {
        for (int i = fromIndex; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isSpace(ch)) return i;
        }
        return -1;
    }
}
