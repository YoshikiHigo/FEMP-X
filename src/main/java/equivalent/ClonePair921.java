package equivalent;

public class ClonePair921 {
    boolean method1(byte[] one, byte[] two) {
        boolean isOneShorterOrEqualLength = (one.length <= two.length);
        int commonLength = Math.min(one.length, two.length);
        for (int i = 0; i < commonLength; i++) {
            int a = one[i];
            int b = two[i];
            a &= 0xFF;
            b &= 0xFF;
            if (a < b) {
                return true;
            }
            if (b < a) {
                return false;
            }
        }
        return isOneShorterOrEqualLength;
    }

    boolean method2(byte[] a, byte[] b) {
        if (a.length <= b.length) {
            for (int i = 0; i != a.length; i++) {
                int l = a[i] & 0xff;
                int r = b[i] & 0xff;
                if (r > l) {
                    return true;
                } else if (l > r) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 0; i != b.length; i++) {
                int l = a[i] & 0xff;
                int r = b[i] & 0xff;
                if (r > l) {
                    return true;
                } else if (l > r) {
                    return false;
                }
            }
            return false;
        }
    }
}
