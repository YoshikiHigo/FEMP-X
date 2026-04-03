package equivalent;

public class ClonePair4196 {
    float method1(float value, float min, float max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        }
        return value;
    }

    float method2(float v, float min, float max) {
        if (v < min) {
            v = min;
        } else if (v > max) {
            v = max;
        }
        return v;
    }
}
