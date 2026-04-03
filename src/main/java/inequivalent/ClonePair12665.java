package inequivalent;

public class ClonePair12665 {

    boolean method1(double min1, double max1, double min2, double max2) {
        if (max1 < min1) {
            double t = min1;
            min1 = max1;
            max1 = t;
        }
        if (max2 < min2) {
            double t = min2;
            min2 = max2;
            max2 = t;
        }
        return (((min1 >= min2) && (min1 <= max2)) || ((max1 >= min2) && (max1 <= max2)) || ((min2 >= min1) && (min2 <= max1)) || ((max2 >= min1) && (max2 <= max1)));
    }

    boolean method2(double a1, double a2, double b1, double b2) {
        if (b1 <= a1 && a1 <= b2) {
            return true;
        }
        if (b1 <= a2 && a2 <= b2) {
            return true;
        }
        if (a1 <= b1 && b1 <= a2) {
            return true;
        }
        if (a1 <= b2 && b2 <= a2) {
            return true;
        }
        if (b1 <= a1 && a2 <= b2) {
            return true;
        }
        return a1 <= b1 && b2 <= a2;
    }
}
