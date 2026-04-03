package equivalent;

public class ClonePair7390 {
    String method1(String in, int desiredLen, char padChar) {
        if (in.length() >= desiredLen) {
            return in;
        }
        StringBuffer result = new StringBuffer();
        result.append(in);
        for (int i = in.length(); i < desiredLen; i++) {
            result.append(padChar);
        }
        return result.toString();
    }

    String method2(String s, int len, char c) {
        int slen = s.length();
        if (slen >= len) return s;
        else {
            char[] pad = new char[len - slen];
            for (int i = len - slen - 1; i >= 0; i--) pad[i] = c;
            return s + new String(pad);
        }
    }
}
