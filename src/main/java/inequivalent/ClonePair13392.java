package inequivalent;

public class ClonePair13392 {

    String method1(String string, String leading, String trailing) {
        int i_start = string.indexOf(leading);
        if (i_start < 0) {
            return null;
        }
        i_start += leading.length();
        int i_end = string.indexOf(trailing, i_start);
        if (i_end < 0) {
            return null;
        }
        return string.substring(i_start, i_end);
    }

    String method2(String html, String startTag, String endTag) {
        int s = html.indexOf(startTag);
        if (s == -1) return null;
        s += startTag.length();
        int e = html.indexOf(endTag, s);
        if (e == -1) return null;
        return html.substring(s, e).trim();
    }
}
