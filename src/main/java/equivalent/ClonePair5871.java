package equivalent;

public class ClonePair5871 {
    double method1(double[] coeff, double t) {
        int n = coeff.length - 1;
        double r = coeff[n];
        for (int i = n - 1; i >= 0; i--) {
            r = coeff[i] + (r * t);
        }
        return r;
    }

    double method2(double[] polynom, double x) {
        double sum = polynom[polynom.length - 1];
        for (int i = polynom.length - 2; i >= 0; i--) {
            sum = sum * x + polynom[i];
        }
        return sum;
    }
}
