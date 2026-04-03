package equivalent;

public class ClonePair3342 {
    boolean method1(int[] mark1, int[] mark2) {
        int m1 = mark1.length;
        int m2 = mark2.length;
        if (m1 != m2) {
            return false;
        } else {
            for (int i = 0; i < m1; i++) {
                if (mark1[i] != mark2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean method2(int[] expected, int[] actual) {
        boolean success = true;
        if (expected.length != actual.length) return false;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i]) {
                success = false;
                break;
            }
        }
        return success;
    }
}
