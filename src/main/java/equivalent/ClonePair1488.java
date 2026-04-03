package equivalent;

public class ClonePair1488 {
    boolean method1(byte[] key1, byte[] key2) {
        if (key1 == null) return (key2 == null);
        if (key2 == null) return false;
        if (key1.length != key2.length) return false;
        for (int i = 0; i < key1.length; i++) if (key1[i] != key2[i]) return false;
        return true;
    }

    boolean method2(byte[] left, byte[] right) {
        if (left == null) {
            return (right == null);
        }
        if (right == null) {
            return (left == null);
        }
        if (left.length != right.length) return false;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i]) return false;
        }
        return true;
    }
}
