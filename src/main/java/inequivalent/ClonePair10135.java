package inequivalent;

public class ClonePair10135 {

    double method1(double d) {
        if (d >= 1.0) return (0.5 * Math.PI - d / (d * d + 0.28));
        if (d <= -1.0) return (-0.5 * Math.PI - d / (d * d + 0.28));
        return (d / (1.0 + 0.28 * d * d));
    }

    double method2(double x) {
        final long bits = Double.doubleToLongBits(x);
        final int nHighWord = (int) (bits >> 32);
        final int ix = nHighWord & 0x7FFFFFFF;
        if (ix >= 0x44100000) {
            if (ix > 0x7FF00000 || ix == 0x7FF00000 && (int) bits != 0) {
                return Double.NaN;
            }
            return (nHighWord > 0 ? Double.longBitsToDouble(0x3FF921FB54442D18L) + Double.longBitsToDouble(0x3C91A62633145C07L) : -(Double.longBitsToDouble(0x3FF921FB54442D18L) + Double.longBitsToDouble(0x3C91A62633145C07L)));
        }
        int id = -1;
        double xx = x;
        if (ix < 0x3FDC0000) {
            if (ix < 0x3E200000 && 1.0e300 + x > 1.) {
                return x;
            }
        } else {
            xx = Math.abs(x);
            if (ix < 0x3ff30000) {
                if (ix < 0x3FE60000) {
                    xx = (xx + xx - 1.) / (2. + xx);
                    id = 0;
                } else {
                    xx = (xx - 1.) / (xx + 1.);
                    id = 1;
                }
            } else {
                if (ix < 0x40038000) {
                    xx = (xx - 1.5) / (1. + 1.5 * xx);
                    id = 2;
                } else {
                    xx = -1. / xx;
                    id = 3;
                }
            }
        }
        double z = xx * xx;
        final double w = z * z;
        final double s1 = z * (Double.longBitsToDouble(0x3FD555555555550DL) + w * (Double.longBitsToDouble(0x3FC24924920083FFL) + w * (Double.longBitsToDouble(0x3FB745CDC54C206EL) + w * (Double.longBitsToDouble(0x3FB10D66A0D03D51L) + w * (Double.longBitsToDouble(0x3FA97B4B24760DEBL) + w * Double.longBitsToDouble(0x3F90AD3AE322DA11L))))));
        final double s2 = w * (Double.longBitsToDouble(0xBFC999999998EBC4L) + w * (Double.longBitsToDouble(0xBFBC71C6FE231671L) + w * (Double.longBitsToDouble(0xBFB3B0F2AF749A6DL) + w * (Double.longBitsToDouble(0xBFADDE2D52DEFD9AL) + w * Double.longBitsToDouble(0xBFA2B4442C6A6C2FL)))));
        switch (id) {
            case 0:
                z = Double.longBitsToDouble(0x3FDDAC670561BB4FL) - ((xx * (s1 + s2) - Double.longBitsToDouble(0x3C7A2B7F222F65E2L)) - xx);
                return (nHighWord >= 0 ? z : -z);
            case 1:
                z = Double.longBitsToDouble(0x3FE921FB54442D18L) - ((xx * (s1 + s2) - Double.longBitsToDouble(0x3C81A62633145C07L)) - xx);
                return (nHighWord >= 0 ? z : -z);
            case 2:
                z = Double.longBitsToDouble(0x3FEF730BD281F69BL) - ((xx * (s1 + s2) - Double.longBitsToDouble(0x3C7007887AF0CBBDL)) - xx);
                return (nHighWord >= 0 ? z : -z);
            case 3:
                z = Double.longBitsToDouble(0x3FF921FB54442D18L) - ((xx * (s1 + s2) - Double.longBitsToDouble(0x3C91A62633145C07L)) - xx);
                return (nHighWord >= 0 ? z : -z);
        }
        return xx - xx * (s1 + s2);
    }
}
