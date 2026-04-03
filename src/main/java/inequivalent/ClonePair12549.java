package inequivalent;

public class ClonePair12549 {

    String method1(String s, boolean canonical) {
        StringBuffer str = new StringBuffer();
        int len = (s != null) ? s.length() : 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '<': {
                    str.append("&lt;");
                    break;
                }
                case '>': {
                    str.append("&gt;");
                    break;
                }
                case '&': {
                    str.append("&amp;");
                    break;
                }
                case '"': {
                    str.append("&quot;");
                    break;
                }
                case '\'': {
                    str.append("&apos;");
                    break;
                }
                case '\r':
                case '\n': {
                    if (canonical) {
                        str.append("&#");
                        str.append(Integer.toString(ch));
                        str.append(';');
                        break;
                    }
                }
                default: {
                    str.append(ch);
                }
            }
        }
        return (str.toString());
    }

    String method2(String in, boolean attr) {
        if (in == null || in.trim().length() == 0) {
            return "";
        }
        if (attr) {
            if (in.indexOf('&') == -1 && in.indexOf('\"') == -1 && in.indexOf('<') == -1 && in.indexOf('>') == -1) {
                return in;
            }
        } else if (in.indexOf('&') == -1 && in.indexOf('<') == -1 && in.indexOf('>') == -1) {
            return in;
        }
        final StringBuilder result = new StringBuilder(in.length());
        final char[] chars = in.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '&') {
                result.append("&amp;");
            } else if (chars[i] == '<') {
                result.append("&lt;");
            } else if (chars[i] == '>') {
                result.append("&gt;");
            } else if (attr && chars[i] == '\"') {
                result.append("&quot;");
            } else {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }
}
