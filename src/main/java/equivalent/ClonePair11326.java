package equivalent;

public class ClonePair11326 {
    int method1(CharSequence s) {
        int l = s.length();
        int n = 0;
        while (n < l && s.charAt(l - n - 1) == ' ') n++;
        return n == s.length() ? 0 : n;
    }

    int method2(CharSequence s) {
        final int l = s.length();
        int n = 0;
        while ((n < l) && (s.charAt(l - n - 1) == ' ')) {
            n++;
        }
        return n == s.length() ? 0 : n;
    }
}
