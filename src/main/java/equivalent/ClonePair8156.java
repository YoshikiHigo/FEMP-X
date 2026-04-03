package equivalent;

public class ClonePair8156 {
    int method1(String text, int width, int startPos) {
        int pos = -1;
        if (((pos = text.indexOf('\n', startPos)) != -1 && pos <= width) || ((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)) {
            return pos + 1;
        } else if (startPos + width >= text.length()) {
            return -1;
        }
        pos = startPos + width;
        char c;
        while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r')) {
            --pos;
        }
        if (pos > startPos) {
            return pos;
        }
        pos = startPos + width;
        while ((pos <= text.length()) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r')) {
            ++pos;
        }
        return (pos == text.length()) ? (-1) : pos;
    }

    int method2(String text, int width, int startPos) {
        int pos = -1;
        if (((pos = text.indexOf('\n', startPos)) != -1 && pos <= width) || ((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)) {
            return pos + 1;
        } else if ((startPos + width) >= text.length()) {
            return -1;
        }
        pos = startPos + width;
        char c;
        while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r')) {
            --pos;
        }
        if (pos > startPos) {
            return pos;
        }
        pos = startPos + width;
        while ((pos <= text.length()) && ((c = text.charAt(pos)) != ' ') && (c != '\n') && (c != '\r')) {
            ++pos;
        }
        return (pos == text.length()) ? (-1) : pos;
    }
}
