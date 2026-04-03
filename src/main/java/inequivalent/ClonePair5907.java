package inequivalent;

public class ClonePair5907 {

    double method1(double originX, double originY, double x, double y) {
        double adj = x - originX;
        double opp = y - originY;
        double rad = 0.0;
        if (adj == 0) {
            if (opp == 0) return 0.0;
            else rad = Math.PI / 2;
        } else {
            rad = Math.atan(opp / adj);
            if (rad < 0) rad = -rad;
        }
        if (x >= originX) {
            if (y < originY) rad = 2 * Math.PI - rad;
        } else {
            if (y < originY) rad = Math.PI + rad;
            else rad = Math.PI - rad;
        }
        return rad;
    }

    double method2(double x1, double y1, double x2, double y2) {
        double a = (x2 - x1);
        double b = (y2 - y1);
        double length = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (length == 0) {
            return 0;
        }
        double p = length;
        double theta = Math.asin(Math.abs(b) / p);
        if (b < 0) {
            theta = -theta;
        }
        if (a < 0) {
            theta = Math.PI - theta;
        }
        theta %= 2 * Math.PI;
        if (theta < 0) {
            theta += 2 * Math.PI;
        }
        return theta;
    }
}
