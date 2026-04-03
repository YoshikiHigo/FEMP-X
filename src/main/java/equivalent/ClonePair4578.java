package equivalent;

public class ClonePair4578 {
    double method1(double i, double j) {
        if (Double.isNaN(i) || Double.isNaN(j)) return Double.NaN;
        if (i == j) return 1;
        else return 0;
    }

    double method2(double a, double b) {
        double result = 0;
        if (a == b) result = 1;
        if ((Double.isNaN(a)) || (Double.isNaN(b))) result = Double.NaN;
        return result;
    }
}
