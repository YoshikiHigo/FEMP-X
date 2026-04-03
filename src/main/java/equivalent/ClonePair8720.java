package equivalent;

public class ClonePair8720 {
    boolean method1(int[] arrayA, int offsetA, int lengthA, int[] arrayB, int offsetB, int lengthB) {
        if (lengthA != lengthB) return false;
        for (int i = 0; i < lengthA; i++) if (arrayA[offsetA++] != arrayB[offsetB++]) return false;
        return true;
    }

    boolean method2(int[] a, int aoff, int alen, int[] b, int boff, int blen) {
        if (alen != blen) return false;
        else {
            for (int i = 0; i < alen; ++i) if (a[aoff + i] != b[boff + i]) return false;
            return true;
        }
    }
}
