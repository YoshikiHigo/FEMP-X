package equivalent;

public class ClonePair6838 {
    int method1(int m, int n) {
        if (m <= 0 || n <= 0) return -1;
        int r;
        if (m < n) {
            r = m;
        } else {
            r = n;
        }
        while ((m % r != 0) || (n % r != 0)) r--;
        return r;
    }

    int method2(int m, int n) {
        if (m <= 0 || n <= 0) return -1;
        int r;
        if (m < n) {
            r = m;
            m = n;
            n = r;
        }
        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
