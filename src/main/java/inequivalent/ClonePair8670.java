package inequivalent;

public class ClonePair8670 {

    int method1(String content, int fromIndex) {
        while (fromIndex < content.length() && Character.isWhitespace(content.charAt(fromIndex))) {
            ++fromIndex;
        }
        return fromIndex;
    }

    int method2(String dnChain, int startIndex) {
        while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ') {
            startIndex++;
        }
        return startIndex;
    }
}
