package equivalent;

public class ClonePair958 {
    boolean method1(byte[] A, byte[] B) {
        if (A == null) return B == null;
        else if (B == null || A.length != B.length) return false;
        else for (int i = 0; i < A.length; i++) {
                if (A[i] != B[i]) return false;
            }
        return true;
    }

    boolean method2(byte[] a1, byte[] a2) {
        if (a1 == a2) return true;
        if (null == a1 || null == a2) return false;
        if (a1.length == a2.length) {
            int i = a1.length;
            while (--i >= 0) if (a1[i] != a2[i]) return false;
            return true;
        }
        return false;
    }
}
