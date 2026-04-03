package equivalent;

public class ClonePair8392 {
    boolean method1(byte[] a, byte[] b, int len) {
        for (int i = 0; i < len; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] b1, byte[] b2, int len) {
        for (int i = 0; i < len; ++i) {
            if (b1[i] != b2[i]) {
                return false;
            }
        }
        return true;
    }
}
