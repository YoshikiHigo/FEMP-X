package inequivalent;

public class ClonePair12489 {

    int method1(int offset, int length, byte[] a) {
        int res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res += a[i];
        }
        return res;
    }

    int method2(int offset, int length, byte[] a) {
        int res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res *= a[i];
        }
        return res;
    }
}
