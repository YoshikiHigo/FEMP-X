package inequivalent;

public class ClonePair2 {

    double method1(Integer[] curr, Integer[] orig, int a, int b) {
        double diff = 0;
        for (int i = 0; i < curr.length; i++) {
            diff += Math.abs(curr[i] - orig[i]);
        }
        return diff / (a * b);
    }

    double method2(Integer[] curr, Integer[] orig, int a, int b) {
        double diff = 0;
        for (int i = 0; i < curr.length; i++) {
            diff += (curr[i] - orig[i]) * (curr[i] - orig[i]);
        }
        return Math.sqrt(diff) / (a * b);
    }
}
