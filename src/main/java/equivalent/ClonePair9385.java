package equivalent;

public class ClonePair9385 {
    int[] method1(int[] arr, int begin, int end) {
        int n = end - begin;
        int[] result = new int[n];
        if (end - begin >= 0) System.arraycopy(arr, begin, result, begin - begin, end - begin);
        return result;
    }

    int[] method2(int[] array, int fromIndex, int toIndex) {
        int[] array2 = new int[toIndex - fromIndex];
        if (toIndex - fromIndex >= 0)
            System.arraycopy(array, fromIndex, array2, fromIndex - fromIndex, toIndex - fromIndex);
        return array2;
    }
}
