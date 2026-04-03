package inequivalent;

public class ClonePair5865 {

    double method1(double[] x, double mean) {
        double var = 0;
        int count = x.length;
        for (double aX : x) {
            if (Double.isNaN(aX)) {
                count--;
            } else {
                double diff = aX - mean;
                var += diff * diff;
            }
        }
        if (count < 2) {
            count = 1;
        } else {
            count = count - 1;
        }
        return var / (double) count;
    }

    double method2(double[] x, double mean) {
        double var = 0;
        int len = x.length;
        for (int i = 0; i < len; i++) {
            double diff = x[i] - mean;
            var += diff * diff;
        }
        int n;
        if (len < 2) {
            n = 1;
        } else {
            n = len - 1;
        }
        return var / (double) n;
    }
}
