package equivalent;

public class ClonePair3976 {
    float method1(float x, float y) {
        if (y >= 0 && x <= -0) return -x;
        else if (y < 0 && x >= 0) return -x;
        else return x;
    }

    float method2(float x, float y) {
        if (y >= 0 && x <= -0) {
            return -x;
        } else if (y < 0 && x >= 0) {
            return -x;
        } else {
            return x;
        }
    }
}
