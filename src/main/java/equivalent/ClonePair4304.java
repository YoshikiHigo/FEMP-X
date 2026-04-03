package equivalent;

public class ClonePair4304 {
    double method1(double x, double y) {
        double angle = Math.atan(y / x);
        if (x == 0) if (y > 0) angle = Math.PI / 2;
        else angle = -Math.PI / 2;
        if (x < 0) angle += Math.PI;
        return angle;
    }

    double method2(double x, double y) {
        double angle = Math.atan(y / x);
        if (x == 0) {
            if (y > 0) {
                angle = Math.PI / 2;
            } else {
                angle = -Math.PI / 2;
            }
        }
        if (x < 0) {
            angle += Math.PI;
        }
        return angle;
    }
}
