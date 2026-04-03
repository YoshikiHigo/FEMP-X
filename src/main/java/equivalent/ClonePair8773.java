package equivalent;

public class ClonePair8773 {
    int method1(int[] dest, int[] x, int size, int y) {
        long carry = y & 0xffffffffL;
        for (int i = 0; i < size; i++) {
            carry += (x[i] & 0xffffffffL);
            dest[i] = (int) carry;
            carry >>= 32;
        }
        return (int) carry;
    }

    int method2(int[] dest, int[] x, int size, int y) {
        long carry = (long) y & 0xffffffffL;
        for (int i = 0; i < size; i++) {
            carry += ((long) x[i] & 0xffffffffL);
            dest[i] = (int) carry;
            carry >>= 32;
        }
        return (int) carry;
    }
}
