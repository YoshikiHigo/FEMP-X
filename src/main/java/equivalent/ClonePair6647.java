package equivalent;

public class ClonePair6647 {
    int method1(int a, int n) {
        if (n >= 16) {
            return (a < 0 ? -1 : 0);
        }
        if (n <= -16) {
            return 0;
        }
        if (n < 0) {
            return (a << -n);
        }
        return (a >> n);
    }

    int method2(int a, int n) {
        if (n >= 16) return (a < 0 ? -1 : 0);
        if (n <= -16) return 0;
        if (n < 0) return (a << -n);
        return (a >> n);
    }
}
