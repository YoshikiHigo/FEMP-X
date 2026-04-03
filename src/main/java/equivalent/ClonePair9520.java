package equivalent;

public class ClonePair9520 {
    boolean method1(int[] values) {
        for (int k = 1; k < values.length; k++) if (values[0] != values[k]) return false;
        return true;
    }

    boolean method2(int[] index) {
        for (int i = 1; i < index.length; i++) {
            if (index[i] != index[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
