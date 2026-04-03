package equivalent;

public class ClonePair13009 {
    int method1(long value) {
        if (value < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (value > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) value;
    }

    int method2(long value) {
        if (value < (long) Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (value > (long) Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) value;
        }
    }
}
