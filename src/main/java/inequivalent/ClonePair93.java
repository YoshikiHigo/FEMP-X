package inequivalent;

public class ClonePair93 {

    boolean method1(char[] pChars, int pOffset, int pLen) {
        for (int i = 0; i < pLen; i++) {
            if (!Character.isWhitespace(pChars[pOffset + i])) {
                return false;
            }
        }
        return true;
    }

    boolean method2(char[] ch, int start, int len) {
        int end = start + len;
        for (int i = start; i < end; i++) {
            char c = ch[i];
            if (c != ' ' && c != '\t' && c != '\n' && c != '\r') return false;
        }
        return true;
    }
}
