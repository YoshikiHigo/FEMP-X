package equivalent;

public class ClonePair2025 {
    int method1(byte[] b) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int shift = (3 - i) * 8;
            value += (b[i] & 0x000000FF) << shift;
        }
        return value;
    }

    int method2(byte[] ba) {
        int ret = 0;
        for (int i = 0; i < 4; i++) {
            ret = ret << 8;
            ret |= ba[i] & 0xFF;
        }
        return ret;
    }
}
