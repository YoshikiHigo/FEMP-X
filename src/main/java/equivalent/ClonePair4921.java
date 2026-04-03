package equivalent;

public class ClonePair4921 {
    float method1(float f) {
        if (f <= 0.0) return 0.0f;
        if (f >= 1.0) return 1.0f;
        return f;
    }

    float method2(float d) {
        if (d > 0f) {
            if (d < 1f) {
                return d;
            }
            return 1f;
        }
        return 0f;
    }
}
