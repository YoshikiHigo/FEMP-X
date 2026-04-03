package equivalent;

public class ClonePair11003 {
    int method1(CharSequence s1, CharSequence s2) {
        final int l1 = (s1 == null) ? 0 : s1.length(), l2 = (s2 == null) ? 0 : s2.length(), lCommon = Math.min(l1, l2);
        for (int cIndex = 0; cIndex < lCommon; cIndex++) {
            final char c1 = s1.charAt(cIndex), c2 = s2.charAt(cIndex);
            if (c1 != c2) return c1 - c2;
        }
        return l1 - l2;
    }

    int method2(CharSequence text1, CharSequence text2) {
        if (text1 == null) text1 = "";
        if (text2 == null) text2 = "";
        int len = Math.min(text1.length(), text2.length());
        for (int i = 0; i < len; i++) {
            char ch1 = text1.charAt(i);
            char ch2 = text2.charAt(i);
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }
        return text1.length() - text2.length();
    }
}
