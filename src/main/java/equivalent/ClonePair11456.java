package equivalent;

public class ClonePair11456 {
    long method1(byte[] b, int offset, int size) {
        long num = 0;
        long sw = 8L * ((long) size - 1L);
        for (int loop = 0; loop < size; loop++) {
            num |= ((long) b[offset + loop] & 0x00ff) << sw;
            sw -= 8;
        }
        return num;
    }

    long method2(byte[] b, int offset, int size) {
        long l = 0;
        for (int i = 0; i < size; ++i) l |= ((long) b[offset + i] & 0xff) << ((size - i - 1) << 3);
        return l;
    }
}
