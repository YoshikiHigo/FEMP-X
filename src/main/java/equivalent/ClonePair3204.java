package equivalent;

public class ClonePair3204 {
    boolean method1(byte[] a, int offset, byte[] a2) {
        if ((a.length - offset) >= a2.length) {
            for (int i = 0; i < a2.length; i++) {
                if (a[i + offset] != a2[i]) return false;
            }
            return true;
        } else return false;
    }

    boolean method2(byte[] buf, int start, byte[] to) {
        if ((buf.length - start) < to.length) return false;
        for (int i = 0; i < to.length; i++) if (buf[start + i] != to[i]) return false;
        return true;
    }
}
