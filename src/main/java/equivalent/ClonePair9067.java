package equivalent;

public class ClonePair9067 {
    double method1(double[] data) {
        double min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) min = data[i];
        }
        return min;
    }

    double method2(double[] a) {
        double min = a[0];
        for (double v : a) if (v < min) min = v;
        return min;
    }
}
