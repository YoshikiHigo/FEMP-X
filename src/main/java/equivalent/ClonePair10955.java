package equivalent;

public class ClonePair10955 {
    int method1(char[] chars, int offset, int length) {
        int utflen = 0;
        for (int i = 0; i < length; i++) {
            int c = chars[i + offset];
            if ((c >= 0x0001) && (c <= 0x007F)) {
                utflen++;
            } else if (c > 0x07FF) {
                utflen += 3;
            } else {
                utflen += 2;
            }
        }
        return utflen;
    }

    int method2(char[] cs, int off, int len) {
        int result = 0;
        for (int i = 0; i < len; ++i) {
            char c = cs[off + i];
            if ((c >= 0x0001) && (c <= 0x007F)) {
                ++result;
            } else {
                if (c > 0x07FF) {
                    result += 3;
                } else {
                    result += 2;
                }
            }
        }
        return result;
    }
}
