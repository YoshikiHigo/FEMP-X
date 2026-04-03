package equivalent;

public class ClonePair9611 {
    boolean method1(char[] b1, char[] b2) {
        if (b1 == null) {
            return (b2 == null);
        } else if (b2 == null) {
            return false;
        } else if (b1 == b2) {
            return true;
        } else if (b1.length != b2.length) {
            return false;
        }
        for (int i = 0; i < b1.length; i++) {
            if (b1[i] != b2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(char[] array1, char[] array2) {
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
