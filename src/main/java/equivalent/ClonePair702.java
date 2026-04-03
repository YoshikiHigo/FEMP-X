package equivalent;

public class ClonePair702 {
    boolean method1(byte[] b1, byte[] b2) {
        if (b1 == null && b2 == null) return true;
        if (b1 == null || b2 == null || b1.length != b2.length) return false;
        for (int c = 0; c < b1.length; c++) {
            if (b1[c] != b2[c]) return false;
        }
        return true;
    }

    boolean method2(byte[] b1, byte[] b2) {
        if (b1 == b2) return true;
        if (b1 == null || b2 == null) return false;
        int length = b1.length;
        if (length != b2.length) {
            return false;
        }
        for (int index = 0; index < length; index++) {
            if (!(b1[index] == b2[index])) {
                return false;
            }
        }
        return true;
    }
}
