package inequivalent;

public class ClonePair5126 {

    boolean method1(char[] buffer, int pos, char[] tag) {
        if (buffer.length - pos < tag.length) return false;
        for (int i = 0; i < tag.length; i++) if (buffer[pos++] != tag[i]) return false;
        return true;
    }

    boolean method2(char[] cs, int offSet, char[] ps) {
        for (int i = 0; i < ps.length; i++) {
            int c = i + offSet;
            if (c >= cs.length) {
                return false;
            }
            if ((cs[c] != ps[i]) && (ps[i] != '?')) {
                return false;
            }
        }
        return true;
    }
}
