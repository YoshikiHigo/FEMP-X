package equivalent;

public class ClonePair7943 {
    boolean method1(byte[] a, int aStart, byte[] b, int bStart, int length) {
        if (a.length < (aStart + length)) return false;
        if (b.length < (bStart + length)) return false;
        for (int i = 0; i < length; i++) {
            if (a[aStart + i] != b[bStart + i]) return false;
        }
        return true;
    }

    boolean method2(byte[] a, int aStart, byte[] b, int bStart, int length) {
        if (a.length < (aStart + length)) {
            return false;
        }
        if (b.length < (bStart + length)) return false;
        for (int i = 0; i < length; i++) {
            if (a[aStart + i] != b[bStart + i]) {
                return false;
            }
        }
        return true;
    }
}
