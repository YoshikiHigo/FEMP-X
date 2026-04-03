package inequivalent;

public class ClonePair9312 {

    double method1(double alpha) {
        double x = alpha, f = 0.0, z;
        if (x < 7) {
            f = 1;
            z = x - 1;
            while (++z < 7) {
                f *= z;
            }
            x = z;
            f = -Math.log(f);
        }
        z = 1 / (x * x);
        return f + (x - 0.5) * Math.log(x) - x + 0.918938533204673 + (((-0.000595238095238 * z + 0.000793650793651) * z - 0.002777777777778) * z + 0.083333333333333) / x;
    }

    double method2(double x) {
        final double C0 = 0.918938533204673;
        final double C1 = 8.33333333333333333e-02;
        final double C3 = -2.77777777777777778e-03;
        final double C5 = 7.93650793650793651e-04;
        final double C7 = -5.95238095238095238e-04;
        double f, z;
        if (x < 7.0) {
            f = 1.0;
            z = x - 1.0;
            for (z = z + 1.0; z < 7; z += 1.0) {
                x = z;
                f = f * z;
            }
            x = x + 1.0;
            f = -Math.log(f);
        } else {
            f = 0;
        }
        z = (1.0 / x) * (1.0 / x);
        return (f + (x - 0.5) * Math.log(x) - x + C0 + (((C7 * z + C5) * z + C3) * z + C1) / x);
    }
}
