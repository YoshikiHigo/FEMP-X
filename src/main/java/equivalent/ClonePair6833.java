package equivalent;

public class ClonePair6833 {
    float method1(float[] x, int xs, float[] y, int ys, int len) {
        int i;
        float sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        for (i = 0; i < len; ) {
            sum1 += x[xs + i] * y[ys + i];
            sum2 += x[xs + i + 1] * y[ys + i + 1];
            sum3 += x[xs + i + 2] * y[ys + i + 2];
            sum4 += x[xs + i + 3] * y[ys + i + 3];
            i += 4;
        }
        return sum1 + sum2 + sum3 + sum4;
    }

    float method2(float[] x, int xs, float[] y, int ys, int len) {
        int i;
        float sum1 = 0;
        float sum2 = 0;
        float sum3 = 0;
        float sum4 = 0;
        for (i = 0; i < len; ) {
            sum1 += x[xs + i] * y[ys + i];
            sum2 += x[xs + i + 1] * y[ys + i + 1];
            sum3 += x[xs + i + 2] * y[ys + i + 2];
            sum4 += x[xs + i + 3] * y[ys + i + 3];
            i += 4;
        }
        return sum1 + sum2 + sum3 + sum4;
    }
}
