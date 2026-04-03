package inequivalent;

public class ClonePair3648 {

    float[] method1(float[] in) {
        float[] out = new float[3];
        out[0] = (float) (3.13383065124221 * in[0] - 1.61711949411313 * in[1] - 0.49071914111101 * in[2]);
        out[1] = (float) (-0.97847026691142 * in[0] + 1.91597856031996 * in[1] + 0.03340430640699 * in[2]);
        out[2] = (float) (0.07203679486279 * in[0] - 0.22903073553113 * in[1] + 1.40557835776234 * in[2]);
        if (out[0] < 0) out[0] = 0f;
        if (out[1] < 0) out[1] = 0f;
        if (out[2] < 0) out[2] = 0f;
        if (out[0] > 1.0f) out[0] = 1.0f;
        if (out[1] > 1.0f) out[1] = 1.0f;
        if (out[2] > 1.0f) out[2] = 1.0f;
        return out;
    }

    float[] method2(float[] in) {
        float[] temp = new float[3];
        temp[0] = 3.1338f * in[0] - 1.6171f * in[1] - 0.4907f * in[2];
        temp[1] = -0.9785f * in[0] + 1.9160f * in[1] + 0.0334f * in[2];
        temp[2] = 0.0720f * in[0] - 0.2290f * in[1] + 1.4056f * in[2];
        float[] out = new float[3];
        for (int i = 0; i < 3; i++) {
            if (temp[i] < 0) temp[i] = 0.0f;
            if (temp[i] > 1) temp[i] = 1.0f;
            if (temp[i] <= 0.00304f) out[i] = temp[i] * 12.92f;
            else out[i] = 1.055f * ((float) Math.exp((1 / 2.4) * Math.log(temp[i]))) - 0.055f;
        }
        return out;
    }
}
