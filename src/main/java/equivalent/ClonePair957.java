package equivalent;

public class ClonePair957 {
    boolean method1(float denom, float numer, float[] t) {
        if (denom > 0.0f) {
            if (numer > denom * t[1]) return false;
            if (numer > denom * t[0]) t[0] = numer / denom;
            return true;
        } else if (denom < 0.0f) {
            if (numer > denom * t[0]) return false;
            if (numer > denom * t[1]) t[1] = numer / denom;
            return true;
        } else {
            return numer <= 0.0;
        }
    }

    boolean method2(float denom, float numer, float[] t) {
        if (denom > 0.0f) {
            if (numer > denom * t[1]) {
                return false;
            }
            if (numer > denom * t[0]) {
                t[0] = numer / denom;
            }
            return true;
        } else if (denom < 0.0f) {
            if (numer > denom * t[0]) {
                return false;
            }
            if (numer > denom * t[1]) {
                t[1] = numer / denom;
            }
            return true;
        } else {
            return numer <= 0.0;
        }
    }
}
