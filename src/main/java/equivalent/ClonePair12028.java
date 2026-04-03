package equivalent;

public class ClonePair12028 {
    String method1(String source, String mark, String toMark) {
        String result = source;
        int p = 0;
        while (source != null && mark != null && toMark != null) {
            p = result.indexOf(mark, p);
            if (p == -1) {
                break;
            }
            result = result.substring(0, p) + toMark + result.substring(p + mark.length());
            p += toMark.length();
        }
        return result;
    }

    String method2(String string, String toBeReplaced, String replacement) {
        if (string == null || toBeReplaced == null || replacement == null) return string;
        String tail = string;
        StringBuffer result = new StringBuffer(string.length() + replacement.length());
        int length = toBeReplaced.length();
        int begin;
        while (!tail.equals("")) {
            begin = tail.indexOf(toBeReplaced);
            if (begin == -1) {
                result.append(tail);
                return result.toString();
            }
            result.append(tail, 0, begin).append(replacement);
            tail = tail.substring(begin + length);
        }
        return result.toString();
    }
}
