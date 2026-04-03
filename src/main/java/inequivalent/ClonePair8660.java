package inequivalent;

public class ClonePair8660 {

    int method1(double d) {
        double absD = Math.abs(d);
        if (absD == 0) return 0;
        int decPos = 0;
        if (absD >= 1) {
            while (absD >= 0.999999999999) {
                absD /= 10f;
                decPos++;
            }
            decPos--;
        } else {
            while (absD <= 0.999999999999) {
                absD *= 10f;
                decPos--;
            }
        }
        return decPos;
    }

    int method2(double d) {
        int exp = 0;
        boolean positive = (d <= -1 || d >= 1);
        while ((d <= -10) || (d >= 10) || ((d > -1) && (d < 1))) {
            if (positive) {
                d /= 10;
                exp++;
            } else {
                d *= 10;
                exp--;
            }
        }
        return exp;
    }
}
