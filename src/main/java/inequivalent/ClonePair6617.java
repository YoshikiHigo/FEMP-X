package inequivalent;

public class ClonePair6617 {

    double method1(double x, int decimal) {
        int factor = 10;
        int plusminus;
        if (x >= 0) plusminus = 1;
        else plusminus = -1;
        for (int i = 0; i < decimal; i++) factor = factor * 10;
        x = x * factor;
        double mod = (x % 10) * plusminus;
        if (mod >= 5) x += plusminus * (10 - mod);
        else x -= plusminus * mod;
        x = x / factor;
        return x;
    }

    double method2(double d, int ndec) {
        int dd = 1;
        for (int i = 0; i < ndec; i++) {
            dd *= 10;
        }
        return ((double) Math.round(d * (double) dd)) / (double) dd;
    }
}
