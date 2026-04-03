package inequivalent;

public class ClonePair8069 {

    String method1(byte[] bs, int offset, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = offset; i < offset + length; i++) {
            if (i > offset) {
                result.append(' ');
            }
            byte b = bs[i];
            result.append(Character.forDigit((b & 0xf0) >> 4, 16));
            result.append(Character.forDigit(b & 0xf, 16));
        }
        return result.toString();
    }

    String method2(byte[] b, int i, int j) {
        String temp = "";
        for (int cntr = 0; cntr < j; cntr++) {
            int num = b[i + cntr] & 0xFF;
            String myStr;
            if (num < 16) myStr = "0";
            else myStr = "";
            temp += myStr + Integer.toHexString(num) + " ";
        }
        return temp.toUpperCase().trim();
    }
}
