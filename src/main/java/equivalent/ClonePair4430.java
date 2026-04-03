package equivalent;

public class ClonePair4430 {
    boolean method1(float a, float b, float eps) {
        if (a < b) return b - a < eps;
        return a - b < eps;
    }

    boolean method2(float a, float b, float e) {
        return a + e > b && a - e < b;
    }
}
