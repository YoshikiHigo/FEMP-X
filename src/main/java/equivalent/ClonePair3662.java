package equivalent;

public class ClonePair3662 {
    String method1(String s, int length, char c, boolean leading) {
        if (s.length() >= length) {
            return s;
        } else {
            StringBuffer buf = new StringBuffer(length);
            if (!leading) {
                buf.append(s);
            }
            for (int i = s.length(); i < length; ++i) {
                buf.append(c);
            }
            if (leading) {
                buf.append(s);
            }
            return buf.toString();
        }
    }

    String method2(String s, int n, char c, boolean paddingLeft) {
        StringBuffer str = new StringBuffer(s);
        int strLength = str.length();
        if (n > 0 && n > strLength) {
            for (int i = 0; i <= n; i++) {
                if (paddingLeft) {
                    if (i < n - strLength) str.insert(0, c);
                } else {
                    if (i > strLength) str.append(c);
                }
            }
        }
        return str.toString();
    }
}
