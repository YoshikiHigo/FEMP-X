package equivalent;

public class ClonePair3284 {
    boolean method1(int[] xs, int[] ys) {
        if (xs.length != ys.length) return false;
        for (int i = xs.length - 1; i >= 0; i--) {
            if (xs[i] != ys[i]) return false;
        }
        return true;
    }

    boolean method2(int[] o1, int[] o2) {
        if (o1.length != o2.length) {
            return false;
        } else {
            for (int i = 0; i < o1.length; i++) {
                if (o1[i] != o2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
