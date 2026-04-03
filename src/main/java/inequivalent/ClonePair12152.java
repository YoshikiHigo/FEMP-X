package inequivalent;

public class ClonePair12152 {

    String method1(String text, int textMaxChar) {
        int size, index;
        String result = null;
        if (textMaxChar <= 0) {
            result = text;
        } else {
            for (size = 0, index = 0; index < text.length() && size < textMaxChar; index++) {
                size += text.substring(index, index + 1).getBytes().length;
            }
            result = text.substring(0, index);
        }
        return result;
    }

    String method2(String s, int length) {
        if ((length > 0) && (s.length() > length)) return s.substring(0, length);
        else return s;
    }
}
