package inequivalent;

public class ClonePair949 {

    double method1(double x, boolean upper) {
        if (x < 0) {
            x = -x;
            upper = !upper;
        }
        double y = 0.5 * x * x;
        double alnorm;
        if ((x > 7.0) && !(upper && x <= 18.66)) {
            alnorm = 0;
        } else if (x <= 1.28) {
            alnorm = 0.5 - x * (0.398942280444 - 0.39990348504 * y / (y + 5.75885480458 - 29.8213557807 / (y + 2.62433121679 + 48.6959930692 / (y + 5.92885724438))));
        } else {
            alnorm = 0.398942280385 * Math.exp(-y) / (x - 3.8052e-8 + 1.00000615302 / (x + 3.98064794e-4 + 1.98615381364 / (x - 0.151679116635 + 5.29330324926 / (x + 4.8385912808 - 15.1508972451 / (x + 0.742380924027 + 30.789933034 / (x + 3.99019417011))))));
        }
        return upper ? alnorm : 1 - alnorm;
    }

    double method2(double x, boolean isUpper) {
        if (x < 0.0D) {
            isUpper = !isUpper;
            x = -x;
        }
        double d1;
        if ((x <= 8.0D) || ((isUpper) && (x <= 37.0D))) {
            double d2 = 0.5D * x * x;
            if (x >= 1.28D) {
                d1 = 0.398942280385D * Math.exp(-d2) / (x - 3.8052E-08D + 1.00000615302D / (x + 0.000398064794D + 1.98615381364D / (x - 0.151679116635D + 5.29330324926D / (x + 4.8385912808D - 15.150897245099999D / (x + 0.742380924027D + 30.789933034000001D / (x + 3.99019417011D))))));
            } else {
                d1 = 0.5D - x * (0.398942280444D - 0.399903438504D * d2 / (d2 + 5.75885480458D - 29.821355780800001D / (d2 + 2.62433121679D + 48.6959930692D / (d2 + 5.92885724438D))));
            }
        } else {
            d1 = 0.0D;
        }
        if (!isUpper) {
            d1 = 1.0D - d1;
        }
        return d1;
    }
}
