package equivalent;

public class ClonePair9631 {
    double method1(double[] data) {
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) max = data[i];
        }
        return max;
    }

    double method2(double[] ar) {
        int i;
        double m;
        m = ar[0];
        for (i = 1; i < ar.length; ++i) {
            if (m < ar[i]) m = ar[i];
        }
        return m;
    }
}
