package equivalent;

public class ClonePair4839 {
    double method1(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    double method2(double[] array) {
        double max = array[0];
        for (double d : array) if (d > max) max = d;
        return max;
    }
}
