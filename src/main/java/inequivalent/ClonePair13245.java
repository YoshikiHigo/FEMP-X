package inequivalent;

public class ClonePair13245 {

    boolean method1(int[] p, float[] b, float[] x, int n) {
        int k;
        if (x == null || b == null) return (false);
        for (k = 0; k < n; k++) x[k] = b[p != null ? p[k] : k];
        return (true);
    }

    boolean method2(int[] p, float[] b, float[] x, int n) {
        int k;
        if (x == null || b == null) return (false);
        for (k = 0; k < n; k++) x[p != null ? p[k] : k] = b[k];
        return (true);
    }
}
