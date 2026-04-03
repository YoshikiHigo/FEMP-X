package inequivalent;

public class ClonePair9877 {

    double method1(double input) {
        double result = 0;
        if (input == 2.7199999999999998) {
            result = 2.72;
        } else if (input == 2.7800000000000002) {
            result = 2.78;
        } else if (input == 3.1399999999999997) {
            result = 3.14;
        } else if (input == 3.6799999999999997) {
            result = 3.68;
        } else {
            result = input;
        }
        return result;
    }

    double method2(double a) {
        double epsilon = 1.0e-10;
        final double WFG_min = 0.0;
        final double WFG_max = 1.0;
        final double min_epsilon = WFG_min - epsilon;
        final double max_epsilon = WFG_max + epsilon;
        if (a <= WFG_min && a >= min_epsilon) {
            return WFG_min;
        } else if (a >= WFG_max && a <= max_epsilon) {
            return WFG_max;
        } else {
            return a;
        }
    }
}
