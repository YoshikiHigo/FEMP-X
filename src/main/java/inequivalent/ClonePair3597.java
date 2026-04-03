package inequivalent;

public class ClonePair3597 {

    boolean method1(int[] test1, int[] test2) {
        boolean isEqual = true;
        if (test1.length != test2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < test1.length; i++) {
                if (test1[i] != test2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }

    boolean method2(int[] lhs, int[] rhs) {
        if (lhs == rhs) return true;
        if (lhs.length != rhs.length) return false;
        for (int ii = 0; ii < lhs.length; ii++) if (lhs[ii] != rhs[ii]) return false;
        return true;
    }
}
