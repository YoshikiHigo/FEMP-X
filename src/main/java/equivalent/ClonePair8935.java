package equivalent;

public class ClonePair8935 {
    int method1(int[] terms, int start, int len) {
        int s = 0;
        final int iSz = start + len;
        for (int i = start; i < iSz; i++) {
            s += terms[i];
        }
        return s;
    }

    int method2(int[] terms, int start, int len) {
        int s = 0;
        for (int i = start, iSz = start + len; i < iSz; i++) s += terms[i];
        return s;
    }
}
