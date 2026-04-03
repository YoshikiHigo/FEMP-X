package inequivalent;

public class ClonePair8929 {

    int method1(String str, int startPos) {
        if (startPos < str.length()) {
            int pos = startPos;
            while (pos < str.length()) {
                char ch = str.charAt(pos);
                if (ch != ' ' && ch != '\t' && ch != '\n') {
                    return pos;
                }
                pos++;
            }
        }
        return startPos;
    }

    int method2(String content, int fromIndex) {
        boolean eolStarted = false;
        int index = fromIndex;
        for (; index < content.length(); index++) {
            if (content.charAt(index) != '\n' && content.charAt(index) != '\r') {
                break;
            }
            if (content.charAt(index) == '\r') {
                if (!eolStarted) {
                    eolStarted = true;
                    continue;
                }
            }
            if (content.charAt(index) == '\n') {
                ++index;
                break;
            }
            if (eolStarted) {
                break;
            }
        }
        return index;
    }
}
