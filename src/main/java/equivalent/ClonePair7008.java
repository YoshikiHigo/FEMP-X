package equivalent;

public class ClonePair7008 {
    int method1(int i, int j, int k) {
        if (i < j) {
            return (i < k) ? i : k;
        } else {
            return (j < k) ? j : k;
        }
    }

    int method2(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        if (b <= a && b <= c) return b;
        return c;
    }
}
