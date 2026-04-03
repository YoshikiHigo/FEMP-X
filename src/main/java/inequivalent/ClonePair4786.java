package inequivalent;

public class ClonePair4786 {

    String method1(String str, char c, int size) {
        StringBuffer buffer = new StringBuffer(str.substring(0, str.length() > size ? size : str.length()));
        for (int i = buffer.length(); i < size; i++) {
            buffer.append(c);
        }
        return buffer.toString();
    }

    String method2(String str, char charFill, int length) {
        StringBuffer result = new StringBuffer();
        if (str.length() >= length) {
            return result.append(str, 0, length).toString();
        } else {
            result.append(str);
            int qtde = length - str.length();
            for (int i = 0; i < qtde; i++) {
                result.insert(0, charFill);
            }
            return result.toString();
        }
    }
}
