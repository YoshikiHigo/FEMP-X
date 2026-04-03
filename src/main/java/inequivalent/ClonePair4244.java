package inequivalent;

public class ClonePair4244 {

    boolean method1(float[] f1, float[] f2) {
        if (f1.length != f2.length) return false;
        for (int i = 0; i < f1.length; i++) if (Math.abs(f1[i] - f2[i]) >= .1f) return false;
        return true;
    }

    boolean method2(float[] a, float[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
