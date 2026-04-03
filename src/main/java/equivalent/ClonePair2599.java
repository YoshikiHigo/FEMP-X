package equivalent;

public class ClonePair2599 {
    int method1(byte[] array) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int b = array[i];
            b &= 0xff;
            value |= (b << (i * 8));
        }
        return value;
    }

    int method2(byte[] bytes) {
        int q3 = bytes[3] << 24;
        int q2 = bytes[2] << 16;
        int q1 = bytes[1] << 8;
        int q0 = bytes[0];
        if (q2 < 0) q2 += 16777216;
        if (q1 < 0) q1 += 65536;
        if (q0 < 0) q0 += 256;
        return q3 | q2 | q1 | q0;
    }
}
