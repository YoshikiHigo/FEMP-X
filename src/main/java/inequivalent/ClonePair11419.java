package inequivalent;

public class ClonePair11419 {

    long method1(byte[] b, int offset, int size) {
        long value = 0;
        for (int i = 0; i < size; i++) {
            value = (value << 8) | (b[offset + i] & 0xFF);
        }
        return value;
    }

    long method2(byte[] ah_byte, int offset, int an_bytes) {
        long ln_return = 0L;
        for (int ln = offset, ln_1 = an_bytes - 1; ln < offset + an_bytes; ln++, ln_1--) {
            ln_return += ((long) ah_byte[ln] & 0xff) << ln_1 * 8;
        }
        return ln_return;
    }
}
