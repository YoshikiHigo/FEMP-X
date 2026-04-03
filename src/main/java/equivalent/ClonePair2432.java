package equivalent;

public class ClonePair2432 {
    boolean method1(byte[] src, byte[] cmp) {
        for (int i = 0; i < cmp.length; i++) {
            if (src[i] != cmp[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] source, byte[] match) {
        int i = 0;
        while (source.length < i || i < match.length) {
            if (source[i] != match[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
