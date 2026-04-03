package equivalent;

public class ClonePair9069 {
    int method1(int... xs) {
        int max = xs[0];
        for (int i = 1; i < xs.length; ++i) if (xs[i] > max) max = xs[i];
        return max;
    }

    int method2(int... array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
