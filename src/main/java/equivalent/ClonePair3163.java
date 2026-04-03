package equivalent;

public class ClonePair3163 {
    float method1(float[] d) {
        float dmax = d[0];
        for (int i = 0; i < d.length; i++) if (d[i] > dmax) dmax = d[i];
        return dmax;
    }

    float method2(float[] f) {
        float highest = f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i] > highest) {
                highest = f[i];
            }
        }
        return highest;
    }
}
