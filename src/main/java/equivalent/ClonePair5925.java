package equivalent;

public class ClonePair5925 {
    int method1(int a, int p) {
        assert p >= 0;
        if (p == 0) {
            return 1;
        } else {
            int result = a;
            for (int i = 1; i < p; ++i) {
                result = a * result;
            }
            return result;
        }
    }

    int method2(int n, int k) {
        assert (n >= 0) && (k >= 0);
        if (k == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            int accum = 1;
            for (int i = 0; i < k; i++) {
                assert (accum > 0) && ((n * accum) > 0);
                accum = n * accum;
            }
            return accum;
        }
    }
}
