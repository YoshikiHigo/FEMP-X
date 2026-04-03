package equivalent;

public class ClonePair4782 {
    double method1(double[] verteces) {
        double l;
        l = verteces[0];
        for (int i = 0; i < verteces.length; i++) {
            if (verteces[i] < l) {
                l = verteces[i];
            }
        }
        return l;
    }

    double method2(double[] array) {
        double min = array[0];
        for (double d : array) if (d < min) min = d;
        return min;
    }
}
