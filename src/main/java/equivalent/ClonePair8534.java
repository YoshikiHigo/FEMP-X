package equivalent;

public class ClonePair8534 {
    boolean method1(StringBuffer buf, String s) {
        int iBuf = buf.length();
        int iS = s.length();
        while (--iS >= 0 && --iBuf >= 0 && buf.charAt(iBuf) == s.charAt(iS)) {
        }
        return iS < 0;
    }

    boolean method2(StringBuffer buf, String strSuffix) {
        if (buf.length() < strSuffix.length()) {
            return false;
        }
        int offset = buf.length() - strSuffix.length();
        for (int i = 0; i < strSuffix.length(); i++) {
            if (strSuffix.charAt(i) != buf.charAt(offset + i)) {
                return false;
            }
        }
        return true;
    }
}
