package inequivalent;

public class ClonePair13564 {

    byte[] method1(String string) {
        byte[] bytes = new byte[string.length() / 2];
        int pos = 0;
        byte upper, lower;
        int buffer;
        for (int i = 0; (i + 1) < string.length(); i += 2) {
            upper = Byte.decode("0x0" + string.charAt(i));
            lower = Byte.decode("0x0" + string.charAt(i + 1));
            buffer = (upper << 4) | lower;
            bytes[pos++] = (byte) buffer;
        }
        return bytes;
    }

    byte[] method2(String s) {
        byte[] bytes;
        bytes = new byte[s.length() / 2];
        int iPos = 0;
        int i = 0;
        while (iPos < s.length()) {
            while (iPos < s.length() && (s.charAt(iPos) == ' ' || s.charAt(iPos) == ':')) {
                iPos += 1;
            }
            if ((iPos + 2) <= s.length()) {
                bytes[i] = (byte) Integer.parseInt(s.substring(iPos, iPos + 2), 16);
                i++;
                iPos += 2;
            }
        }
        byte[] trimmed = new byte[i];
        System.arraycopy(bytes, 0, trimmed, 0, i);
        return trimmed;
    }
}
