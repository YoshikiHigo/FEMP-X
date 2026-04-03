package equivalent;

public class ClonePair2950 {
    boolean method1(byte[] tok, byte[] sub) {
        final int sl = sub.length;
        if (sl > tok.length) return false;
        for (int s = 0; s < sl; s++) if (sub[s] != tok[s]) return false;
        return true;
    }

    boolean method2(byte[] string, byte[] start) {
        if (string.length < start.length) return false;
        for (int i = 0; i < start.length; i++) {
            if (string[i] != start[i]) return false;
        }
        return true;
    }
}
