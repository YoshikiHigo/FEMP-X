package equivalent;

public class ClonePair8759 {
    float[] method1(float[] a, int size) {
        if (a.length == size) {
            return a;
        } else {
            float[] b = new float[size];
            System.arraycopy(a, 0, b, 0, size);
            return b;
        }
    }

    float[] method2(float[] v, int n) {
        int iN = v.length;
        if (iN == n) return v;
        float[] nv = new float[n];
        System.arraycopy(v, 0, nv, 0, n);
        return nv;
    }
}
