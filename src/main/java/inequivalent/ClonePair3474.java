package inequivalent;

public class ClonePair3474 {

    boolean method1(short[] path1, short[] path2) {
        if (path1.length != path2.length) {
            return false;
        }
        for (int i = 0; i < path1.length; i++) {
            if (path1[i] != path2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(short[] a, short[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; ++i) {
            if ((a[i] & 0xFF) != (b[i] & 0xFF)) {
                System.err.printf("%04X: %X != %X%n", i, a[i], b[i]);
                return false;
            }
        }
        return true;
    }
}
