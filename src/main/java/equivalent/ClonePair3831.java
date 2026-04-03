package equivalent;

public class ClonePair3831 {
    double method1(double[] a, double[] b) {
        double total = 0.0;
        for (int i = 0; i < a.length; i++) {
            total += (a[i] * b[i]);
        }
        return total;
    }

    double method2(double[] m1, double[] m2) {
        double res = 0.0;
        for (int i = 0; i < m1.length; i++) {
            res += m1[i] * m2[i];
        }
        return res;
    }
}
