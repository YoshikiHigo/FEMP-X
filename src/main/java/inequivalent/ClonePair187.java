package inequivalent;

public class ClonePair187 {

    boolean method1(byte[] a, byte[] b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] a, byte[] b) {
        int alength = (a == null) ? 0 : a.length;
        int blength = (b == null) ? 0 : b.length;
        if (alength != blength) {
            return false;
        }
        for (int i = 0; i < alength; ++i) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
