package equivalent;

public class ClonePair4750 {
    String method1(String str, char ch, int length) {
        if (str.length() < length) {
            StringBuffer sb = new StringBuffer(ch);
            for (int i = 0; i < (length - str.length()); i++) {
                sb.append(ch);
            }
            sb.append(str);
            return sb.toString();
        } else {
            return str;
        }
    }

    String method2(String phrase, char value, int size) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < (size - (phrase.length())); i++) {
            buf.append(value);
        }
        buf.append(phrase);
        return buf.toString();
    }
}
