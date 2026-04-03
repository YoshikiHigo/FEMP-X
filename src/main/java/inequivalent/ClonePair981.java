package inequivalent;

public class ClonePair981 {

    boolean method1(double a, double b, double tolerance) {
        double denom = 0.5 * (Math.abs(a) + Math.abs(b));
        if (denom < 1) {
            return (Math.abs(a - b) <= tolerance);
        } else {
            return (Math.abs(a - b) / denom <= tolerance);
        }
    }

    boolean method2(double a, double b, double tolerance) {
        if (a == 0 && b == 0) {
            return true;
        }
        return (Math.abs((a - b) / (0.5 * (Math.abs(a) + Math.abs(b)))) <= tolerance);
    }
}
