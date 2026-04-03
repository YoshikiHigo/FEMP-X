package inequivalent;

public class ClonePair4402 {

    double method1(double a, double b) {
        if (b < 0) return (a < 0) ? a : -a;
        return (a > 0) ? a : -a;
    }

    double method2(double a, double b) {
        if ((a >= 0.0 && b >= 0.0) || (a < 0.0 && b < 0.0)) return a;
        else return -a;
    }
}
