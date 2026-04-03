package inequivalent;

public class ClonePair4057 {

    double method1(double x, double y) {
        if (x == 0 && y == 0) {
            return 0;
        }
        double theta = Math.acos(x / Math.sqrt(x * x + y * y));
        if (y < 0) {
            theta = 2 * Math.PI - theta;
        }
        return theta % (2 * Math.PI);
    }

    double method2(double x, double y) {
        double theta = 0;
        if (x == 0) {
            if (y > 0) {
                theta = Math.PI / 2;
            } else if (y < 0) {
                theta = Math.PI * 3 / 2;
            }
        }
        if (x > 0) {
            theta = Math.atan(y / Math.abs(x));
        }
        if (x < 0) {
            theta = Math.PI - Math.atan(y / Math.abs(x));
        }
        if (theta < 0) {
            theta += Math.PI * 2;
        }
        return theta;
    }
}
