package inequivalent;

public class ClonePair5146 {

    boolean method1(double[] a, double[] b) {
        if ((a[0] >= 0 && b[0] >= 0) || (a[0] < 0 && b[0] < 0)) {
            if ((a[1] >= 0 && b[1] >= 0) || (a[1] < 0 && b[1] < 0)) {
                return (a[2] >= 0 && b[2] >= 0) || (a[2] < 0 && b[2] < 0);
            }
        }
        return false;
    }

    boolean method2(double[] vector1, double[] vector2) {
        for (int i = 0; i < 3; i++) if (vector1[i] != vector2[i]) return false;
        return true;
    }
}
