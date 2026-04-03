package equivalent;

public class ClonePair12417 {
    String method1(String str, boolean isKey) {
        int len = str.length();
        StringBuffer outBuffer = new StringBuffer(len * 2);
        for (int index = 0; index < len; index++) {
            char c = str.charAt(index);
            switch (c) {
                case ' ':
                    if (index == 0 || isKey) {
                        outBuffer.append('\\');
                    }
                    outBuffer.append(' ');
                    break;
                case '\\':
                    outBuffer.append("\\\\");
                    break;
                case '\t':
                    outBuffer.append("\\t");
                    break;
                case '\n':
                    outBuffer.append("\\n");
                    break;
                case '\r':
                    outBuffer.append("\\r");
                    break;
                case '\f':
                    outBuffer.append("\\f");
                    break;
                default:
                    if ("=: \t\r\n\f#!".indexOf(c) != -1) {
                        outBuffer.append('\\');
                    }
                    outBuffer.append(c);
            }
        }
        return outBuffer.toString();
    }

    String method2(String input, boolean escapeSpace) {
        StringBuilder out = new StringBuilder(input.length() * 2);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case ' ':
                    if (i == 0 || escapeSpace) out.append('\\');
                    out.append(' ');
                    break;
                case '\t':
                    out.append("\\t");
                    break;
                case '\n':
                    out.append("\\n");
                    break;
                case '\r':
                    out.append("\\r");
                    break;
                case '\f':
                    out.append("\\f");
                    break;
                case '\\':
                case '=':
                case ':':
                case '#':
                case '!':
                    out.append('\\');
                    out.append(c);
                    break;
                default:
                    out.append(c);
            }
        }
        return out.toString();
    }
}
