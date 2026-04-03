package equivalent;

public class ClonePair10991 {
    int method1(byte[] tok, byte[] sub, int p) {
        final int sl = sub.length;
        if (sl == 0) return 0;
        final int tl = tok.length - sl;
        if (p > tl) return -1;
        for (int t = p; t <= tl; t++) {
            int s = 0;
            while (sub[s] == tok[t + s]) if (++s == sl) return t;
        }
        return -1;
    }

    int method2(byte[] array, byte[] subsequence, int fromIndex) {
        if (subsequence.length == 0) return 0;
        else {
            int j;
            int stop = (array.length - subsequence.length) + 1;
            while (fromIndex < stop) {
                if (array[fromIndex] == subsequence[0]) {
                    j = 1;
                    while (j < subsequence.length) {
                        if (array[fromIndex + j] == subsequence[j]) j++;
                        else break;
                    }
                    if (j == subsequence.length) return fromIndex;
                }
                fromIndex++;
            }
            return -1;
        }
    }
}
