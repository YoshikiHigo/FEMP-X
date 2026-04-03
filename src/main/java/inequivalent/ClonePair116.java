package inequivalent;

public class ClonePair116 {

    double method1(double x, double a, double b) {
        if (Double.isNaN(x) || Double.isNaN(a) || Double.isNaN(b)) return Double.NaN;
        double result = Double.NaN;
        if ((!Double.isNaN(x)) && (!Double.isNaN(a)) && (!Double.isNaN(b))) if ((x >= a) && (x < b)) result = 1;
        else result = 0;
        return result;
    }

    double method2(double x, double a, double b) {
        if (Double.isNaN(x) || Double.isNaN(a) || Double.isNaN(b)) return Double.NaN;
        double result = Double.NaN;
        if ((!Double.isNaN(x)) && (!Double.isNaN(a)) && (!Double.isNaN(b))) if ((x > a) && (x < b)) result = 1;
        else result = 0;
        return result;
    }
}
