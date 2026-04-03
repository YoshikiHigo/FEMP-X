package inequivalent;

public class ClonePair3914 {

    double method1(double[] value1, double[] value2) {
        double sum = 0.0;
        int counter = 0;
        for (int i = 0; i < value1.length; i++) {
            if ((!Double.isNaN(value1[i])) && (!Double.isNaN(value2[i]))) {
                double diff = value1[i] - value2[i];
                sum += diff * diff;
                counter++;
            }
        }
        if (counter > 0) return Math.sqrt(sum);
        else return Double.NaN;
    }

    double method2(double[] value1, double[] value2) {
        double sum = 0.0;
        int counter = 0;
        for (int i = 0; i < value1.length; i++) {
            if ((!Double.isNaN(value1[i])) && (!Double.isNaN(value2[i]))) {
                sum = sum + Math.abs(value1[i] - value2[i]);
                counter++;
            }
        }
        double d = sum;
        if (counter > 0) return d;
        else return Double.NaN;
    }
}
