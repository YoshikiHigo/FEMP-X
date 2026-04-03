package inequivalent;

public class ClonePair3396 {

    boolean method1(int[] t1, int[] t2) {
        for (int i = 0; i < t1.length - 1; ++i) if (t1[i] != t2[i]) return false;
        return true;
    }

    boolean method2(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
