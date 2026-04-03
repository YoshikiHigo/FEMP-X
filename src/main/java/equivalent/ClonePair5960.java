package equivalent;

public class ClonePair5960 {
    boolean method1(long[] arrayA, int offsetA, int lengthA, long[] arrayB, int offsetB, int lengthB) {
        if (lengthA != lengthB) return false;
        for (int i = 0; i < lengthA; i++) if (arrayA[offsetA++] != arrayB[offsetB++]) return false;
        return true;
    }

    boolean method2(long[] a, int aoff, int alen, long[] b, int boff, int blen) {
        if (alen != blen) return false;
        else {
            for (int i = 0; i < alen; ++i) if (a[aoff + i] != b[boff + i]) return false;
            return true;
        }
    }
}
