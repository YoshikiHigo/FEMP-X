package equivalent;

public class ClonePair8378 {
    boolean method1(byte[] lhs, byte[] rhs, int rhsOffset) {
        boolean result = true;
        for (int loop = 0; loop < lhs.length; loop++) {
            if (lhs[loop] != rhs[rhsOffset + loop]) {
                result = false;
                break;
            }
        }
        return (result);
    }

    boolean method2(byte[] chv1, byte[] chv2, int pos2) {
        for (int i = 0; i < chv1.length; i++) {
            if (chv1[i] != chv2[pos2 + i]) {
                return false;
            }
        }
        return true;
    }
}
