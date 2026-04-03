package equivalent;

public class ClonePair7487 {
    String method1(String sStr, int num, char pad) {
        int i, iLen;
        iLen = sStr.length();
        if (iLen < num) {
            for (i = 1; i <= num - iLen; i++) sStr = pad + sStr;
        }
        return sStr;
    }

    String method2(String s, int length, char c) {
        int needed = length - s.length();
        if (needed <= 0) {
            return s;
        }
        char[] padding = new char[needed];
        java.util.Arrays.fill(padding, c);
        String sb = String.valueOf(padding) +
                s;
        return sb;
    }
}
