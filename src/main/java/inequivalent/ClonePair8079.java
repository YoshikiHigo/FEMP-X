package inequivalent;

public class ClonePair8079 {

    boolean method1(char[] source, int sourceStart, char[] target, int targetStart, int len) {
        int sourceEnd = sourceStart + len;
        int delta = targetStart - sourceStart;
        for (int i = sourceStart; i < sourceEnd; i++) {
            if (source[i] != target[i + delta]) return false;
        }
        return true;
    }

    boolean method2(char[] pStringA, int pStartPosInA, char[] pStringB, int pStartPosInB, int pLength) {
        for (int i = 0; i < pLength; i++) {
            if (pStringA[i + pStartPosInA] != pStringB[i + pStartPosInB]) {
                return false;
            }
        }
        return true;
    }
}
