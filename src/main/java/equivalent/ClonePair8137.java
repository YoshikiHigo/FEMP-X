package equivalent;

public class ClonePair8137 {
    long method1(long[] values) {
        long max = values[0];
        for (long l : values) {
            if (l > max) {
                max = l;
            }
        }
        return max;
    }

    long method2(long[] a) {
        long res = a[0];
        long buff;
        for (int i = 1; i < a.length; i++) {
            buff = a[i];
            if (buff > res) {
                res = buff;
            }
        }
        return res;
    }
}
