package equivalent;

public class ClonePair4912 {
    float method1(float v) {
        while (v < -180.0f) v += 360.0f;
        while (v > 180.0f) v -= 360.0f;
        return v;
    }

    float method2(float angle) {
        float a = angle;
        while (a > 180) a -= 360;
        while (a < -180) a += 360;
        return a;
    }
}
