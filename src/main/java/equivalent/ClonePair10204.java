package equivalent;

public class ClonePair10204 {
    double method1(double x) {
        int exp, sign;
        long ix;
        if (x == 0) return x;
        ix = Double.doubleToLongBits(x);
        sign = (int) ((ix >> 63) & 1);
        exp = ((int) (ix >> 52) & 0x7ff) - 0x3ff;
        if (exp < 0) {
            if (x < 0.0) return -1.0;
            else if (x == 0.0) return x;
            else return 0.0;
        } else if (exp < 53) {
            long mask = (0x000fffffffffffffL >>> exp);
            if ((mask & ix) == 0) return x;
            if (x < 0.0) ix += 0x0010000000000000L >> exp;
            ix = ix & (~mask);
        } else if (exp == 1024) {
            return x;
        }
        return Double.longBitsToDouble(ix);
    }

    double method2(double x) {
        int exp;
        long ix;
        if (x == 0) return x;
        ix = Double.doubleToLongBits(x);
        exp = ((int) (ix >> 52) & 0x7ff) - 0x3ff;
        if (exp < 0) {
            if (x < 0.0) return -1.0;
            else if (x == 0.0) return x;
            else return 0.0;
        } else if (exp < 53) {
            long mask = (0x000fffffffffffffL >>> exp);
            if ((mask & ix) == 0) return x;
            if (x < 0.0) ix += 0x0010000000000000L >> exp;
            ix = ix & (~mask);
        } else if (exp == 1024) {
            return x;
        }
        return Double.longBitsToDouble(ix);
    }
}
