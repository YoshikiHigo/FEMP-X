package inequivalent;

public class ClonePair6550 {

    String method1(String string, boolean encodeNewline, boolean encodeSubsequentBlanksToNbsp, boolean encodeNonLatin) {
        if (string == null) {
            return "";
        }
        StringBuilder sb = null;
        String app;
        char c;
        for (int i = 0; i < string.length(); ++i) {
            app = null;
            c = string.charAt(i);
            if ((int) c < 0x41) {
                switch (c) {
                    case '"':
                        app = "&quot;";
                        break;
                    case '&':
                        app = "&amp;";
                        break;
                    case '<':
                        app = "&lt;";
                        break;
                    case '>':
                        app = "&gt;";
                        break;
                    case ' ':
                        if (encodeSubsequentBlanksToNbsp && (i == 0 || (i - 1 >= 0 && string.charAt(i - 1) == ' '))) {
                            app = "&#160;";
                        }
                        break;
                    case '\n':
                        if (encodeNewline) {
                            app = "<br/>";
                        }
                        break;
                }
            } else if (encodeNonLatin && (int) c > 0x80) {
                switch (c) {
                    case 'ä':
                        app = "&auml;";
                        break;
                    case 'Ä':
                        app = "&Auml;";
                        break;
                    case 'ö':
                        app = "&ouml;";
                        break;
                    case 'Ö':
                        app = "&Ouml;";
                        break;
                    case 'ü':
                        app = "&uuml;";
                        break;
                    case 'Ü':
                        app = "&Uuml;";
                        break;
                    case 'ß':
                        app = "&szlig;";
                        break;
                    case '€':
                        app = "&euro;";
                        break;
                    case '«':
                        app = "&laquo;";
                        break;
                    case '»':
                        app = "&raquo;";
                        break;
                    case ' ':
                        app = "&#160;";
                        break;
                    default:
                        app = "&#" + ((int) c) + ";";
                        break;
                }
            }
            if (app != null) {
                if (sb == null) {
                    sb = new StringBuilder(string.substring(0, i));
                }
                sb.append(app);
            } else {
                if (sb != null) {
                    sb.append(c);
                }
            }
        }
        if (sb == null) {
            return string;
        } else {
            return sb.toString();
        }
    }

    String method2(String string, boolean encodeNewline, boolean encodeSubsequentBlanksToNbsp, boolean encodeNonLatin) {
        if (string == null) {
            return "";
        }
        StringBuffer sb = null;
        String app;
        char c;
        for (int i = 0; i < string.length(); ++i) {
            app = null;
            c = string.charAt(i);
            switch (c) {
                case '"':
                    app = "&quot;";
                    break;
                case '&':
                    app = "&amp;";
                    break;
                case '<':
                    app = "&lt;";
                    break;
                case '>':
                    app = "&gt;";
                    break;
                case ' ':
                    if (encodeSubsequentBlanksToNbsp && (i == 0 || (i - 1 >= 0 && string.charAt(i - 1) == ' '))) {
                        app = "&#160;";
                    }
                    break;
                case '\n':
                    if (encodeNewline) {
                        app = "<br/>";
                    }
                    break;
                default:
                    if (encodeNonLatin) switch (c) {
                        case 'ä':
                            app = "&auml;";
                            break;
                        case 'Ä':
                            app = "&Auml;";
                            break;
                        case 'ö':
                            app = "&ouml;";
                            break;
                        case 'Ö':
                            app = "&Ouml;";
                            break;
                        case 'ü':
                            app = "&uuml;";
                            break;
                        case 'Ü':
                            app = "&Uuml;";
                            break;
                        case 'ß':
                            app = "&szlig;";
                            break;
                        case '€':
                            app = "&euro;";
                            break;
                        case '«':
                            app = "&laquo;";
                            break;
                        case '»':
                            app = "&raquo;";
                            break;
                        case ' ':
                            app = "&#160;";
                            break;
                        default:
                            if (((int) c) >= 0x80) {
                                app = "&#" + ((int) c) + ";";
                            }
                            break;
                    }
                    break;
            }
            if (app != null) {
                if (sb == null) {
                    sb = new StringBuffer(string.substring(0, i));
                }
                sb.append(app);
            } else {
                if (sb != null) {
                    sb.append(c);
                }
            }
        }
        if (sb == null) {
            return string;
        } else {
            return sb.toString();
        }
    }
}
