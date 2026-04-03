package equivalent;

public class ClonePair11284 {
    int method1(int[] sizes, int numSizes) {
        int size = 0;
        for (int i = 0; i < numSizes; i++) {
            size += sizes[i];
        }
        return size;
    }

    int method2(int[] array, int upto) {
        int result = 0;
        for (int i = 0; i < upto; i++) result += array[i];
        return result;
    }
}
