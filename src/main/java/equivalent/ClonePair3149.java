package equivalent;

public class ClonePair3149 {
    float method1(float[] data) {
        float max = data[0];
        for (int i = 1; i < data.length; ++i) if (data[i] > max) max = data[i];
        return max;
    }

    float method2(float[] chan) {
        float v = chan[0];
        for (int i = 0; i < chan.length; i++) v = Math.max(v, chan[i]);
        return v;
    }
}
