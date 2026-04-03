package equivalent;

public class ClonePair2170 {
    boolean method1(byte[] a1, byte[] a2) {
        if (a1 == null) {
            return a2 == null;
        } else if (a2 == null) {
            return false;
        }
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    boolean method2(byte[] data1, byte[] data2) {
        if (data1 == data2) return true;
        if (data1 == null || data2 == null) return false;
        if (data1.length != data2.length) return false;
        for (int i = 0; i < data1.length; i++) {
            if (data1[i] != data2[i]) return false;
        }
        return true;
    }
}
