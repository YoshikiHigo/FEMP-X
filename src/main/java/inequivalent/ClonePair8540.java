package inequivalent;

public class ClonePair8540 {

    boolean method1(StringBuffer word, String val) {
        int len = word.length();
        if (len != val.length()) return false;
        for (int index = 1; index < len; index++) {
            char cw = word.charAt(index);
            char cv = val.charAt(index);
            if (cw != cv) {
                return false;
            }
        }
        return true;
    }

    boolean method2(StringBuffer buffer, String value) {
        if (buffer.length() == value.length()) {
            for (int i = 0; i < buffer.length(); i++) {
                if (value.charAt(i) != buffer.charAt(i)) return false;
            }
            return true;
        }
        return false;
    }
}
