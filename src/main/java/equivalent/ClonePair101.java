package equivalent;

public class ClonePair101 {
    double method1(double pValue, double pBoundary1, double pBoundary2) {
        double lLowerBoundary = pBoundary1;
        double lUpperBoundary = pBoundary2;
        if (lLowerBoundary > lUpperBoundary) {
            final double lTmp = lLowerBoundary;
            lLowerBoundary = lUpperBoundary;
            lUpperBoundary = lTmp;
        }
        if (pValue < lLowerBoundary) {
            return lLowerBoundary;
        }
        if (pValue > lUpperBoundary) {
            return lUpperBoundary;
        }
        return pValue;
    }

    double method2(double a, double b, double c) {
        if (b > a) {
            if (c > b) {
                return b;
            }
            if (a > c) {
                return a;
            }
            return c;
        } else {
            if (c > a) {
                return a;
            }
            if (b > c) {
                return b;
            }
            return c;
        }
    }
}
