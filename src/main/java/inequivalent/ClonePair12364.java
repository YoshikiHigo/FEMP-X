package inequivalent;

public class ClonePair12364 {

    String method1(String str, boolean xml11) {
        StringBuilder buf = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (xml11 && ch < 32 && ch != '\r' && ch != '\n' && ch != '\t') {
                buf.append("&#").append((int) ch).append(';');
                continue;
            }
            switch (ch) {
                case '<':
                    buf.append("&lt;");
                    break;
                case '>':
                    buf.append("&gt;");
                    break;
                case '&':
                    buf.append("&amp;");
                    break;
                default:
                    buf.append(ch);
                    break;
            }
        }
        return buf.toString();
    }

    String method2(String source, boolean encodeCR) {
        int i = 0;
        while (i < source.length()) {
            switch (source.charAt(i)) {
                case '<':
                    source = (i > 0 ? source.substring(0, i) : "") + "&lt;" + (i < source.length() - 1 ? source.substring(i + 1) : "");
                    i += 3;
                    break;
                case '&':
                    source = (i > 0 ? source.substring(0, i) : "") + "&amp;" + (i < source.length() - 1 ? source.substring(i + 1) : "");
                    i += 4;
                    break;
                case '>':
                    source = (i > 0 ? source.substring(0, i) : "") + "&gt;" + (i < source.length() - 1 ? source.substring(i + 1) : "");
                    i += 3;
                    break;
                case '\n':
                    if (encodeCR) {
                        source = (i > 0 ? source.substring(0, i) : "") + "<br>" + (i < source.length() - 1 ? source.substring(i + 1) : "");
                        i += 4;
                    } else {
                        i++;
                    }
                    break;
                default:
                    i++;
            }
        }
        return (source);
    }
}
