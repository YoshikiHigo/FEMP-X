package equivalent;

public class ClonePair879 {
    boolean method1(byte[] b1, byte[] b2) {
        for (int i = 0; i < b2.length && i < b1.length; i++) {
            if (b2[i] != b1[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] x, byte[] y) {
        int len = x.length < y.length ? x.length : y.length;
        int offset = 0;
        while (len > 0) {
            if (x[offset] != y[offset]) return false;
            offset++;
            len--;
        }
        return true;
    }
}
