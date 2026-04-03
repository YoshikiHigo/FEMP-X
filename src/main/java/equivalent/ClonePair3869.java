package equivalent;

public class ClonePair3869 {
    double method1(double x, double y) {
        final double xAbs = Math.abs(x);
        final double yAbs = Math.abs(y);
        if (xAbs == 0.0 && yAbs == 0.0) return 0.0;
        else if (xAbs < yAbs) return yAbs * Math.sqrt(1.0 + (x / y) * (x / y));
        else return xAbs * Math.sqrt(1.0 + (y / x) * (y / x));
    }

    double method2(double aa, double bb) {
        double cc = 0.0D, ratio = 0.0D;
        double amod = Math.abs(aa);
        double bmod = Math.abs(bb);
        if (amod == 0.0D) {
            cc = bmod;
        } else {
            if (bmod == 0.0D) {
                cc = amod;
            } else {
                if (amod <= bmod) {
                    ratio = amod / bmod;
                    cc = bmod * Math.sqrt(1.0D + ratio * ratio);
                } else {
                    ratio = bmod / amod;
                    cc = amod * Math.sqrt(1.0D + ratio * ratio);
                }
            }
        }
        return cc;
    }
}
