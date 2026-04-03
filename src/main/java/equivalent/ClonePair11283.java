package equivalent;

public class ClonePair11283 {
    int method1(byte[] srcBuffer, short[] destBuffer, int srcLength, int destOffset, int destLength, short mask) {
        final int length = Math.min(destLength * 2, (srcLength / 2) * 2);
        for (int i = 0; i < length; i += 2) {
            final int tmp = (srcBuffer[i] & 0xFF | (srcBuffer[i + 1] << 8)) & mask;
            destBuffer[(i / 2) + destOffset] = (short) tmp;
        }
        return length;
    }

    int method2(byte[] srcBuffer, short[] destBuffer, int srcLength, int destOffset, int destLength, short mask) {
        srcLength = Math.min(destLength * 2, (srcLength / 2) * 2);
        for (int i = 0; i < srcLength; i += 2) {
            final int tmp = (srcBuffer[i] & 0xff | (srcBuffer[i + 1] << 8)) & mask;
            destBuffer[(i / 2) + destOffset] = (short) tmp;
        }
        return srcLength;
    }
}
