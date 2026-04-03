package inequivalent;

public class ClonePair10824 {

    int method1(String dnChain, int startIndex) {
        while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ') startIndex++;
        return startIndex;
    }

    int method2(String src, int from) {
        for (final int len = src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from) ;
        return from;
    }
}
