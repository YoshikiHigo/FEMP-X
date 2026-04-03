package equivalent;

public class ClonePair1297 {
    boolean method1(byte[] b1, byte[] b2) {
        boolean result = false;
        if (b1 == null && b2 == null) return true;
        if (b1 != null && b2 != null) {
            result = b1.length == b2.length;
            if (result) for (int i = 0; i < b1.length; i++)
                if (b1[i] != b2[i]) {
                    result = false;
                    break;
                }
        }
        return result;
    }

    boolean method2(byte[] from, byte[] to) {
        if ((from == null) && (to == null)) {
            return true;
        }
        if ((from == null) || (to == null)) {
            return false;
        }
        int i;
        int fromlen = from.length;
        int tolen = to.length;
        if (fromlen != tolen) {
            return false;
        }
        for (i = 0; i < fromlen; i++) {
            if (from[i] != to[i]) {
                return false;
            }
        }
        return true;
    }
}
