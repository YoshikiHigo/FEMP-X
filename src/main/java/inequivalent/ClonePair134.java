package inequivalent;

public class ClonePair134 {

    double method1(double v1, double v2, double h) {
        if (h < 0) h += 1;
        if (h > 1) h -= 1;
        if (h < 1.0 / 6.0) return v1 + (v2 - v1) * h * 6.0;
        else if (h < 0.5) return v2;
        else if (h < 2.0 / 3.0) return v1 + (v2 - v1) * (2.0 / 3.0 - h) * 6.0;
        return v1;
    }

    double method2(double v1, double v2, double vH) {
        if (vH < 0) vH += 1;
        if (vH > 1) vH -= 1;
        if ((6 * vH) < 1) return (v1 + (v2 - v1) * 6 * vH);
        if ((2 * vH) < 1) return (v2);
        if ((3 * vH) < 2) return (v1 + (v2 - v1) * ((2 / 3.0) - vH) * 6);
        return (v1);
    }
}
