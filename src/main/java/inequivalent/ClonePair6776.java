package inequivalent;

public class ClonePair6776 {

    boolean method1(double a, double b) {
        if (a == b) return true;
        double threshold = 1e-8;
        double diff = Math.abs(a - b);
        return diff < threshold || diff / Math.max(Math.abs(a), Math.abs(b)) < threshold;
    }

    boolean method2(double a, double b) {
        double epsilon = 1.0e-8;
        if (a == 0.0) {
            return (Math.abs(b) < epsilon);
        } else if (b == 0.0) {
            return (Math.abs(a) < epsilon);
        } else {
            return (Math.abs(a - b) < Math.abs(a) * epsilon);
        }
    }
}
