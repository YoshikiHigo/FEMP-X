package equivalent;

public class ClonePair2998 {
    boolean method1(byte[] bs1, byte[] bs2) {
        if (bs1 != null && bs1.length == 0) bs1 = null;
        if (bs2 != null && bs2.length == 0) bs2 = null;
        if (bs1 == null && bs2 == null) return true;
        if (bs1 != null && bs2 != null && bs1.length == bs2.length) {
            int length = bs1.length;
            for (int i = 0; i < length; i++) {
                if (bs1[i] != bs2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    boolean method2(byte[] array1, byte[] array2) {
        if (array1 == null || array1.length == 0) {
            return array2 == null || array2.length == 0;
        }
        if (array2 == null || array1.length != array2.length) {
            return false;
        }
        for (int i = array1.length - 1; i >= 0; i--) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
