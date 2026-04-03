package equivalent;

public class ClonePair3468 {
    CharSequence method1(CharSequence jsonText) {
        int len = jsonText.length();
        int st = 0;
        int off = 0;
        while ((st < len) && (jsonText.charAt(off + st) <= ' ')) st++;
        while ((st < len) && (jsonText.charAt(off + len - 1) <= ' ')) len--;
        return ((st > 0) || (len < jsonText.length())) ? jsonText.subSequence(st, len) : jsonText;
    }

    CharSequence method2(CharSequence text) {
        int length = text.length();
        if (length == 0) return text;
        int start = 0;
        int end = length - 1;
        while (start < length && text.charAt(start) <= ' ') {
            start++;
        }
        if (start == length) return text.subSequence(0, 0);
        while (end > start && text.charAt(end) <= ' ') {
            end--;
        }
        return text.subSequence(start, end + 1);
    }
}
