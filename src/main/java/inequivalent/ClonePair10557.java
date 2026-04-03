package inequivalent;

public class ClonePair10557 {

    String method1(String s, String o, String n) {
        if (s == null) return null;
        int begin = s.indexOf(o);
        if (begin == -1) return s;
        int end = begin + o.length();
        return (new StringBuffer(s)).replace(begin, end, n).toString();
    }

    String method2(String str, String from, String to) {
        if (str == null) return str;
        int index = str.indexOf(from);
        if (index == -1) return str;
        int pos = 0;
        final int fromLen = from.length();
        final StringBuilder sb = new StringBuilder();
        while (index > -1) {
            sb.append(str, pos, index).append(to);
            pos = index + fromLen;
            index = str.indexOf(from, pos);
        }
        sb.append(str.substring(pos));
        return sb.toString();
    }
}
