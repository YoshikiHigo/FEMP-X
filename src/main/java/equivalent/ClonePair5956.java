package equivalent;

public class ClonePair5956 {
    int method1(byte[] a, byte[] v, int from, int to) {
        for (int i = from; i < to; ++i) {
            boolean substringMatch = true;
            for (int j = 0; j < v.length; ++j) {
                if (a[i + j] != v[j]) {
                    substringMatch = false;
                    break;
                }
            }
            if (substringMatch) return i;
        }
        return -1;
    }

    int method2(byte[] a, byte[] v, int from, int to) {
        for (int i = from; i < to; ++i) {
            boolean foundMatch = true;
            for (int j = 0; j < v.length; ++j) {
                if (a[i + j] != v[j]) {
                    foundMatch = false;
                    break;
                }
            }
            if (foundMatch) {
                return i;
            }
        }
        return -1;
    }
}
