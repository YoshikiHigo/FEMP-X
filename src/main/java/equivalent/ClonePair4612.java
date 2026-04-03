package equivalent;

public class ClonePair4612 {
    double method1(double[] a) {
        double b = a[0];
        for (int i = 0; i < a.length; i++) if (a[i] > b) b = a[i];
        return b;
    }

    double method2(double[] v) {
        double max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
            }
        }
        return (max);
    }
}
