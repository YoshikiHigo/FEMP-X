package equivalent;

public class ClonePair9528 {
    boolean method1(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(int[] features) {
        for (int i = 1; i < features.length; i++) if (features[i - 1] >= features[i]) return false;
        return true;
    }
}
