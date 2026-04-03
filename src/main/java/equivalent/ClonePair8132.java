package equivalent;

public class ClonePair8132 {
    double[] method1(double[] in, int lb1, int ub1) {
        double[] out = new double[ub1 - lb1 + 1];
        System.arraycopy(in, lb1 + 0, out, 0, out.length);
        return out;
    }

    double[] method2(double[] vec, int start, int end) {
        double[] x = new double[end - start + 1];
        if (end - start + 1 >= 0) System.arraycopy(vec, start + 0, x, 0, end - start + 1);
        return x;
    }
}
