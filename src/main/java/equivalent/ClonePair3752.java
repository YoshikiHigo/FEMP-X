package equivalent;

public class ClonePair3752 {
    boolean method1(double[] ea, double[] ra, double delta) {
        if (ea.length != ra.length) return false;
        for (int i = 0; i < ra.length; i++) if (Math.abs(ea[i] - ra[i]) > delta) return false;
        return true;
    }

    boolean method2(double[] a1, double[] a2, double precision) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (Math.abs(a1[i] - a2[i]) > precision) {
                return false;
            }
        }
        return true;
    }
}
