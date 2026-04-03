package inequivalent;

public class ClonePair8159 {

    int method1(String s, int i, int[] ai) {
        int j = 0;
        int k = i;
        for (int l = s.length(); j < l; ) {
            int i1 = s.charAt(j++) << 16;
            ai[k++] = i1 | s.charAt(j++);
        }
        return k;
    }

    int method2(String s, int i, int[] ai) {
        int j = 0;
        int k = i;
        for (int l = s.length(); j < l; ) {
            int i1 = s.charAt(j++);
            char c = s.charAt(j++);
            do ai[k++] = c;
            while (--i1 > 0);
        }
        return k;
    }
}
