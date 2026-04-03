package equivalent;

public class ClonePair4585 {
    double method1(double[] arrFunc) {
        double dblMin = arrFunc[0];
        for (int index = 0; index < arrFunc.length; index++)
            if (arrFunc[index] < dblMin) {
                dblMin = arrFunc[index];
            }
        return dblMin;
    }

    double method2(double[] values) {
        double min = values[0];
        for (int f = 0; f < values.length; f++) if (values[f] < min) min = values[f];
        return min;
    }
}
