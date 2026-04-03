package equivalent;

public class ClonePair909 {
    boolean method1(char[] key, int offset, int length, char[] word) {
        if (word.length != length) {
            return false;
        } else {
            for (int i = 0; i < length; i++) {
                if (word[i] != key[offset + i]) {
                    return false;
                }
            }
            return true;
        }
    }

    boolean method2(char[] a, int start, int length, char[] a2) {
        if (a2.length != length) return false;
        for (int i = 0; i < length; i++) {
            if (a[i + start] != a2[i]) return false;
        }
        return true;
    }
}
