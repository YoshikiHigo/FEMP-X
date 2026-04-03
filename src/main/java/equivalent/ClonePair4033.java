package equivalent;

public class ClonePair4033 {
    boolean method1(char[] text, int len) {
        boolean space = true;
        for (int i = 0; i < len; i++) {
            char c = text[i];
            if (c != ' ' && c != '\t' && c != '\n' && c != '\r') {
                space = false;
                break;
            }
        }
        return space;
    }

    boolean method2(char[] buf, int len) {
        for (int i = 0; i < len; i++) {
            switch (buf[i]) {
                case ' ':
                case '\n':
                case '\r':
                case '\t':
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
