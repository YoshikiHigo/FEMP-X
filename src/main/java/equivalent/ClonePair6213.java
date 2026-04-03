package equivalent;

public class ClonePair6213 {
    boolean method1(boolean[] a, boolean[] b) {
        if (a == null) {
            return b == null;
        }
        if (b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(boolean[] a, boolean[] b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i != a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
