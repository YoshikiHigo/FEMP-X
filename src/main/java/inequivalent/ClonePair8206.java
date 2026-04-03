package inequivalent;

public class ClonePair8206 {

    int method1(String text, int start, int len) {
        while (start < len && text.charAt(start) <= 32) {
            start++;
        }
        return start;
    }

    int method2(String ss, int i, int l) {
        while (i < l) {
            if (!Character.isWhitespace(ss.charAt(i))) {
                break;
            }
            i++;
        }
        return i;
    }
}
