package equivalent;

public class ClonePair3631 {
    boolean method1(int[] tuple1, int[] tuple2) {
        int arity = tuple1.length;
        for (int i = 0; i < arity; i++) if (tuple1[i] != tuple2[i]) return false;
        return true;
    }

    boolean method2(int[] arrayOne, int[] arrayTwo) {
        boolean result = true;
        for (int idx = 0; idx < arrayOne.length; idx++) {
            if (arrayOne[idx] != arrayTwo[idx]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
