package equivalent;

public class ClonePair3158 {
    float method1(float[] f) {
        float lowest = f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i] < lowest) {
                lowest = f[i];
            }
        }
        return lowest;
    }

    float method2(float[] data) {
        float min = data[0];
        for (int i = 1; i < data.length; ++i) if (data[i] < min) min = data[i];
        return min;
    }
}
