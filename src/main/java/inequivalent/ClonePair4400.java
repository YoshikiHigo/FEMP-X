package inequivalent;

public class ClonePair4400 {

    double method1(double x, double y) {
        double quot;
        if (Double.isNaN(x) || Double.isNaN(y)) return x + y;
        quot = x / y;
        return x - (quot < 0.0 ? java.lang.Math.ceil(quot) : java.lang.Math.floor(quot)) * y;
    }

    double method2(double a, double b) {
        if (Double.isNaN(a) || Double.isNaN(b)) return Double.NaN;
        return a % b;
    }
}
