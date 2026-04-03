package inequivalent;

public class ClonePair3594 {

    boolean method1(int[] a, int[] b) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(int[] cv, int[] cv2) {
        for (int i = 0; i < cv.length; i++) {
            if (cv[i] != cv2[i]) return false;
        }
        return true;
    }
}
