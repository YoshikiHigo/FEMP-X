package equivalent;

public class ClonePair6950 {
    int method1(int a, int b, int c) {
        if (a > b) {
            if (b > c) return b;
            if (a > c) return c;
            return a;
        }
        if (a > c) return a;
        if (b > c) return c;
        return b;
    }

    int method2(int a, int b, int c) {
        if (a > b) {
            if (c > b) {
                if (c > a) b = a;
                else b = c;
            }
        } else {
            if (b > c) {
                if (c > a) b = c;
                else b = a;
            }
        }
        return b;
    }
}
