package equivalent;

public class ClonePair7391 {
    int method1(byte[] s, int from) {
        int p = from;
        while (p < s.length && s[p] != 0) p++;
        return (p - from);
    }

    int method2(byte[] bytes, int p) {
        int c, i;
        for (i = p, c = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) break;
            else c++;
        }
        return c;
    }
}
