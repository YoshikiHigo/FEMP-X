package equivalent;

public class ClonePair1931 {
    String method1(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        byte tb;
        char low;
        char high;
        char tmpChar;
        String hexStr = "";
        for (int i = 0; i < bytes.length; i++) {
            tb = bytes[i];
            tmpChar = (char) ((tb >>> 4) & 0x000f);
            if (tmpChar >= 10) {
                high = (char) (('a' + tmpChar) - 10);
            } else {
                high = (char) ('0' + tmpChar);
            }
            hexStr += high;
            tmpChar = (char) (tb & 0x000f);
            if (tmpChar >= 10) {
                low = (char) (('a' + tmpChar) - 10);
            } else {
                low = (char) ('0' + tmpChar);
            }
            hexStr += low;
        }
        return hexStr;
    }

    String method2(byte[] b) {
        if (null == b) return null;
        int len = b.length;
        byte[] hex = new byte[len << 1];
        for (int i = 0, j = 0; i < len; i++, j += 2) {
            hex[j] = (byte) ((b[i] & 0xF0) >> 4);
            hex[j] += 10 > hex[j] ? 48 : 87;
            hex[j + 1] = (byte) (b[i] & 0x0F);
            hex[j + 1] += 10 > hex[j + 1] ? 48 : 87;
        }
        return new String(hex);
    }
}
