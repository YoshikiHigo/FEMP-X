package inequivalent;

public class ClonePair5246 {

    StringBuffer method1(StringBuffer source, String match, String newData) {
        if (source == null) return null;
        if (match == null) return source;
        if (newData == null) newData = "";
        while (source.indexOf(match) >= 0) {
            int begin = source.indexOf(match);
            int end = match.length() + begin;
            if (begin >= 0 && end >= 0) {
                source.replace(begin, end, newData);
            }
        }
        return source;
    }

    StringBuffer method2(StringBuffer fullBuf, String str1, String str2) {
        if (fullBuf == null) return null;
        String fullstr = fullBuf.toString();
        if (str1 == null || str2 == null) return fullBuf;
        if ("".equals(fullstr) && !"".equals(str1)) return fullBuf;
        int startIdx = fullBuf.indexOf(str1);
        if (startIdx == -1) return fullBuf;
        int foundLen = str1.length();
        int endIdx = startIdx + foundLen;
        StringBuffer returnBuf = fullBuf.replace(startIdx, endIdx, str2);
        return returnBuf;
    }
}
