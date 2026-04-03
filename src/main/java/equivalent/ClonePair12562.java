package equivalent;

public class ClonePair12562 {
    String method1(String str, boolean transQuotes) {
        StringBuffer buf = new StringBuffer();
        int last_char = str.length() - 1;
        char cur_char;
        for (int i = 0; i <= last_char; i++) {
            cur_char = str.charAt(i);
            switch (cur_char) {
                case '&':
                    buf.append("&amp;");
                    break;
                case '<':
                    buf.append("&lt;");
                    break;
                case '>':
                    buf.append("&gt;");
                    break;
                case '\'':
                    if (transQuotes) {
                        buf.append("&apos;");
                    } else {
                        buf.append(cur_char);
                    }
                    break;
                case '"':
                    if (transQuotes) {
                        buf.append("&quot;");
                    } else {
                        buf.append(cur_char);
                    }
                    break;
                default:
                    buf.append(cur_char);
                    break;
            }
        }
        return buf.toString();
    }

    String method2(String text, boolean inAttr) {
        int len = text.length();
        StringBuffer buf = null;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == '<') {
                if (buf == null) {
                    buf = new StringBuffer(text.substring(0, i));
                }
                buf.append("&lt;");
            } else if (c == '>') {
                if (buf == null) {
                    buf = new StringBuffer(text.substring(0, i));
                }
                buf.append("&gt;");
            } else if (c == '&') {
                if (buf == null) {
                    buf = new StringBuffer(text.substring(0, i));
                }
                buf.append("&amp;");
            } else if (c == '\'' && inAttr) {
                if (buf == null) {
                    buf = new StringBuffer(text.substring(0, i));
                }
                buf.append("&apos;");
            } else if (c == '"' && inAttr) {
                if (buf == null) {
                    buf = new StringBuffer(text.substring(0, i));
                }
                buf.append("&quot;");
            } else if (buf != null) {
                buf.append(c);
            }
        }
        return (buf == null) ? text : buf.toString();
    }
}
