package equivalent;

public class ClonePair2969 {
    boolean method1(byte[] a, byte[] a2) {
        boolean equal = false;
        if (a == a2) {
            equal = true;
        } else if (a == null && a2 == null) {
            equal = true;
        } else if (a == null || a2 == null) {
            equal = false;
        } else if (a.length != a2.length) {
            equal = false;
        } else {
            equal = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != a2[i]) {
                    equal = false;
                    break;
                }
            }
        }
        return equal;
    }

    boolean method2(byte[] val1, byte[] val2) {
        boolean more;
        int i;
        if (val1 == null && val2 == null) {
            return true;
        }
        more = val1 != null && val2 != null && val1.length == val2.length;
        for (i = 0; more && i < val1.length; i++) {
            more = val1[i] == val2[i];
        }
        return more;
    }
}
