package equivalent;

public class ClonePair3368 {
    boolean method1(int[] pattern1, int[] pattern2) {
        int len = pattern1.length;
        for (int i = 0; i < len; i++) {
            if (pattern1[i] != pattern2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(int[] orig, int[] dest) {
        for (int i = 0; i < orig.length; i++) if (orig[i] != dest[i]) return false;
        return true;
    }
}
