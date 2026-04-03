package equivalent;

import java.util.Arrays;

public class ClonePair7448 {
    String method1(String s, int length, char c) {
        if (length <= s.length()) {
            return s;
        }
        char[] pad = new char[length - s.length()];
        Arrays.fill(pad, c);
        return new String(pad) + s;
    }

    String method2(String s, int length, char c) {
        int needed = length - s.length();
        if (needed <= 0) {
            return s;
        }
        StringBuffer sb = new StringBuffer(length);
        for (int i = 0; i < needed; i++) {
            sb.append(c);
        }
        sb.append(s);
        return (sb.toString());
    }
}
