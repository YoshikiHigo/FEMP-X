package equivalent;

public class ClonePair2669 {
    int method1(byte[] bytes) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int x = (bytes[i] << i * 8) & (0xFF << i * 8);
            value += x;
        }
        return value;
    }

    int method2(byte[] b) {
        int s = 0;
        for (int i = 0; i < 3; i++) {
            if (b[3 - i] >= 0) {
                s = s + b[3 - i];
            } else {
                s = s + 256 + b[3 - i];
            }
            s = s * 256;
        }
        if (b[0] >= 0) {
            s = s + b[0];
        } else {
            s = s + 256 + b[0];
        }
        return s;
    }
}
