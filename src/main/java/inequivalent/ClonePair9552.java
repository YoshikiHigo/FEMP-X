package inequivalent;

public class ClonePair9552 {

    int method1(double[] values) {
        double minimum = Double.POSITIVE_INFINITY;
        int position = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minimum) {
                position = i;
                minimum = values[i];
            }
        }
        return position;
    }

    int method2(double[] array) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if ((result == -1) || (array[result] > array[i])) {
                result = i;
            }
        }
        return result;
    }
}
