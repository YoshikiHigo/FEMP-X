package inequivalent;

public class ClonePair9308 {

    String method1(char[] ch, int start, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < start + length; i++) {
            char c;
            switch (c = ch[i]) {
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                case '&':
                    sb.append("&amp;");
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }

    String method2(char[] chars, int start, int length) {
        StringBuffer buff = new StringBuffer();
        for (int i = start; i < start + length; i++) {
            char c = chars[i];
            switch (c) {
                case '\'':
                    buff.append("&apos;");
                    break;
                case '"':
                    buff.append("&quot;");
                    break;
                case '&':
                    buff.append("&amp;");
                    break;
                case '<':
                    buff.append("&lt;");
                    break;
                case '>':
                    buff.append("&gt;");
                    break;
                default:
                    buff.append(c);
                    break;
            }
        }
        return buff.toString();
    }
}
