package equivalent;

public class ClonePair7092 {
    int method1(int t, int b, int c, int d) {
        if (t < 20) {
            return (b & c) | ((~b) & d);
        }
        if (t < 40) {
            return b ^ c ^ d;
        }
        if (t < 60) {
            return (b & c) | (b & d) | (c & d);
        }
        return b ^ c ^ d;
    }

    int method2(int k, int j, int m, int l) {
        if (k < 20) {
            return (j & m) | ((~j) & l);
        }
        if (k < 40) {
            return j ^ m ^ l;
        }
        if (k < 60) {
            return (j & m) | (j & l) | (m & l);
        }
        return j ^ m ^ l;
    }
}
