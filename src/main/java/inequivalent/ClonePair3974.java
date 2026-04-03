package inequivalent;

public class ClonePair3974 {

    double method1(double x, double y) {
        double angle;
        if (x < 0) {
            angle = Math.PI + Math.atan(y / x);
        } else {
            angle = Math.atan(y / x);
            if (y < 0) {
                angle = angle + 2 * Math.PI;
            }
        }
        return angle;
    }

    double method2(double x, double y) {
        double h = Math.sqrt(x * x + y * y);
        double theta = Math.acos(Math.abs(x) / h);
        if (x <= 0 && y > 0) theta = Math.PI - theta;
        if (x < 0 && y <= 0) theta = Math.PI + theta;
        if (x >= 0 && y < 0) theta = 2 * Math.PI - theta;
        return theta;
    }
}
