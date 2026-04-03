package equivalent;

public class ClonePair12430 {
    boolean method1(byte[] a, byte[] b, int offset, int length) {
        int lim = offset + length;
        if (a.length < lim || b.length < lim) return false;
        for (int i = offset; i < lim; ++i) if (a[i] != b[i]) return false;
        return true;
    }

    boolean method2(byte[] buf1, byte[] buf2, int off, int len) {
        for (int i = off; i < off + len; i++) {
            if (i >= buf1.length || i >= buf2.length) {
                return false;
            }
            if (buf1[i] != buf2[i]) {
                return false;
            }
        }
        return true;
    }
}
