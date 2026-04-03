package inequivalent;

public class ClonePair4156 {

    float method1(float min, float max, float value) {
        if (value <= min) {
            return min;
        } else if (value >= max) {
            return max;
        } else {
            return value;
        }
    }

    float method2(float min, float max, float n) {
        final float d = max - min;
        while (n < min) {
            n += d;
        }
        while (n > max) {
            n -= d;
        }
        return n;
    }
}
