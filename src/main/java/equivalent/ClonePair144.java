package equivalent;

public class ClonePair144 {
    boolean method1(byte[] a, byte[] b) {
        int len = a.length;
        if (len != b.length) {
            return false;
        }
        for (int i = 0; i < len; ++i) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] b1, byte[] b2) {
        int size1 = b1.length;
        int size2 = b2.length;
        if (size1 != size2) {
            return false;
        }
        for (int i = 0; i < size1; i++) {
            if (b1[i] != b2[i]) {
                return false;
            }
        }
        return true;
    }
}
