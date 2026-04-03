package inequivalent;

public class ClonePair89 {

    boolean method1(char[] ch, int start, int length) {
        for (int i = start; i < start + length; i++) {
            char c = ch[i];
            if (c != '\n' && c != '\t' && c != ' ') return false;
        }
        return true;
    }

    boolean method2(char[] ch, int ofs, int len) {
        int max;
        max = ofs + len;
        for (int i = ofs; i < max; i++) {
            if (!Character.isWhitespace(ch[i])) {
                return false;
            }
        }
        return true;
    }
}
