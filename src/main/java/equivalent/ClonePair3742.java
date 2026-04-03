package equivalent;

public class ClonePair3742 {
    boolean method1(double[] x, double[] y, double delta) {
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(y[i] - x[i]) > delta) return false;
        }
        return true;
    }

    boolean method2(double[] x, double[] xold, double tolx) {
        boolean stop = true;
        for (int i = 0; i < x.length && stop; i++) {
            if (Math.abs(x[i] - xold[i]) > tolx) {
                stop = false;
                break;
            }
        }
        return stop;
    }
}
