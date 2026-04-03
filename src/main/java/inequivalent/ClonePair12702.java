package inequivalent;

public class ClonePair12702 {

    String method1(String line, String oldString, String newString) {
        if (line == null) return null;
        String lcLine = line.toLowerCase();
        String lcOldString = oldString.toLowerCase();
        int i = 0;
        if ((i = lcLine.indexOf(lcOldString, i)) >= 0) {
            char[] line2 = line.toCharArray();
            char[] newString2 = newString.toCharArray();
            int oLength = oldString.length();
            StringBuilder buf = new StringBuilder(line2.length);
            buf.append(line2, 0, i).append(newString2);
            i += oLength;
            int j = i;
            while ((i = lcLine.indexOf(lcOldString, i)) > 0) {
                buf.append(line2, j, i - j).append(newString2);
                i += oLength;
                j = i;
            }
            buf.append(line2, j, line2.length - j);
            return buf.toString();
        }
        return line;
    }

    String method2(String orig, String src, String dest) {
        if (orig == null) return null;
        StringBuffer res = new StringBuffer();
        int start = 0;
        int end = 0;
        int last = 0;
        String origCaseUnsn = orig.toLowerCase();
        String srcCaseUnsn = src.toLowerCase();
        while ((start = origCaseUnsn.indexOf(srcCaseUnsn, end)) != -1) {
            res.append(orig, last, start);
            res.append(dest);
            end = start + src.length();
            last = start + src.length();
        }
        res.append(orig.substring(end));
        return res.toString();
    }
}
