package equivalent;

public class ClonePair4247 {
    boolean method1(float[] a1, float[] a2) {
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

    boolean method2(float[] a, float[] b) {
        if (a == b) return (true);
        if (a == null) return (false);
        if (b == null) return (false);
        if (a.length != b.length) return (false);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return (false);
        }
        return (true);
    }
}
