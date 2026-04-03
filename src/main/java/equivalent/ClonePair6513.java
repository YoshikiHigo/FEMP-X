package equivalent;

public class ClonePair6513 {
    long method1(byte[] b, int offset) {
        long accum = 0;
        long shiftedval;
        for (int shiftBy = 0, i = offset; shiftBy < 64; shiftBy += 8, i++) {
            shiftedval = ((long) (b[i] & 0xff)) << shiftBy;
            accum |= shiftedval;
        }
        return accum;
    }

    long method2(byte[] data, int offset) {
        long num = 0;
        for (int i = offset + 7; i > offset - 1; i--) {
            num <<= 8;
            num |= (data[i] & 0xff);
        }
        return num;
    }
}
