package equivalent;

public class ClonePair9193 {
    int method1(byte[] b, int len, byte c) {
        for (int pos = 0; pos < len; pos++) {
            if (b[pos] == c) {
                return pos;
            }
        }
        return -1;
    }

    int method2(byte[] buf, int len, byte b) {
        for (int i = 0; i < len; ++i) if (buf[i] == b) return i;
        return -1;
    }
}
