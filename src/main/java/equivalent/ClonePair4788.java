package equivalent;

public class ClonePair4788 {
    double method1(double[] data) {
        double max = data[0];
        for (int i = 1; i < data.length; ++i) if (data[i] > max) max = data[i];
        return max;
    }

    double method2(double[] verteces) {
        double r;
        r = verteces[0];
        for (int i = 0; i < verteces.length; i++) {
            if (verteces[i] > r) {
                r = verteces[i];
            }
        }
        return r;
    }
}
