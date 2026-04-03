package equivalent;

import java.util.Locale;

public class ClonePair12819 {
    String method1(String str, boolean escapeAscii) {
        String ostr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e))) ostr += ch;
            else {
                ostr += "\\u";
                String hex = Integer.toHexString(str.charAt(i) & 0xFFFF);
                if (hex.length() == 2) ostr += "00";
                ostr += hex.toUpperCase(Locale.ENGLISH);
            }
        }
        return (ostr);
    }

    String method2(String input, boolean escapeAscii) {
        StringBuffer returnValue = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e))) {
                returnValue.append(ch);
            } else {
                returnValue.append("\\u");
                String hex = Integer.toHexString(input.charAt(i) & 0xFFFF);
                if (hex.length() == 2) {
                    returnValue.append("00");
                }
                returnValue.append(hex.toUpperCase());
            }
        }
        return returnValue.toString();
    }
}
