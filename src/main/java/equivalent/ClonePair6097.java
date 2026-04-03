package equivalent;

import java.util.Objects;

public class ClonePair6097 {
    boolean method1(Object[] array1, Object[] array2) {
        boolean result = false;
        if ((array1 == null) && (array2 == null)) {
            result = true;
        } else if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
            final Object[] copyArray1 = new Object[array1.length];
            final Object[] copyArray2 = new Object[array2.length];
            System.arraycopy(array1, 0, copyArray1, 0, array1.length);
            System.arraycopy(array2, 0, copyArray2, 0, array2.length);
            result = true;
            for (int i = 0; i < copyArray1.length; i++) {
                if (!Objects.equals(copyArray1[i], copyArray2[i])) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    boolean method2(Object[] a, Object[] b) {
        if (a == b) return true;
        if ((a == null && b != null) || (a != null && b == null)) return false;
        if (a == null && b == null) return true;
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] != null) return false;
            } else {
                if (!a[i].equals(b[i])) return false;
            }
        }
        return true;
    }
}
