package inequivalent;

public class ClonePair10856 {

    int method1(String text, int pos) {
        int result = pos;
        while (result < text.length() && text.charAt(result) == ' ') {
            result++;
        }
        return result;
    }

    int method2(String rawdata, int i) {
        int length = rawdata.length();
        while ((i < length) && Character.isWhitespace(rawdata.charAt(i))) i++;
        return i;
    }
}
