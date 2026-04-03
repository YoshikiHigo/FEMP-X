package inequivalent;

public class ClonePair12468 {

    int method1(CharSequence doc, int start) {
        boolean loop = true;
        int offset = 0;
        int tmpOffset = start - 1;
        while (loop && tmpOffset >= 0) {
            char c = doc.charAt(tmpOffset);
            if (Character.isWhitespace(c)) {
                loop = false;
            } else {
                tmpOffset--;
            }
        }
        offset = tmpOffset + 1;
        return offset;
    }

    int method2(CharSequence text, int cursor) {
        int i = cursor;
        while (i > 0 && (text.charAt(i - 1) == ' ' || text.charAt(i - 1) == ',')) {
            i--;
        }
        while (i > 0 && text.charAt(i - 1) != ',') {
            i--;
        }
        while (i < cursor && text.charAt(i) == ' ') {
            i++;
        }
        return i;
    }
}
