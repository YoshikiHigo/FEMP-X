package equivalent;

public class ClonePair6964 {
    int method1(byte[] data, int offset) {
        byte[] tmp = new byte[4];
        System.arraycopy(data, offset, tmp, 0, 4);
        int number;
        number = 0;
        for (int i = 0; i < 4; ++i) {
            number |= (tmp[3 - i] & 0xff) << (i << 3);
        }
        return number;
    }

    int method2(byte[] b, int offset) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int shift = (4 - 1 - i) * 8;
            value += ((int) b[i + offset] & 0xFF) << shift;
        }
        return value;
    }
}
