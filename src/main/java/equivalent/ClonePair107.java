package equivalent;

public class ClonePair107 {
    double method1(double y0, double y1, double y2) {
        if ((y0 <= y1) && (y0 <= y2)) {
            return y0;
        } else if (y1 <= y2) {
            return y1;
        } else {
            return y2;
        }
    }

    double method2(double val1, double val2, double val3) {
        if (val1 < val2) {
            return val1 < val3 ? val1 : val3;
        } else {
            return val2 < val3 ? val2 : val3;
        }
    }
}
