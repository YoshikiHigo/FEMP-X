package equivalent;

public class ClonePair8782 {
    byte[] method1(byte[] src, int start, int end) {
        final int cells = end - start + 1;
        byte[] n = new byte[cells];
        System.arraycopy(src, 0 + start, n, 0, cells);
        return n;
    }

    byte[] method2(byte[] packet, int start, int stop) {
        byte[] ret = new byte[stop - start + 1];
        if (stop + 1 - start >= 0) System.arraycopy(packet, start, ret, start - start, stop + 1 - start);
        return ret;
    }
}
