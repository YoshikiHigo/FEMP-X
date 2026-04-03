package equivalent;

public class ClonePair3621 {
    boolean method1(int[] requiredVersion, int[] realVersion) {
        for (int i = 0; i < requiredVersion.length; i++) {
            if (realVersion[i] < requiredVersion[i]) {
                return false;
            } else if (realVersion[i] > requiredVersion[i]) {
                return true;
            }
        }
        return true;
    }

    boolean method2(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) return true;
            if (date1[i] > date2[i]) return false;
        }
        return true;
    }
}
