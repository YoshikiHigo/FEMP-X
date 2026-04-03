package inequivalent;

public class ClonePair12311 {

    String method1(String s) {
        if (s == null) return s;
        int length = s.length();
        int newLength = length;
        boolean someCharacterEscaped = false;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int cint = 0xffff & c;
            if (cint < 32) {
                switch (c) {
                    case '\r':
                    case '\n':
                    case '\t':
                    case '\f':
                    case ' ':
                    default: {
                        newLength -= 1;
                        someCharacterEscaped = true;
                    }
                }
            } else {
                switch (c) {
                    case '\"': {
                        newLength += 5;
                        someCharacterEscaped = true;
                    }
                    break;
                    case '&':
                    case '\'': {
                        newLength += 4;
                        someCharacterEscaped = true;
                    }
                    break;
                    case '<':
                    case '>': {
                        newLength += 3;
                        someCharacterEscaped = true;
                    }
                    break;
                }
            }
        }
        if (!someCharacterEscaped) {
            return s;
        }
        StringBuffer sb = new StringBuffer(newLength);
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int cint = 0xffff & c;
            if (cint < 32) {
                switch (c) {
                    case '\r':
                        break;
                    case '\n': {
                        sb.append("<br>");
                    }
                    break;
                    case '\t': {
                        sb.append("&nbsp;&nbsp;");
                    }
                    break;
                    case ' ': {
                        sb.append("&nbsp;");
                    }
                    break;
                    case '\f':
                        break;
                    default: {
                    }
                }
            } else {
                switch (c) {
                    case '\"': {
                        sb.append("&quot;");
                    }
                    break;
                    case '\'': {
                        sb.append("&#39;");
                    }
                    break;
                    case '&': {
                        sb.append("&amp;");
                    }
                    break;
                    case '<': {
                        sb.append("&lt;");
                    }
                    break;
                    case '>': {
                        sb.append("&gt;");
                    }
                    break;
                    default: {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }

    String method2(String s) {
        if (s == null) {
            return s;
        }
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '&') {
                r = r + "&amp;";
            } else if (s.charAt(i) == '<') {
                r = r + "&lt;";
            } else if (s.charAt(i) == '>') {
                r = r + "&gt;";
            } else if (s.charAt(i) == '"') {
                r = r + "&quot;";
            } else if (s.charAt(i) == '\'') {
                r = r + "&#39;";
            } else {
                r = r + s.charAt(i);
            }
        }
        return r;
    }
}
