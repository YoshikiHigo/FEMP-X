package inequivalent;

public class ClonePair12382 {

    String method1(String value, boolean encodeSpaces) {
        StringBuffer sb = new StringBuffer();
        int len = value.length();
        for (int i = 0; i < len; i++) {
            char c = value.charAt(i);
            if (encodeSpaces && Character.isWhitespace(c)) sb.append("&nbsp;");
            else if (c == '&') sb.append("&amp;");
            else if (c == '<') sb.append("&lt;");
            else if (c == '>') sb.append("&gt;");
            else if (c == '"') sb.append("&quot;");
            else sb.append(c);
        }
        return sb.toString();
    }

    String method2(String s, boolean noBreakSpaces) {
        StringBuffer buf = null;
        int ix = 0;
        for (int i = 0, n = s.length(); i < n; i++) {
            String replacement = null;
            switch (s.charAt(i)) {
                case '"':
                    replacement = "&quot;";
                    break;
                case '<':
                    replacement = "&lt;";
                    break;
                case '>':
                    replacement = "&gt;";
                    break;
                case '&':
                    replacement = "&amp;";
                    break;
                case ' ':
                    if (noBreakSpaces) {
                        replacement = "&nbsp;";
                    }
                    break;
            }
            if (replacement != null) {
                if (buf == null) {
                    buf = new StringBuffer();
                }
                buf.append(s, ix, i);
                buf.append(replacement);
                ix = i + 1;
            }
        }
        if (buf != null) {
            buf.append(s.substring(ix));
            return buf.toString();
        } else {
            return s;
        }
    }
}
