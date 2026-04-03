package inequivalent;

public class ClonePair7201 {

    long method1(int offset, int length, int[] a) {
        long res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res *= a[i];
        }
        return res;
    }

    long method2(int offset, int length, int[] a) {
        long res = a[offset];
        for (int i = offset + 1; i < offset + length; i++) {
            res += a[i];
        }
        return res;
    }
}
