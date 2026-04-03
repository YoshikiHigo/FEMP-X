package equivalent;

public class ClonePair6506 {
    long method1(byte[] data, int offset) {
        long num = 0;
        for (int i = offset; i < offset + 8; i++) {
            num <<= 8;
            num |= (data[i] & 0xff);
        }
        return num;
    }

    long method2(byte[] b, int start) {
        long l = 0;
        for (int i = 0; i < 8; i++) {
            l <<= 8;
            l |= b[start + i] & 0xff;
        }
        return l;
    }
}
