package equivalent;

public class ClonePair12710 {
    int method1(double[] o1, double[] o2) {
        int result;
        double val1;
        double val2;
        result = 0;
        val1 = o1[1];
        val2 = o2[1];
        if (val1 < val2) {
            result = 1;
        } else {
            if (val1 > val2) {
                result = -1;
            }
        }
        return result;
    }

    int method2(double[] o1, double[] o2) {
        int result;
        double val1;
        double val2;
        result = 0;
        val1 = o1[1];
        val2 = o2[1];
        if (val1 > val2) {
            result = -1;
        } else {
            if (val1 < val2) {
                result = 1;
            }
        }
        return result;
    }
}
