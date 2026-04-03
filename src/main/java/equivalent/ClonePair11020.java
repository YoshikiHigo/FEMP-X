package equivalent;

public class ClonePair11020 {
    String method1(String str, String pattern, String replace) {
        int s = 0;
        int e = 0;
        StringBuffer result = new StringBuffer();
        if (pattern == null || pattern.equals("")) return str;
        while ((e = str.indexOf(pattern, s)) >= 0) {
            result.append(str, s, e);
            result.append(replace);
            s = e + pattern.length();
        }
        result.append(str.substring(s));
        return result.toString();
    }

    String method2(String haystack, String needle, String replacement) {
        if (needle == null || needle.length() == 0) {
            return haystack;
        }
        StringBuffer result = null;
        int searchPos = 0;
        while (true) {
            final int pos = haystack.indexOf(needle, searchPos);
            if (pos == -1) {
                break;
            }
            if (result == null) {
                result = new StringBuffer();
            }
            result.append(haystack, searchPos, pos);
            result.append(replacement);
            searchPos = pos + needle.length();
        }
        if (result == null) {
            return haystack;
        }
        result.append(haystack.substring(searchPos));
        return result.toString();
    }
}
