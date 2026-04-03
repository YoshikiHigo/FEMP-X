package equivalent;

public class ClonePair7744 {
    int method1(byte[] b) {
        int number = 0;
        for (int i = 0; i < 4; ++i) {
            number |= (b[3 - i] & 0xff) << (i << 3);
        }
        return number;
    }

    int method2(byte[] bytes) {
        int i = 0;
        int j = 24;
        for (int k = 0; j >= 0; k++) {
            int l = bytes[k] & 0xff;
            i += l << j;
            j -= 8;
        }
        return i;
    }
}
