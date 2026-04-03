package equivalent;

public class ClonePair6802 {
    boolean method1(int[] dest, int[] src, int len) {
        long carry = 1;
        boolean negative = src[len - 1] < 0;
        for (int i = 0; i < len; i++) {
            carry += ((long) (~src[i]) & 0xffffffffL);
            dest[i] = (int) carry;
            carry >>= 32;
        }
        return (negative && dest[len - 1] < 0);
    }

    boolean method2(int[] dest, int[] src, int len) {
        long carry = 1;
        boolean negative = src[len - 1] < 0;
        for (int i = 0; i < len; i++) {
            carry += ((~src[i]) & 0xffffffffL);
            dest[i] = (int) carry;
            carry >>= 32;
        }
        return (negative && dest[len - 1] < 0);
    }
}
