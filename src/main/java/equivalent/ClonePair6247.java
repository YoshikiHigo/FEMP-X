package equivalent;

public class ClonePair6247 {
    int method1(byte[] buf, int offset, boolean isBigEndian) {
        int val;
        if (isBigEndian) {
            val = (buf[offset] << 8) & 0xFF00;
            val |= buf[++offset] & 0x00FF;
        } else {
            val = buf[offset] & 0x00FF;
            val |= (buf[++offset] << 8) & 0xFF00;
        }
        return val;
    }

    int method2(byte[] buf, int off, boolean bigEndian) {
        int val;
        if (bigEndian) {
            val = (((int) buf[off]) << 8) & 0x0000FF00;
            val |= (((int) buf[++off])) & 0x000000FF;
        } else {
            val = (((int) buf[off])) & 0x000000FF;
            val |= (((int) buf[++off]) << 8) & 0x0000FF00;
        }
        return (val);
    }
}
