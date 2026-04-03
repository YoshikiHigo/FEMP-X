package equivalent;

public class ClonePair9555 {
    boolean method1(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1 && sorted; ++i) {
            sorted = array[i] < array[i + 1];
        }
        return sorted;
    }

    boolean method2(int[] values) {
        for (int i = 1; i < values.length; i++) {
            if (values[i - 1] >= values[i]) return false;
        }
        return true;
    }
}
