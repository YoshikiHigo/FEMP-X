package equivalent;

public class ClonePair12754 {
    short method1(byte[] bytes, int lsbIndex) {
        short out = 0;
        if (lsbIndex + 1 < bytes.length) {
            out = bytes[lsbIndex + 1];
            out = (short) (out << 8);
        }
        if (lsbIndex < bytes.length) out |= 0xFF & bytes[lsbIndex];
        return out;
    }

    short method2(byte[] bytes, int pos) {
        if (bytes.length < pos + 2) {
            return 0;
        }
        return (short) (((bytes[pos] & 0xff) << 0) + ((bytes[pos + 1] & 0xff) << 8));
    }
}
