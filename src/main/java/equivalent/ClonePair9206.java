package equivalent;

public class ClonePair9206 {
    String method1(String source, String str1, String str2) {
        int index, start = 0;
        StringBuffer value = new StringBuffer();
        while ((index = source.indexOf(str1, start)) != -1) {
            value.append(source.substring(start, index) + str2);
            start = index + str1.length();
        }
        if (start < source.length()) {
            value.append(source, start, source.length());
        }
        return value.toString();
    }

    String method2(String orig, String lookFor, String replaceWith) {
        int idx = orig.indexOf(lookFor);
        if (idx < 0) {
            return (orig);
        }
        int prev = 0;
        StringBuffer rtn = new StringBuffer();
        while (idx >= 0) {
            rtn.append(orig, prev, idx);
            rtn.append(replaceWith);
            prev = idx + lookFor.length();
            idx = orig.indexOf(lookFor, prev);
        }
        rtn.append(orig, prev, orig.length());
        return (rtn.toString());
    }
}
