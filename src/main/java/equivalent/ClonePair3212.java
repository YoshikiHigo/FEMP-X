package equivalent;

public class ClonePair3212 {
    boolean method1(byte[] src, int srcOff, byte[] bound) {
        int j = srcOff;
        for (int i = 0; i < bound.length; i++) {
            if (src[j] != bound[i]) {
                return false;
            }
            j++;
        }
        return true;
    }

    boolean method2(byte[] a, int offset, byte[] b) {
        for (int i = 0; i < b.length; i++) if (a[offset + i] != b[i]) return false;
        return true;
    }
}
