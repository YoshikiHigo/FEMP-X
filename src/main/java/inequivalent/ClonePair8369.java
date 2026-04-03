package inequivalent;

public class ClonePair8369 {

    double method1(double[] raw, int count) {
        double min = raw[0];
        int i = 0;
        for (; i < count; i++) if (raw[i] < min) min = raw[i];
        return min;
    }

    double method2(double[] raw, int count) {
        double max = raw[0];
        int i = 0;
        for (; i < count; i++) if (raw[i] > max) max = raw[i];
        return max;
    }
}
