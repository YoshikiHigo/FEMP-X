package equivalent;

public class ClonePair7857 {
    int method1(char[] a, int fromIndex, int toIndex, char c) {
        while (fromIndex < toIndex) {
            if (a[fromIndex] == c) return fromIndex;
            ++fromIndex;
        }
        return -1;
    }

    int method2(char[] buf, int offset, int len, char c) {
        int i = offset - 1;
        int lim = offset + len;
        while (++i < lim) {
            if (buf[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
