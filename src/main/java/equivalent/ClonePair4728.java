package equivalent;

public class ClonePair4728 {
    double method1(double[] values) {
        double avg, stdev;
        double sum = 0;
        for (double d : values) {
            sum += d;
        }
        avg = sum / values.length;
        if (avg == 0) {
            return Double.NaN;
        }
        sum = 0;
        for (double d : values) {
            sum += (d - avg) * (d - avg);
        }
        stdev = Math.sqrt(sum / (double) (values.length - 1));
        return stdev / avg;
    }

    double method2(double[] values) {
        double avg, stdev;
        double sum = 0;
        for (double d : values) {
            sum += d;
        }
        avg = sum / values.length;
        if (avg == 0) return Double.NaN;
        sum = 0;
        for (double d : values) {
            sum += (d - avg) * (d - avg);
        }
        stdev = Math.sqrt(sum / (double) (values.length - 1));
        return stdev / avg;
    }
}
