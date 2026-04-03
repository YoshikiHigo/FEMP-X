package inequivalent;

public class ClonePair12540 {

    String method1(String str, String from, String to) {
        if (from == null || from.equals("") || to == null) return str;
        int index = str.indexOf(from);
        if (index == -1) return str;
        StringBuffer buf = new StringBuffer(str.length());
        int lastIndex = 0;
        while (index != -1) {
            buf.append(str, lastIndex, index);
            buf.append(to);
            lastIndex = index + from.length();
            index = str.indexOf(from, lastIndex);
        }
        buf.append(str.substring(lastIndex));
        return buf.toString();
    }

    String method2(String s, String s1, String s2) {
        String s3 = s;
        if (s1 != null && s2 != null) {
            for (int i = s.indexOf(s1); i != -1; i = s3.indexOf(s1, i + s2.length())) {
                s3 = s3.substring(0, i) + s2 + s3.substring(i + s1.length());
            }
        }
        return s3;
    }
}
