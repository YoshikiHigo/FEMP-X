package equivalent;

public class ClonePair3385 {
    boolean method1(int[] int1, int[] int2) {
        if (int1 == null && int2 == null) {
            return true;
        } else if (int1 == null || int2 == null) {
            return false;
        }
        if (int1.length != int2.length) {
            return false;
        }
        for (int i = 0; i < int1.length; i++) {
            if (int1[i] != int2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(int[] array1, int[] array2) {
        boolean result = false;
        if (array1 == null) {
            result = array2 == null;
        } else if (array2 != null) {
            result = array1.length == array2.length;
            for (int i = 0; (i < array1.length) && result; i++) {
                result = array1[i] == array2[i];
            }
        }
        return result;
    }
}
