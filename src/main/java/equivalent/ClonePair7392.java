package equivalent;

public class ClonePair7392 {
    String method1(String source, int toLen, char withChar) {
        if (source == null) {
            source = "";
        }
        int srclen = source.length();
        if (srclen >= toLen) return source;
        else {
            int padLen = toLen - srclen;
            char[] result = new char[toLen];
            System.arraycopy(source.toCharArray(), 0, result, padLen, srclen);
            for (int i = 0; i < padLen; i++) result[i] = withChar;
            return new String(result);
        }
    }

    String method2(String str, int len, char c) {
        if (str == null) str = "";
        if (str.length() >= len) return str;
        StringBuilder sb = new StringBuilder(len);
        for (int ii = (len - str.length()); ii > 0; ii--) sb.append(c);
        sb.append(str);
        return sb.toString();
    }
}
