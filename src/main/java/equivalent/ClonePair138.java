package equivalent;

public class ClonePair138 {
    double method1(double val, double lowerBound, double upperBound) {
        if (lowerBound == upperBound) {
            return lowerBound;
        }
        if (val < lowerBound) {
            return lowerBound;
        }
        if (val > upperBound) {
            return upperBound;
        }
        return val;
    }

    double method2(double value, double min, double max) {
        if (value <= max && value >= min) {
            return value;
        } else if (max < value) {
            return max;
        } else {
            return min;
        }
    }
}
