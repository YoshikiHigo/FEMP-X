package inequivalent;

public class ClonePair7960 {

    String method1(char[] ch, int start, int length) {
        int end = start + length - 1;
        StringBuffer buf = new StringBuffer();
        char cur_char;
        int index = start;
        while (index <= end) {
            cur_char = ch[index];
            switch (cur_char) {
                case '\n':
                case '\r':
                case '\t':
                case '\f':
                case ' ':
                    break;
                default:
                    buf.append(cur_char);
                    break;
            }
            index++;
        }
        return buf.toString();
    }

    String method2(char[] ch, int start, int length) {
        int end = start + length - 1;
        LEFT_TRIM_LOOP:
        while (start <= end) {
            char cur_char = ch[start];
            switch (cur_char) {
                case '\n':
                case '\r':
                case '\t':
                case '\f':
                case ' ':
                    start++;
                    break;
                default:
                    break LEFT_TRIM_LOOP;
            }
        }
        RIGHT_TRIM_LOOP:
        while (start <= end) {
            char cur_char = ch[end];
            switch (cur_char) {
                case '\n':
                case '\r':
                case '\t':
                case '\f':
                case ' ':
                    end--;
                    break;
                default:
                    break RIGHT_TRIM_LOOP;
            }
        }
        if (start > end) {
            return "";
        }
        length = end - start + 1;
        return new String(ch, start, length);
    }
}
