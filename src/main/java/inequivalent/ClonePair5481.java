package inequivalent;

public class ClonePair5481 {

    StringBuffer method1(StringBuffer b) {
        int i;
        for (i = 0; i < b.length() && Character.isWhitespace(b.charAt(i)); ++i) {
        }
        b.delete(0, i);
        for (i = b.length() - 1; i >= 0 && Character.isWhitespace(b.charAt(i)); --i) {
        }
        return b.delete(i + 1, b.length());
    }

    StringBuffer method2(StringBuffer content_buffer) {
        char c = ' ';
        int length = content_buffer.length();
        for (int i = 0; i < length; i++) {
            c = content_buffer.charAt(i);
            if (c == ' ') {
                content_buffer.deleteCharAt(i);
                length--;
                i--;
                if (length == 0) break;
            } else i = length;
        }
        String aa = content_buffer.toString();
        int i = 0;
        try {
            for (i = length - 1; i > -1; i--) {
                c = content_buffer.charAt(i);
                if ((c == ' ')) content_buffer.deleteCharAt(i);
                else i = -1;
            }
        } catch (Exception e) {
            System.out.println(aa + "<>" + content_buffer + "<>" + i);
        }
        return content_buffer;
    }
}
