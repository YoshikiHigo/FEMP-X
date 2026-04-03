package equivalent;

public class ClonePair3852 {
    double method1(double[] a, double[] b) {
        double r = 0;
        for (int i = 0; i < a.length; i++) r += a[i] * b[i];
        return r;
    }

    double method2(double[] v1, double[] v2) {
        double r = 0;
        for (int i = 0; i < v1.length; ++i) {
            r += v1[i] * v2[i];
        }
        return r;
    }
}
