package inequivalent;

public class ClonePair12248 {

    String method1(String strOrig, String strFind, String strReplace) {
        if (strOrig == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer(strOrig);
        String toReplace = "";
        if (strReplace == null) toReplace = "";
        else toReplace = strReplace;
        int pos = strOrig.length();
        while (pos > -1) {
            pos = strOrig.lastIndexOf(strFind, pos);
            if (pos > -1) sb.replace(pos, pos + strFind.length(), toReplace);
            pos = pos - strFind.length();
        }
        return sb.toString();
    }

    String method2(String string, String placeholder, String replacement) {
        if (string == null) {
            return string;
        }
        int loc = string.indexOf(placeholder);
        if (loc < 0) {
            return string;
        } else {
            return string.substring(0, loc) + replacement + string.substring(loc + placeholder.length());
        }
    }
}
