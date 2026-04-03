package inequivalent;

public class ClonePair10093 {

    String method1(String str, String find, String replace) {
        if (str == null) return null;
        if ((find == null) || (find.length() == 0)) return str;
        if (replace == null) replace = "";
        StringBuffer sb = new StringBuffer(str.length());
        int pos = 0;
        int lastPos = 0;
        while (pos >= 0) {
            pos = str.indexOf(find, lastPos);
            if (pos >= 0) {
                sb.append(str, lastPos, pos);
                sb.append(replace);
            } else {
                sb.append(str.substring(lastPos));
            }
            lastPos = pos + find.length();
        }
        return sb.toString();
    }

    String method2(String s, String replace, String with) {
        if (s == null || replace == null) {
            return s;
        }
        if (with == null) {
            with = "";
        }
        StringBuffer b = new StringBuffer();
        int start = 0;
        int lenreplace = replace.length();
        while (true) {
            int i = s.indexOf(replace, start);
            if (i == -1) {
                b.append(s.substring(start));
                break;
            }
            b.append(s, start, i - start);
            b.append(with);
            start = i + lenreplace;
        }
        return b.toString();
    }
}
