package equivalent;

public class ClonePair12411 {
    String method1(String text, boolean convertTags) {
        if (text == null) return "";
        StringBuffer out = new StringBuffer(text.length() * 2);
        char c;
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            if (c >= 128 || (convertTags && (c == '<' || c == '>' || c == '&' || c == '"') || c == '\'')) {
                switch (c) {
                    case 8222:
                    case 8220:
                        out.append('\"');
                        break;
                    case '\'':
                    case 8217:
                        out.append("&apos;");
                        break;
                    case '"':
                        out.append("&quot;");
                        break;
                    case '&':
                        out.append("&amp;");
                        break;
                    case '<':
                        out.append("&lt;");
                        break;
                    case '>':
                        out.append("&gt;");
                        break;
                    case ' ':
                        out.append("&nbsp;");
                        break;
                    case '¡':
                        out.append("&iexcl;");
                        break;
                    case '¢':
                        out.append("&cent;");
                        break;
                    case '£':
                        out.append("&pound;");
                        break;
                    case '¤':
                        out.append("&curren;");
                        break;
                    case '¥':
                        out.append("&yen;");
                        break;
                    case '¦':
                        out.append("&brvbar;");
                        break;
                    case '§':
                        out.append("&sect;");
                        break;
                    case '¨':
                        out.append("&uml;");
                        break;
                    case '©':
                        out.append("&copy;");
                        break;
                    case 'ª':
                        out.append("&ordf;");
                        break;
                    case '«':
                        out.append("&laquo;");
                        break;
                    case '¬':
                        out.append("&not;");
                        break;
                    case '­':
                        out.append("&shy;");
                        break;
                    case '®':
                        out.append("&reg;");
                        break;
                    case '¯':
                        out.append("&macr;");
                        break;
                    case '°':
                        out.append("&deg;");
                        break;
                    case '±':
                        out.append("&plusmn;");
                        break;
                    case '²':
                        out.append("&sup2;");
                        break;
                    case '³':
                        out.append("&sup3;");
                        break;
                    case '´':
                        out.append("&acute;");
                        break;
                    case 'µ':
                        out.append("&micro;");
                        break;
                    case '¶':
                        out.append("&para;");
                        break;
                    case '·':
                        out.append("&middot;");
                        break;
                    case '¸':
                        out.append("&cedil;");
                        break;
                    case '¹':
                        out.append("&sup1;");
                        break;
                    case 'º':
                        out.append("&ordm;");
                        break;
                    case '»':
                        out.append("&raquo;");
                        break;
                    case '¼':
                        out.append("&frac14;");
                        break;
                    case '½':
                        out.append("&frac12;");
                        break;
                    case '¾':
                        out.append("&frac34;");
                        break;
                    case '¿':
                        out.append("&iquest;");
                        break;
                    case 'À':
                        out.append("&Agrave;");
                        break;
                    case 'Á':
                        out.append("&Aacute;");
                        break;
                    case 'Â':
                        out.append("&Acirc;");
                        break;
                    case 'Ã':
                        out.append("&Atilde;");
                        break;
                    case 'Ä':
                        out.append("&Auml;");
                        break;
                    case 'Å':
                        out.append("&Aring;");
                        break;
                    case 'Æ':
                        out.append("&AElig;");
                        break;
                    case 'Ç':
                        out.append("&Ccedil;");
                        break;
                    case 'È':
                        out.append("&Egrave;");
                        break;
                    case 'É':
                        out.append("&Eacute;");
                        break;
                    case 'Ê':
                        out.append("&Ecirc;");
                        break;
                    case 'Ë':
                        out.append("&Euml;");
                        break;
                    case 'Ì':
                        out.append("&Igrave;");
                        break;
                    case 'Í':
                        out.append("&Iacute;");
                        break;
                    case 'Î':
                        out.append("&Icirc;");
                        break;
                    case 'Ï':
                        out.append("&Iuml;");
                        break;
                    case 'Ð':
                        out.append("&ETH;");
                        break;
                    case 'Ñ':
                        out.append("&Ntilde;");
                        break;
                    case 'Ò':
                        out.append("&Ograve;");
                        break;
                    case 'Ó':
                        out.append("&Oacute;");
                        break;
                    case 'Ô':
                        out.append("&Ocirc;");
                        break;
                    case 'Õ':
                        out.append("&Otilde;");
                        break;
                    case 'Ö':
                        out.append("&Ouml;");
                        break;
                    case '×':
                        out.append("&times;");
                        break;
                    case 'Ø':
                        out.append("&Oslash;");
                        break;
                    case 'Ù':
                        out.append("&Ugrave;");
                        break;
                    case 'Ú':
                        out.append("&Uacute;");
                        break;
                    case 'Û':
                        out.append("&Ucirc;");
                        break;
                    case 'Ü':
                        out.append("&Uuml;");
                        break;
                    case 'Ý':
                        out.append("&Yacute;");
                        break;
                    case 'Þ':
                        out.append("&THORN;");
                        break;
                    case 'ß':
                        out.append("&szlig;");
                        break;
                    case 'à':
                        out.append("&agrave;");
                        break;
                    case 'á':
                        out.append("&aacute;");
                        break;
                    case 'â':
                        out.append("&acirc;");
                        break;
                    case 'ã':
                        out.append("&atilde;");
                        break;
                    case 'ä':
                        out.append("&auml;");
                        break;
                    case 'å':
                        out.append("&aring;");
                        break;
                    case 'æ':
                        out.append("&aelig;");
                        break;
                    case 'ç':
                        out.append("&ccedil;");
                        break;
                    case 'è':
                        out.append("&egrave;");
                        break;
                    case 'é':
                        out.append("&eacute;");
                        break;
                    case 'ê':
                        out.append("&ecirc;");
                        break;
                    case 'ë':
                        out.append("&euml;");
                        break;
                    case 'ì':
                        out.append("&igrave;");
                        break;
                    case 'í':
                        out.append("&iacute;");
                        break;
                    case 'î':
                        out.append("&icirc;");
                        break;
                    case 'ï':
                        out.append("&iuml;");
                        break;
                    case 'ð':
                        out.append("&eth;");
                        break;
                    case 'ñ':
                        out.append("&ntilde;");
                        break;
                    case 'ò':
                        out.append("&ograve;");
                        break;
                    case 'ó':
                        out.append("&oacute;");
                        break;
                    case 'ô':
                        out.append("&ocirc;");
                        break;
                    case 'õ':
                        out.append("&otilde;");
                        break;
                    case 'ö':
                        out.append("&ouml;");
                        break;
                    case '÷':
                        out.append("&divide;");
                        break;
                    case 'ø':
                        out.append("&oslash;");
                        break;
                    case 'ù':
                        out.append("&ugrave;");
                        break;
                    case 'ú':
                        out.append("&uacute;");
                        break;
                    case 'û':
                        out.append("&ucirc;");
                        break;
                    case 'ü':
                        out.append("&uuml;");
                        break;
                    case 'ý':
                        out.append("&yacute;");
                        break;
                    case 'þ':
                        out.append("&thorn;");
                        break;
                    case 'ÿ':
                        out.append("&yuml;");
                        break;
                    case 8364:
                    case 128:
                        out.append("&euro;");
                        break;
                    default:
                        out.append("&#").append((int) c).append(';');
                        break;
                }
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }

    String method2(String text, boolean convertTags) {
        if (text == null) {
            return "";
        }
        StringBuffer out = new StringBuffer(text.length() * 2);
        char c;
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            if (c >= 128 || (convertTags && (c == '<' || c == '>' || c == '&' || c == '"') || c == '\'')) {
                switch (c) {
                    case 8222:
                    case 8220:
                        out.append('\"');
                        break;
                    case '\'':
                    case 8217:
                        out.append("&apos;");
                        break;
                    case '"':
                        out.append("&quot;");
                        break;
                    case '&':
                        out.append("&amp;");
                        break;
                    case '<':
                        out.append("&lt;");
                        break;
                    case '>':
                        out.append("&gt;");
                        break;
                    case ' ':
                        out.append("&nbsp;");
                        break;
                    case '¡':
                        out.append("&iexcl;");
                        break;
                    case '¢':
                        out.append("&cent;");
                        break;
                    case '£':
                        out.append("&pound;");
                        break;
                    case '¤':
                        out.append("&curren;");
                        break;
                    case '¥':
                        out.append("&yen;");
                        break;
                    case '¦':
                        out.append("&brvbar;");
                        break;
                    case '§':
                        out.append("&sect;");
                        break;
                    case '¨':
                        out.append("&uml;");
                        break;
                    case '©':
                        out.append("&copy;");
                        break;
                    case 'ª':
                        out.append("&ordf;");
                        break;
                    case '«':
                        out.append("&laquo;");
                        break;
                    case '¬':
                        out.append("&not;");
                        break;
                    case '­':
                        out.append("&shy;");
                        break;
                    case '®':
                        out.append("&reg;");
                        break;
                    case '¯':
                        out.append("&macr;");
                        break;
                    case '°':
                        out.append("&deg;");
                        break;
                    case '±':
                        out.append("&plusmn;");
                        break;
                    case '²':
                        out.append("&sup2;");
                        break;
                    case '³':
                        out.append("&sup3;");
                        break;
                    case '´':
                        out.append("&acute;");
                        break;
                    case 'µ':
                        out.append("&micro;");
                        break;
                    case '¶':
                        out.append("&para;");
                        break;
                    case '·':
                        out.append("&middot;");
                        break;
                    case '¸':
                        out.append("&cedil;");
                        break;
                    case '¹':
                        out.append("&sup1;");
                        break;
                    case 'º':
                        out.append("&ordm;");
                        break;
                    case '»':
                        out.append("&raquo;");
                        break;
                    case '¼':
                        out.append("&frac14;");
                        break;
                    case '½':
                        out.append("&frac12;");
                        break;
                    case '¾':
                        out.append("&frac34;");
                        break;
                    case '¿':
                        out.append("&iquest;");
                        break;
                    case 'À':
                        out.append("&Agrave;");
                        break;
                    case 'Á':
                        out.append("&Aacute;");
                        break;
                    case 'Â':
                        out.append("&Acirc;");
                        break;
                    case 'Ã':
                        out.append("&Atilde;");
                        break;
                    case 'Ä':
                        out.append("&Auml;");
                        break;
                    case 'Å':
                        out.append("&Aring;");
                        break;
                    case 'Æ':
                        out.append("&AElig;");
                        break;
                    case 'Ç':
                        out.append("&Ccedil;");
                        break;
                    case 'È':
                        out.append("&Egrave;");
                        break;
                    case 'É':
                        out.append("&Eacute;");
                        break;
                    case 'Ê':
                        out.append("&Ecirc;");
                        break;
                    case 'Ë':
                        out.append("&Euml;");
                        break;
                    case 'Ì':
                        out.append("&Igrave;");
                        break;
                    case 'Í':
                        out.append("&Iacute;");
                        break;
                    case 'Î':
                        out.append("&Icirc;");
                        break;
                    case 'Ï':
                        out.append("&Iuml;");
                        break;
                    case 'Ð':
                        out.append("&ETH;");
                        break;
                    case 'Ñ':
                        out.append("&Ntilde;");
                        break;
                    case 'Ò':
                        out.append("&Ograve;");
                        break;
                    case 'Ó':
                        out.append("&Oacute;");
                        break;
                    case 'Ô':
                        out.append("&Ocirc;");
                        break;
                    case 'Õ':
                        out.append("&Otilde;");
                        break;
                    case 'Ö':
                        out.append("&Ouml;");
                        break;
                    case '×':
                        out.append("&times;");
                        break;
                    case 'Ø':
                        out.append("&Oslash;");
                        break;
                    case 'Ù':
                        out.append("&Ugrave;");
                        break;
                    case 'Ú':
                        out.append("&Uacute;");
                        break;
                    case 'Û':
                        out.append("&Ucirc;");
                        break;
                    case 'Ü':
                        out.append("&Uuml;");
                        break;
                    case 'Ý':
                        out.append("&Yacute;");
                        break;
                    case 'Þ':
                        out.append("&THORN;");
                        break;
                    case 'ß':
                        out.append("&szlig;");
                        break;
                    case 'à':
                        out.append("&agrave;");
                        break;
                    case 'á':
                        out.append("&aacute;");
                        break;
                    case 'â':
                        out.append("&acirc;");
                        break;
                    case 'ã':
                        out.append("&atilde;");
                        break;
                    case 'ä':
                        out.append("&auml;");
                        break;
                    case 'å':
                        out.append("&aring;");
                        break;
                    case 'æ':
                        out.append("&aelig;");
                        break;
                    case 'ç':
                        out.append("&ccedil;");
                        break;
                    case 'è':
                        out.append("&egrave;");
                        break;
                    case 'é':
                        out.append("&eacute;");
                        break;
                    case 'ê':
                        out.append("&ecirc;");
                        break;
                    case 'ë':
                        out.append("&euml;");
                        break;
                    case 'ì':
                        out.append("&igrave;");
                        break;
                    case 'í':
                        out.append("&iacute;");
                        break;
                    case 'î':
                        out.append("&icirc;");
                        break;
                    case 'ï':
                        out.append("&iuml;");
                        break;
                    case 'ð':
                        out.append("&eth;");
                        break;
                    case 'ñ':
                        out.append("&ntilde;");
                        break;
                    case 'ò':
                        out.append("&ograve;");
                        break;
                    case 'ó':
                        out.append("&oacute;");
                        break;
                    case 'ô':
                        out.append("&ocirc;");
                        break;
                    case 'õ':
                        out.append("&otilde;");
                        break;
                    case 'ö':
                        out.append("&ouml;");
                        break;
                    case '÷':
                        out.append("&divide;");
                        break;
                    case 'ø':
                        out.append("&oslash;");
                        break;
                    case 'ù':
                        out.append("&ugrave;");
                        break;
                    case 'ú':
                        out.append("&uacute;");
                        break;
                    case 'û':
                        out.append("&ucirc;");
                        break;
                    case 'ü':
                        out.append("&uuml;");
                        break;
                    case 'ý':
                        out.append("&yacute;");
                        break;
                    case 'þ':
                        out.append("&thorn;");
                        break;
                    case 'ÿ':
                        out.append("&yuml;");
                        break;
                    case 8364:
                    case 128:
                        out.append("&euro;");
                        break;
                    default:
                        out.append("&#").append((int) c).append(';');
                        break;
                }
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }
}
