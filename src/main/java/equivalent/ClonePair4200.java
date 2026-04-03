package equivalent;

public class ClonePair4200 {
    float method1(float a, float b, float x) {
        if (x < a) return 0;
        if (x >= b) return 1;
        x = (x - a) / (b - a);
        return x * x * (3 - 2 * x);
    }

    float method2(float a, float b, float x) {
        float y = x;
        if (y < a) return 0;
        if (y >= b) return 1;
        y = (y - a) / (b - a);
        return y * y * (3 - 2 * y);
    }
}
