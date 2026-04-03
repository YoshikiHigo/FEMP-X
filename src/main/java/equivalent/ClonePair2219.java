package equivalent;

public class ClonePair2219 {
    boolean method1(byte[] bytea, byte[] byteb) {
        boolean equal = true;
        if (bytea.length == byteb.length) {
            for (int i = 0; i < bytea.length; i++) {
                if (bytea[i] != byteb[i]) {
                    equal = false;
                    break;
                }
            }
        } else {
            equal = false;
        }
        return equal;
    }

    boolean method2(byte[] array1, byte[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int len = array1.length;
        for (int i = 0; i < len; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
