package equivalent;

public class ClonePair3068 {
    int method1(byte[] a, byte v, int from, int to) {
        for (int i = from; i < to; ++i) {
            if (a[i] == v) {
                return i;
            }
        }
        return -1;
    }

    int method2(byte[] a, byte v, int from, int to) {
        for (int i = from; i < to; ++i) if (a[i] == v) return i;
        return -1;
    }
}
