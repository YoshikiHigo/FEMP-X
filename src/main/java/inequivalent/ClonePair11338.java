package inequivalent;

public class ClonePair11338 {

    double method1(int offset, int length, double[] a) {
        double res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res += a[i];
        }
        return res;
    }

    double method2(int offset, int length, double[] a) {
        double res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res *= a[i];
        }
        return res;
    }
}
