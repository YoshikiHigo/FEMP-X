package equivalent;

public class ClonePair6224 {
    boolean method1(boolean[] a, boolean[] b) {
        int la = a.length;
        if (b.length != la) return false;
        for (int i = 0; i < la; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    boolean method2(boolean[] a, boolean[] b) {
        if (a.length != b.length) {
            return false;
        }
        boolean res = true;
        for (int i = 0; i < a.length; i++) {
            res &= a[i] == b[i];
        }
        return res;
    }
}
