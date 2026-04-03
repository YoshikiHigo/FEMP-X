package equivalent;

public class ClonePair3111 {
    int method1(Object o1, Object o2) {
        int res;
        if ((Double) o1 > (Double) o2) {
            res = 1;
        } else if ((Double) o1 < (Double) o2) {
            res = -1;
        } else {
            res = 0;
        }
        return res;
    }

    int method2(Object o1, Object o2) {
        Double sample1 = (Double) o1;
        Double sample2 = (Double) o2;
        if (sample1.doubleValue() > sample2.doubleValue()) {
            return 1;
        }
        if (sample1.doubleValue() < sample2.doubleValue()) {
            return -1;
        }
        return 0;
    }
}
