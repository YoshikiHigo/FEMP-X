package equivalent;

public class ClonePair6395 {
    long method1(byte[] array, int offset) {
        long ret = 0;
        for (int i = 0; i < 8; i++) {
            ret <<= 8;
            ret |= array[7 - i + offset] & 0xFF;
        }
        return ret;
    }

    long method2(byte[] data, int offset) {
        long value = 0;
        for (int i = offset + 7; i >= offset; i--) {
            value <<= 8;
            value |= ((long) data[i]) & 0xff;
        }
        return value;
    }
}
