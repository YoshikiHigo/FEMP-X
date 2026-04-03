package inequivalent;

import java.util.Arrays;

public class ClonePair4602 {

    double method1(double[] data) {
        double result = 0.0;
        if ((data == null) || (data.length < 1)) return result;
        if (data.length == 1) return data[0];
        Arrays.sort(data);
        if (data.length % 2 == 0) {
            int i = data.length / 2;
            result = (data[i] + data[i - 1]) / 2;
        } else {
            return data[data.length / 2];
        }
        return result;
    }

    double method2(double[] data) {
        double median = 0;
        if (data == null || data.length < 1) {
            return (0.);
        } else {
            double[] out = new double[data.length];
            System.arraycopy(data, 0, out, 0, data.length);
            java.util.Arrays.sort(out);
            if (out.length % 2 == 0) {
                median = (out[out.length / 2 - 1] + out[out.length / 2]) / 2.0;
            } else {
                median = out[out.length / 2];
            }
            return median;
        }
    }
}
