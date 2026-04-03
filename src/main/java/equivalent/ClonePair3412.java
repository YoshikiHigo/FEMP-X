package equivalent;

public class ClonePair3412 {
    boolean method1(int[] a, int[] b) {
        if (a == b) return true;
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    boolean method2(int[] pts1, int[] pts2) {
        if (pts1 == pts2) return true;
        else if ((pts1 == null) || (pts2 == null)) return false;
        else if (pts1.length != pts2.length) return false;
        else {
            for (int i = 0; i < pts1.length; i++) {
                if (pts1[i] != pts2[i]) return false;
            }
            return true;
        }
    }
}
