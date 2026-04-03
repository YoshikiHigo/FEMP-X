package inequivalent;

public class ClonePair8401 {

    String method1(String pvString, String pvCuttingString) {
        if ((pvString != null) && (pvCuttingString != null) && (pvString.endsWith(pvCuttingString))) {
            return pvString.substring(0, (pvString.length() - pvCuttingString.length()));
        } else {
            return pvString;
        }
    }

    String method2(String srcStr, String ch) {
        if ((srcStr == null) || ("".equals(srcStr.trim()))) {
            return srcStr;
        }
        if ((ch == null) || ("".equals(ch))) {
            return srcStr;
        }
        if (ch.length() > srcStr.length()) {
            return srcStr;
        }
        if (srcStr.indexOf(ch) < 0) {
            return srcStr;
        }
        int chLen = ch.length();
        if (srcStr.indexOf(ch) == 0) {
            srcStr = srcStr.substring(chLen);
        }
        return srcStr;
    }
}
