package equivalent;

public class ClonePair7026 {
    int method1(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= c && b >= a) return b;
        else return c;
    }

    int method2(int a, int b, int c) {
        int max = 0;
        if ((a >= b) && (a >= c)) {
            max = a;
        } else if ((b >= a) && (b >= c)) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }
}
