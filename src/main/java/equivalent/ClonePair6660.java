package equivalent;

public class ClonePair6660 {
    int method1(long value, byte[] buf, int offset, int length) {
        int idx = length - 1;
        buf[offset + idx] = 0;
        --idx;
        buf[offset + idx] = (byte) ' ';
        --idx;
        if (value == 0) {
            buf[offset + idx] = (byte) '0';
            --idx;
        } else {
            for (long val = value; idx >= 0 && val > 0; --idx) {
                buf[offset + idx] = (byte) ((byte) '0' + (byte) (val & 7));
                val = val >> 3;
            }
        }
        for (; idx >= 0; --idx) {
            buf[offset + idx] = (byte) ' ';
        }
        return offset + length;
    }

    int method2(long value, byte[] buffer, int offset, int length) {
        int idx = length - 1;
        buffer[offset + idx] = 0;
        --idx;
        buffer[offset + idx] = (byte) ' ';
        --idx;
        if (value == 0) {
            buffer[offset + idx] = (byte) '0';
            --idx;
        } else {
            long val = value;
            while (idx >= 0 && val > 0) {
                buffer[offset + idx] = (byte) ((byte) '0' + (byte) (val & 7));
                val = val >> 3;
                idx--;
            }
        }
        while (idx >= 0) {
            buffer[offset + idx] = (byte) ' ';
            idx--;
        }
        return offset + length;
    }
}
