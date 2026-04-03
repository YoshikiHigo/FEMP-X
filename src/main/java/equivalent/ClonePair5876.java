package equivalent;

public class ClonePair5876 {
    int method1(int[] ints, int from, int to, int value) {
        for (int i = from; i < to; i++) {
            if (ints[i] == value) return i;
        }
        return -1;
    }

    int method2(int[] array, int start, int end, int element) {
        for (int i = start; i < end; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
