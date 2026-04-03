package equivalent;

public class ClonePair129 {
    double method1(double value, double lb, double ub) {
        if (value < lb) {
            return lb;
        } else if (value > ub) {
            return ub;
        } else {
            return value;
        }
    }

    double method2(double x, double min, double max) {
        if (x < min) return min;
        if (x > max) return max;
        return x;
    }
}
