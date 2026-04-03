package equivalent;

public class ClonePair7193 {
    int method1(byte[] a, int aoff, int alen, byte[] b, int boff, int blen) {
        int compareLen = alen < blen ? alen : blen;
        for (int i = 0; i < compareLen; ++i) {
            int curA = a[aoff + i] & 0xFF;
            int curB = b[boff + i] & 0xFF;
            if (curA != curB) return curA - curB;
        }
        return alen - blen;
    }

    int method2(byte[] b1, int off1, int len1, byte[] b2, int off2, int len2) {
        for (int i = 0; i < len1 && i < len2; i++) {
            final int d = (b1[off1 + i] & 0xFF) - (b2[off2 + i] & 0xFF);
            if (d != 0) {
                return d;
            }
        }
        return len1 - len2;
    }
}
