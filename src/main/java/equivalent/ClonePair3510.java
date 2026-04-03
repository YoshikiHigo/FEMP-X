package equivalent;

public class ClonePair3510 {
    int method1(int needle, int[] stack, int maxLen) {
        for (int i = 0; i < maxLen; i++) {
            if (stack[i] == needle) {
                return i;
            }
        }
        return -1;
    }

    int method2(int element, int[] A, int puzzleSize) {
        for (int i = 0; i < puzzleSize; i++) if (A[i] == element) return i;
        return -1;
    }
}
