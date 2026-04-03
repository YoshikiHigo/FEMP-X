package equivalent;

public class ClonePair10677 {
    String method1(String s, String placeholder, String value) {
        if (s == null) return "";
        if (s.length() == 0) return s;
        if (placeholder == null || placeholder.length() == 0) return s;
        if (value == null) value = "";
        String result = s;
        int matchIndex = result.indexOf(placeholder);
        int plen = placeholder.length();
        while (matchIndex != -1) {
            result = result.substring(0, matchIndex) + value + result.substring(matchIndex + plen);
            matchIndex = result.indexOf(placeholder, matchIndex + plen);
        }
        return result;
    }

    String method2(String szSrc, String szOld, String szNew) {
        try {
            if (szSrc == null || szSrc.trim().equals("")) {
                return "";
            }
            StringBuffer sb = new StringBuffer();
            String szTmp = szSrc.trim();
            if (szOld == null || szOld.equals("")) {
                return szTmp;
            }
            if (szNew == null) {
                return szTmp;
            }
            int iOldLen = szOld.length();
            int iNewLen = szNew.length();
            int iSrcLen = szSrc.length();
            int iPos = -1;
            int iStart = 0;
            while ((iPos = szTmp.indexOf(szOld, iStart)) > -1) {
                sb.append(szTmp, iStart, iPos);
                sb.append(szNew);
                iStart = iPos + iOldLen;
            }
            if (iStart < iSrcLen) {
                sb.append(szTmp.substring(iStart));
            }
            return sb.toString();
        } catch (Exception ex) {
            return "";
        }
    }
}
