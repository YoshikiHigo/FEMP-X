package equivalent;

public class ClonePair8084 {
    String method1(int length, String content) {
        if (content.length() > length) return content.substring(0, length);
        return content;
    }

    String method2(int max, String string) {
        if (string.length() > max) {
            return string.substring(0, max);
        } else {
            return string;
        }
    }
}
