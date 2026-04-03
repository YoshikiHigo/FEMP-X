package inequivalent;

public class ClonePair1684 {

    boolean method1(byte[] x, byte[] y) {
        if (x == null || y == null) return false;
        if (x.length != y.length) return false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] array1, byte[] array2) {
        boolean equal = false;
        if (array1 == array2) {
            equal = true;
        } else if ((array1 != null) && (array2 != null)) {
            int length = array1.length;
            if (length == array2.length) {
                equal = true;
                for (int i = 0; i < length; i++) {
                    if (array1[i] != array2[i]) {
                        equal = false;
                        break;
                    }
                }
            } else {
                equal = false;
            }
        } else {
            equal = false;
        }
        return equal;
    }
}
