package inequivalent;

public class ClonePair10553 {

    double method1(double input) {
        double thresh = 0.0001;
        if ((input > 0 && input < thresh) || (input < 0 && input > -thresh)) {
            return 0;
        } else {
            return input;
        }
    }

    double method2(double value) {
        if (value == 0) return value;
        else if ((value > -Double.MIN_NORMAL) && (value < Double.MIN_NORMAL)) return 0;
        else return value;
    }
}
