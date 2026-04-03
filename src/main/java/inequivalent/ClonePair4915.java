package inequivalent;

public class ClonePair4915 {

    float method1(float[] v, int length) {
        float sum = 0;
        for (int i = 0; i < length; i++) sum += v[i] * v[i];
        return (float) Math.sqrt(sum);
    }

    float method2(float[] x, int n) {
        int i;
        float normx = 0;
        for (i = 0; i < n; i++) normx = Math.max(normx, Math.abs(x[i]));
        return (normx);
    }
}
