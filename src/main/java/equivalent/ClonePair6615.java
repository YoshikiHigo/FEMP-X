package equivalent;

public class ClonePair6615 {
    double method1(double base, int exponent) {
        double product = 1.0;
        if (exponent < 0) {
            for (; exponent != 0; exponent++) product *= base;
            return 1.0 / product;
        } else {
            for (; exponent != 0; exponent--) product *= base;
            return product;
        }
    }

    double method2(double base, int exponent) {
        switch (exponent) {
            case 0:
                return 1.0;
            case 1:
                return base;
            case 2:
                return base * base;
            case 3:
                return base * base * base;
            case 4:
                return base * base * base * base;
            default:
                return java.lang.Math.pow(base, exponent);
        }
    }
}
