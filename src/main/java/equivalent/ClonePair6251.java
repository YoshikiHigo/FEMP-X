package equivalent;

public class ClonePair6251 {
    int method1(byte[] b, int off, boolean bLittleEndian) {
        if (bLittleEndian) {
            return (b[off] & 0xff) | ((b[off + 1] & 0xff) << 8) | ((b[off + 2] & 0xff) << 16) | ((b[off + 3] & 0xff) << 24);
        }
        return ((b[off] & 0xff) << 24) | ((b[off + 1] & 0xff) << 16) | ((b[off + 2] & 0xff) << 8) | (b[off + 3] & 0xff);
    }

    int method2(byte[] buffer, int offset, boolean reverseEndian) {
        int r = 0;
        if (reverseEndian) {
            for (int i = offset + 3; i >= offset; i--) {
                r = r << 8;
                r += 0x000000FF & buffer[i];
            }
        } else {
            for (int i = offset; i < offset + 4; i++) {
                r = r << 8;
                r += 0x000000FF & buffer[i];
            }
        }
        return r;
    }
}
