package equivalent;

public class ClonePair6611 {
    double method1(double[] hist, int begin, int end) {
        double s = 0;
        for (int i = begin; i < end; ++i) {
            s += hist[i];
        }
        return s;
    }

    double method2(double[] array, int start, int end) {
        double total = 0.0;
        for (int i = start; i < end; i++) {
            total += array[i];
        }
        return total;
    }
}
