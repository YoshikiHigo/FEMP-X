package equivalent;

public class ClonePair7964 {
    int method1(CharSequence string, CharSequence pattern, int fromIndex) {
        final int len = pattern.length();
        int index;
        {
            final int sLen = string.length();
            if (fromIndex > sLen - len) index = sLen + 1;
            else index = fromIndex + len + 1;
        }
        while (index-- > len) {
            int i = len;
            int j = index;
            while (i-- > 0) {
                if (string.charAt(--j) != pattern.charAt(i)) break;
            }
            if (i == -1) return j;
        }
        return -1;
    }

    int method2(CharSequence text, CharSequence seq, int fromIndex) {
        int textLength = text.length();
        int seqLength = seq.length();
        int rightIndex = textLength - seqLength;
        if (fromIndex < 0) {
            return -1;
        }
        if (fromIndex > rightIndex) {
            fromIndex = rightIndex;
        }
        if (seqLength == 0) {
            return fromIndex;
        }
        int strLastIndex = seqLength - 1;
        char strLastChar = seq.charAt(strLastIndex);
        int min = seqLength - 1;
        int i = min + fromIndex;
        startSearchForLastChar:
        while (true) {
            while (i >= min && text.charAt(i) != strLastChar) {
                i--;
            }
            if (i < min) {
                return -1;
            }
            int j = i - 1;
            int start = j - (seqLength - 1);
            int k = strLastIndex - 1;
            while (j > start) {
                if (text.charAt(j--) != seq.charAt(k--)) {
                    i--;
                    continue startSearchForLastChar;
                }
            }
            return start + 1;
        }
    }
}
