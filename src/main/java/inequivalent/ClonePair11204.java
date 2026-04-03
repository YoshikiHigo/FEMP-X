package inequivalent;

public class ClonePair11204 {

    String method1(String s, String src, String dest) {
        int len = s.length();
        int bf = -1, ef = -1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '{') {
                bf = i;
                ef = -1;
            } else if (c == '}') {
                if (bf >= 0) {
                    ef = i;
                    String key = sb.toString();
                    if (src.equalsIgnoreCase(key)) {
                        return s.substring(0, bf) + dest + s.substring(ef + 1);
                    }
                } else {
                    bf = -1;
                    ef = -1;
                }
            } else {
                if (bf >= 0) {
                    sb.append(c);
                }
            }
        }
        return s;
    }

    String method2(String sInString, String sReplaceWhat, String sReplaceWith) {
        int iIndex = 0;
        while ((iIndex = sInString.indexOf(sReplaceWhat)) != -1) {
            String sPrefix = "";
            if (iIndex != 0) sPrefix = sInString.substring(0, iIndex);
            String sPostfix = "";
            if (iIndex + sReplaceWhat.length() < sInString.length())
                sPostfix = sInString.substring(iIndex + sReplaceWhat.length());
            sInString = sPrefix + sReplaceWith + sPostfix;
        }
        return sInString;
    }
}
