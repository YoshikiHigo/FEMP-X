package inequivalent;

public class ClonePair9629 {

    boolean method1(char[] keep, char[] kill) {
        if (keep.length < kill.length) {
            return false;
        }
        for (int i = 0; i < kill.length; i++) {
            if (kill[i] != keep[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(char[] str, char[] pat) {
        int stri;
        int pati;
        int starstri;
        int starpati;
        final int strlen = str.length;
        final int patlen = pat.length;
        stri = pati = 0;
        starstri = starpati = -1;
        while (true) {
            if (pati < patlen) {
                final char patc = pat[pati];
                switch (patc) {
                    case '?':
                        if (stri == strlen) break;
                        stri++;
                        pati++;
                        continue;
                    case '*':
                        pati++;
                        starpati = pati;
                        starstri = stri;
                        continue;
                    default:
                        if (stri < strlen && str[stri] == patc) {
                            stri++;
                            pati++;
                            continue;
                        }
                        break;
                }
            } else if (stri == strlen) return true;
            if (starpati < 0 || starstri == strlen) return false;
            pati = starpati;
            starstri++;
            stri = starstri;
        }
    }
}
