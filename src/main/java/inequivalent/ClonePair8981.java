package inequivalent;

public class ClonePair8981 {

    double method1(double x) {
        double absX = Math.abs(x);
        if (absX > 22.0) {
            return (x > 0.0) ? 1.0 : -1.0;
        } else if (absX > 1.0e-6) {
            double expX = Math.exp(x);
            double expMX = Math.exp(-x);
            return (expX - expMX) / (expX + expMX);
        } else {
            return x;
        }
    }

    double method2(double x) {
        if (x < -17) {
            return -1;
        }
        if (x > 17) {
            return 1;
        }
        return -1.0 + 2.0 / (1.0 + Math.exp(-2.0 * x));
    }
}
