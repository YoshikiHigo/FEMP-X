package equivalent;

public class ClonePair3463 {
    boolean method1(int[] ssid1, int[] ssid2) {
        if (ssid1.length == ssid2.length) {
            for (int i = 0; i < ssid1.length; i++) {
                if (ssid1[i] != ssid2[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    boolean method2(int[] p0, int[] p1) {
        if (p0.length != p1.length) {
            return false;
        }
        int size = p0.length;
        boolean nonEqual = false;
        for (int x = 0; x < size; x++) {
            nonEqual |= !(p0[x] == p1[x]);
        }
        return !nonEqual;
    }
}
