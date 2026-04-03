package equivalent;

public class ClonePair6493 {
    long method1(byte[] bytes, int offset) {
        long ret = 0;
        for (int i = 7; i >= 0; i--) {
            ret <<= 8;
            ret |= bytes[offset + i] & 0xFF;
        }
        return ret;
    }

    long method2(byte[] buffer, int offset) {
        long qWord = (((long) (buffer[offset + 7] & 0x7f) << 56) | ((long) (buffer[offset + 6] & 0x7f) << 48) | ((long) (buffer[offset + 5] & 0x7f) << 40) | ((long) (buffer[offset + 4] & 0x7f) << 32) | ((buffer[offset + 3] & 0x7f) << 24) | ((buffer[offset + 2] & 0x7f) << 16) | ((buffer[offset + 1] & 0x7f) << 8) | (buffer[offset] & 0x7f));
        if (buffer[offset + 6] < 0) qWord |= 0x0080000000000000L;
        if (buffer[offset + 5] < 0) qWord |= 0x0000800000000000L;
        if (buffer[offset + 4] < 0) qWord |= 0x0000008000000000L;
        if (buffer[offset + 3] < 0) qWord |= 0x0000000080000000L;
        if (buffer[offset + 2] < 0) qWord |= 0x0000000000800000L;
        if (buffer[offset + 1] < 0) qWord |= 0x0000000000008000L;
        if (buffer[offset] < 0) qWord |= 0x0000000000000080L;
        if (buffer[offset + 7] < 0) qWord = Long.MIN_VALUE + qWord;
        return qWord;
    }
}
