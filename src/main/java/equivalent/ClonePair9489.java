package equivalent;

public class ClonePair9489 {
    int method1(String rawdata, int i) {
        int length = rawdata.length();
        if (i < length) {
            char c = rawdata.charAt(i);
            while ((i < length) && Character.isWhitespace(c)) {
                ++i;
                c = rawdata.charAt(i);
            }
        }
        return i;
    }

    int method2(String s, int i) {
        int j = i;
        while (j < s.length() && Character.isWhitespace(s.charAt(j))) {
            ++j;
        }
        return j;
    }
}
