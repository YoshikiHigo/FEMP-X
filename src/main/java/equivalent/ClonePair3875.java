package equivalent;

public class ClonePair3875 {
    double method1(double[] v1, double[] v2) {
        final int m = v1.length;
        double sum = 0;
        for (int r = 0; r < m; r++) {
            sum += v1[r] * v2[r];
        }
        return sum;
    }

    double method2(double[] a, double[] b) {
        final int length = a.length;
        double value = 0;
        for (int i = 0; i < length; ++i) {
            value += a[i] * b[i];
        }
        return value;
    }
}
