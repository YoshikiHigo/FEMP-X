package inequivalent;

public class ClonePair7925 {

    String method1(String in, String find, String newStr, boolean case_sensitive) {
        char[] working = in.toCharArray();
        StringBuffer sb = new StringBuffer();
        int startindex = 0;
        if (case_sensitive) startindex = in.indexOf(find);
        else startindex = (in.toLowerCase()).indexOf(find.toLowerCase());
        if (startindex < 0) return in;
        int currindex = 0;
        for (int i = currindex; i < startindex; i++) sb.append(working[i]);
        currindex = startindex;
        sb.append(newStr);
        currindex += find.length();
        for (int i = currindex; i < working.length; i++) sb.append(working[i]);
        return sb.toString();
    }

    String method2(String source, String pattern, String to, boolean caseSensitive) {
        String workSource = (caseSensitive ? source : source.toLowerCase());
        pattern = (caseSensitive ? pattern : pattern.toLowerCase());
        int idx = workSource.indexOf(pattern);
        int length = pattern.length();
        StringBuffer dest = new StringBuffer();
        while (idx >= 0) {
            dest.append(source, 0, idx);
            dest.append(to);
            workSource = workSource.substring(idx + length);
            if (!caseSensitive) {
                source = source.substring(idx + length);
            } else {
                source = workSource;
            }
            idx = workSource.indexOf(pattern);
        }
        dest.append(source);
        return dest.toString();
    }
}
