package equivalent;

public class ClonePair6589 {
    boolean method1(long[] a1, long[] a2) {
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

    boolean method2(long[] a1, long[] a2) {
        if (a1 == a2) return true;
        if (null == a1 || null == a2) return false;
        if (a1.length == a2.length) {
            int i = a1.length;
            while (--i >= 0) if (a1[i] != a2[i]) return false;
            return true;
        }
        return false;
    }
}
