package equivalent;

public class ClonePair3513 {
    boolean method1(int[] int1, int[] int2) {
        boolean result = false;
        if (int1 == null || int2 == null) {
            return result;
        }
        if (int1.length == int2.length) {
            result = true;
            int i = 0;
            while ((i < int1.length) & result) {
                result = ((int1[i] == int2[i]));
                i++;
            }
        }
        return result;
    }

    boolean method2(int[] s0, int[] s1) {
        if (s0 == null || s1 == null) {
            return false;
        }
        if (s0.length != s1.length) {
            return false;
        }
        for (int i = 0; i < s0.length; i++) {
            if (s0[i] != s1[i]) {
                return false;
            }
        }
        return true;
    }
}
