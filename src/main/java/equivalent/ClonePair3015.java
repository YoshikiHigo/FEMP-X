package equivalent;

public class ClonePair3015 {
    boolean method1(byte[] array1, byte[] array2) {
        boolean compareresult = false;
        if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
            compareresult = true;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    compareresult = false;
                    break;
                }
            }
        }
        return compareresult;
    }

    boolean method2(byte[] a, byte[] b) {
        if (a == null || b == null) {
            return false;
        }
        int aLength = a.length;
        if (aLength != b.length) {
            return false;
        }
        for (int i = 0; i < aLength; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
