package equivalent;

public class ClonePair6863 {
    int method1(byte[] b, int offset) {
        for (int i = offset; i < b.length; i++) {
            if (b[i] == 0) return i;
        }
        return -1;
    }

    int method2(byte[] data, int start) {
        int len = data.length;
        for (int i = start; i < len; i++) {
            if (data[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
