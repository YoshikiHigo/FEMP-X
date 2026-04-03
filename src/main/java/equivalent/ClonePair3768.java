package equivalent;

public class ClonePair3768 {
    int method1(byte[] raw, boolean reverse) {
        int[] fix = new int[2];
        fix[0] = raw[0] < 0 ? 256 + raw[0] : raw[0];
        fix[1] = raw[1] < 0 ? 256 + raw[1] : raw[1];
        if (reverse) {
            return (fix[1] << 8) + fix[0];
        } else {
            return (fix[0] << 8) + fix[1];
        }
    }

    int method2(byte[] b, boolean littleEndian) {
        int i = 0;
        if (littleEndian) {
            i |= b[1] & 0xFF;
            i <<= 8;
            i |= b[0] & 0xFF;
        } else {
            i |= b[0] & 0xFF;
            i <<= 8;
            i |= b[1] & 0xFF;
        }
        return i;
    }
}
