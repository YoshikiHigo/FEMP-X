package inequivalent;

public class ClonePair6244 {

    long method1(int offset, int length, long[] a) {
        long res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res *= a[i];
        }
        return res;
    }

    long method2(int offset, int length, long[] a) {
        long res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res += a[i];
        }
        return res;
    }
}
