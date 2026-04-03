package equivalent;

public class ClonePair368 {
    boolean method1(byte[] x, byte[] y) {
        if (x == y) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (y[i] != x[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] content1, byte[] content2) {
        if (content1 == null) return (content2 == null);
        if (content1.length != content2.length) return false;
        for (int i = 0; i < content1.length; i++) if (content1[i] != content2[i]) return false;
        return true;
    }
}
