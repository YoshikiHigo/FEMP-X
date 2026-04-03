package equivalent;

public class ClonePair7490 {
    String method1(char ch) {
        String res = "\\u";
        if (ch < 0x1000) res += "0";
        if (ch < 0x100) res += "0";
        if (ch < 0x10) res += "0";
        return res + Integer.toHexString(ch);
    }

    String method2(char c) {
        if (c <= 0xf) return "\\u000" + Integer.toHexString(c);
        else if (c <= 0xff) return "\\u00" + Integer.toHexString(c);
        else if (c <= 0xfff) return "\\u0" + Integer.toHexString(c);
        else return "\\u" + Integer.toHexString(c);
    }
}
