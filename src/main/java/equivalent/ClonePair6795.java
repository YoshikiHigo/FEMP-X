package equivalent;

public class ClonePair6795 {
    boolean method1(byte[] bytes, String text) {
        char[] chars = text.toCharArray();
        if (chars.length > bytes.length) {
            return false;
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (bytes[i] != chars[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    boolean method2(byte[] bytes, String boundary) {
        if (bytes.length >= boundary.length()) {
            for (int i = 0; i < boundary.length(); i++) if (bytes[i] != boundary.charAt(i)) return false;
            return true;
        }
        return false;
    }
}
