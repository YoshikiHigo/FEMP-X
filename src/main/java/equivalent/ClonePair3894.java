package equivalent;

public class ClonePair3894 {
    double method1(double[] x, double[] y) {
        final int n = x.length;
        double area = 0.0;
        for (int i = 0; i < n - 1; i++) area += (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
        area += (x[n - 1] * y[0]) - (x[0] * y[n - 1]);
        area *= 0.5;
        return area;
    }

    double method2(double[] x, double[] y) {
        final int n = x.length;
        double area = 0.0;
        for (int i = 0; i < n - 1; i++) {
            area += (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
        }
        area += (x[n - 1] * y[0]) - (x[0] * y[n - 1]);
        area *= 0.5;
        return area;
    }
}
