package equivalent;

public class ClonePair5863 {
    boolean method1(byte[] a, int aOffset, byte[] b, int bOffset, int length) {
        if ((a.length < aOffset + length) || (b.length < bOffset + length)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (a[aOffset + i] != b[bOffset + i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] a, int i, byte[] b, int j, int n) {
        if (a.length < i + n || b.length < j + n) return false;
        while (--n >= 0) if (a[i++] != b[j++]) return false;
        return true;
    }
}
