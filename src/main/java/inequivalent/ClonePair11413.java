package inequivalent;

public class ClonePair11413 {

    long method1(byte[] ar, int offset, int length) {
        long rs = 0;
        for (int i = 0; i < length; i++) {
            rs += (long) (ar[offset + i] & 0xFF) << (i * 8);
        }
        return rs;
    }

    long method2(byte[] rep, int off, int len) {
        long l = 0;
        for (int i = 0; i < len; i++) l |= ((long) (rep[i + off] & 0xFF)) << (8 * i);
        return l;
    }
}
