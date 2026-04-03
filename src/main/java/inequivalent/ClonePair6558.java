package inequivalent;

public class ClonePair6558 {

    int method1(double[] a, double key) {
        int low = 0;
        int hi = a.length - 1;
        int mid = 0;
        while (low <= hi) {
            mid = (low + hi) >> 1;
            final double d = a[mid];
            if (d == key) {
                return mid;
            } else if (d > key) {
                hi = mid - 1;
            } else {
                low = ++mid;
            }
        }
        return -mid - 1;
    }

    int method2(double[] a, double key) {
        int low = 0;
        int hi = a.length - 1;
        int mid = 0;
        while (low <= hi) {
            mid = (low + hi) >> 1;
            final int r = (int) (a[mid] - key);
            if (r == 0) return mid;
            else if (r > 0) hi = mid - 1;
            else low = ++mid;
        }
        return -mid - 1;
    }
}
