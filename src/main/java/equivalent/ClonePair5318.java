package equivalent;

public class ClonePair5318 {
    int method1(byte[] a1, byte[] a2) {
        if (a1 == a2) {
            return 0;
        }
        if (a1 == null && a2 != null) {
            return -1;
        }
        if (a1 != null && a2 == null) {
            return 1;
        }
        int length = (a1.length < a2.length ? a1.length : a2.length);
        for (int i = 0; i < length; i++) {
            if (a1[i] != a2[i]) {
                return ((a1[i] & 0xff) > (a2[i] & 0xff) ? 1 : -1);
            }
        }
        if (a1.length == a2.length) {
            return 0;
        }
        if (a1.length < a2.length) {
            return -1;
        }
        return 1;
    }

    int method2(byte[] a1, byte[] a2) {
        if (a1 == a2) {
            return 0;
        }
        if (a1 == null) {
            return -1;
        }
        if (a2 == null) {
            return 1;
        }
        int length = (a1.length < a2.length ? a1.length : a2.length);
        for (int i = 0; i < length; i++) {
            if (a1[i] != a2[i]) {
                return ((a1[i] & 0xff) > (a2[i] & 0xff) ? 1 : -1);
            }
        }
        if (a1.length == a2.length) {
            return 0;
        }
        if (a1.length < a2.length) {
            return -1;
        }
        return 1;
    }
}
