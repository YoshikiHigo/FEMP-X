package inequivalent;

public class ClonePair4085 {

    double method1(double a, double b) {
        if (a == Double.NEGATIVE_INFINITY) {
            if (b == Double.NEGATIVE_INFINITY) return Double.NEGATIVE_INFINITY;
            return b;
        } else if (b == Double.NEGATIVE_INFINITY) return a;
        else if (a > b) return a + Math.log(1 + Math.exp(b - a));
        else return b + Math.log(1 + Math.exp(a - b));
    }

    double method2(double logX, double logY) {
        if (logY > logX) {
            double temp = logX;
            logX = logY;
            logY = temp;
        }
        if (logX == Double.NEGATIVE_INFINITY) {
            return logX;
        }
        double negDiff = logY - logX;
        if (negDiff < -20) {
            return logX;
        }
        return logX + java.lang.Math.log(1.0 + java.lang.Math.exp(negDiff));
    }
}
