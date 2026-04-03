package equivalent;

public class ClonePair8633 {
    short method1(int sample) {
        if (sample < Short.MIN_VALUE) {
            return Short.MIN_VALUE;
        } else if (sample > Short.MAX_VALUE) {
            return Short.MAX_VALUE;
        }
        return (short) sample;
    }

    short method2(int i) {
        int result = i;
        if (result > Short.MAX_VALUE) {
            return Short.MAX_VALUE;
        }
        if (result < Short.MIN_VALUE) {
            return Short.MIN_VALUE;
        }
        return (short) i;
    }
}
