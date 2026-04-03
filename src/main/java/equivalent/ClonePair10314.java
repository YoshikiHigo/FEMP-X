package equivalent;

public class ClonePair10314 {
    String method1(byte[] data, int offset, int len) {
        String temp = "";
        for (int cntr = 0; cntr < len; cntr++) {
            int num = data[offset + cntr] & 0xFF;
            String myStr;
            if (num < 16) myStr = "0";
            else myStr = "";
            temp += myStr + Integer.toHexString(num) + " ";
        }
        return temp.toUpperCase().trim();
    }

    String method2(byte[] data, int offset, int len) {
        String temp = "";
        for (int cntr = 0; cntr < len; cntr++) {
            int num = data[offset + cntr] & 0xFF;
            String myStr;
            if (num < 16) {
                myStr = "0";
            } else {
                myStr = "";
            }
            temp += myStr + Integer.toHexString(num) + " ";
        }
        return temp.toUpperCase().trim();
    }
}
