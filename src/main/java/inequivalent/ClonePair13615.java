package inequivalent;

public class ClonePair13615 {

    byte[] method1(String string) {
        byte[] ret;
        ret = new byte[string.length() / 2];
        for (int i = 0; i < string.length(); i += 2)
            ret[i / 2] = (byte) Integer.parseInt(string.substring(i, i + 2), 16);
        return (ret);
    }

    byte[] method2(String str) {
        String strHex = "";
        int iValue = 0;
        int logByteIndex = 0;
        byte[] bytes = new byte[str.length() / 2];
        while (str.length() != 0) {
            strHex = str.substring(0, 2);
            str = str.substring(2);
            iValue = (Integer.decode("0x" + strHex).intValue());
            if (iValue > 0x7f) {
                iValue = (iValue - 1) ^ 0xff;
                iValue = -iValue;
            }
            bytes[logByteIndex] = Byte.parseByte(iValue + "");
            logByteIndex++;
        }
        return bytes;
    }
}
