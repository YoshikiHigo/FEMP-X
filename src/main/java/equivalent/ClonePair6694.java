package equivalent;

public class ClonePair6694 {
    int method1(int val, int min, int max) {
        if (val < min) {
            return min;
        } else if (val > max) {
            return max;
        } else {
            return val;
        }
    }

    int method2(int val, int min, int max) {
        if (val < min) return min;
        if (val > max) return max;
        return val;
    }
}
