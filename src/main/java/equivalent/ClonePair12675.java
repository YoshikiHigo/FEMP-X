package equivalent;

public class ClonePair12675 {
    boolean method1(byte[] data, int offset, int len) {
        for (int c = offset; c < len + offset; c++) if (data[c] != 0) return true;
        return false;
    }

    boolean method2(byte[] sector, int offset, int len) {
        int i;
        for (i = offset; i < offset + len; i++) {
            if ((sector)[i] != 0) return true;
        }
        return false;
    }
}
