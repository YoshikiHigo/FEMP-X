package equivalent;

public class ClonePair7690 {
    int method1(char[] s, int si, char[] t, int ti) {
        for (; s[si] == t[ti]; si++, ti++) {
            if (s[si] == 0) {
                return 0;
            }
        }
        if (t[ti] == 0) {
            return 0;
        }
        return s[si] - t[ti];
    }

    int method2(char[] s, int si, char[] t, int ti) {
        for (; s[si] == t[ti]; si++, ti++) if (s[si] == 0) return 0;
        if (t[ti] == 0) return 0;
        return s[si] - t[ti];
    }
}
