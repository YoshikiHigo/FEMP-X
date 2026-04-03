package equivalent;

public class ClonePair11408 {
    String method1(String text, String separator) {
        int index;
        if ((text == null) || (separator == null)) return text;
        index = text.lastIndexOf(separator);
        if (index < 0) return text;
        return text.substring(index + 1);
    }

    String method2(String text, String separator) {
        int index;
        if ((text == null) || (separator == null)) {
            return text;
        }
        index = text.lastIndexOf(separator);
        if (index < 0) {
            return text;
        }
        return text.substring(index + 1);
    }
}
