package equivalent;

public class ClonePair6581 {
    float method1(float[] a, float[] b) {
        int length = a.length;
        float value = 0;
        for (int i = 0; i < length; ++i) value += a[i] * b[i];
        return value;
    }

    float method2(float[] v1, float[] v2) {
        float res = 0;
        for (int i = 0; i < v1.length; i++) res += v1[i] * v2[i];
        return res;
    }
}
