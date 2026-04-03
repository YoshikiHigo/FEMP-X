package equivalent;

public class ClonePair11324 {
    int method1(CharSequence s) {
        int l = s.length();
        int n = 0;
        while (n < l && s.charAt(n) == ' ') n++;
        return n;
    }

    int method2(CharSequence s) {
        final int l = s.length();
        int n = 0;
        while ((n < l) && (s.charAt(n) == ' ')) {
            n++;
        }
        return n;
    }
}
