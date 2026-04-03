package inequivalent;

import java.util.Arrays;
import java.util.List;

public class ClonePair6084 {

    boolean method1(Object[] a, Object[] a2) {
        if (a == a2) {
            return true;
        }
        if (a == null || a2 == null) {
            return false;
        }
        int length = a.length;
        if (a2.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (a[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(Object[] array1, Object[] array2) {
        if ((array1 == null) && (array2 == null)) {
            return true;
        } else if ((array1 == null) || (array2 == null)) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        List<Object> list = Arrays.asList(array2);
        for (int i = 0; i < array1.length; i++) {
            Object o1 = array1[i];
            if (!list.contains(o1)) {
                return false;
            }
        }
        return true;
    }
}
