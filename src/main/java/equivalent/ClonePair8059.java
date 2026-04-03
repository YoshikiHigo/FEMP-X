package equivalent;

public class ClonePair8059 {
    int method1(int at, int len) {
        if (at < 0) return (at % len + len) % len;
        else return at % len;
    }

    int method2(int a, int b) {
        int res = a % b;
        if (res < 0 && b > 0) {
            res += b;
        }
        return res;
    }
}
