package equivalent;

public class ClonePair8762 {
    boolean method1(byte[] arrayA, int offsetA, int lengthA, byte[] arrayB, int offsetB, int lengthB) {
        if (lengthA != lengthB) return false;
        for (int i = 0; i < lengthA; i++) if (arrayA[offsetA++] != arrayB[offsetB++]) return false;
        return true;
    }

    boolean method2(byte[] data1, int offset1, int size1, byte[] data2, int offset2, int size2) {
        if (size1 != size2) {
            return false;
        }
        for (int i = 0; i < size1; i += 1) {
            if (data1[i + offset1] != data2[i + offset2]) {
                return false;
            }
        }
        return true;
    }
}
