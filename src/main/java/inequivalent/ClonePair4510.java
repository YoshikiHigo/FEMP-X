package inequivalent;

public class ClonePair4510 {

    double method1(double d, double d1) {
        if (d == 0.0D && d1 == 0.0D) {
            return 0.0D;
        }
        double d2 = Math.sqrt(Math.pow(d, 2D) + Math.pow(d1, 2D));
        double d3 = Math.toDegrees(Math.acos(d / d2));
        if (Math.asin(d1 / d2) < 0.0D) {
            return 360D - d3;
        } else {
            return d3;
        }
    }

    double method2(double b, double a) {
        double h;
        if (a == 0 && b == 0) {
            h = 0;
        } else {
            h = Math.atan2(a, b);
        }
        h *= (180. / Math.PI);
        while (h > 360.) {
            h -= 360.;
        }
        while (h < 0) {
            h += 360.;
        }
        return h;
    }
}
