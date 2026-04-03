package equivalent;

public class ClonePair3634 {
    boolean method1(int[] a, int[] b) {
        if (a == b) return true;
        if ((a == null) || (b == null)) return false;
        int i = a.length;
        if (b.length != i) return false;
        while (--i >= 0) if (a[i] != b[i]) return false;
        return true;
    }

    boolean method2(int[] a1, int[] a2) {
        if (a1 == a2) {
            return true;
        }
        try {
            if (a1.length == a2.length) {
                for (int i = 0; i < a1.length; i++) {
                    if (a1[i] != a2[i]) {
                        return false;
                    }
                }
                return true;
            }
        } catch (NullPointerException e) {
        }
        return false;
    }
}
