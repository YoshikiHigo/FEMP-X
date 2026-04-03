package inequivalent;

public class ClonePair3669 {

    String method1(String s, int size, char completion, boolean dockRight) {
        String ret;
        if (dockRight) {
            if (s.length() > size) {
                ret = s.substring(s.length() - size, size);
            } else {
                ret = s;
                for (int i = 0; i < size - s.length(); i++) {
                    ret = completion + ret;
                }
            }
        } else {
            if (s.length() > size) {
                ret = s.substring(0, size);
            } else {
                ret = s;
                for (int i = 0; i < size - s.length(); i++) {
                    ret = ret + completion;
                }
            }
        }
        return ret;
    }

    String method2(String string, int length, char pad_char, boolean pad_begin) {
        StringBuffer str = new StringBuffer(string);
        if (length > string.length()) {
            do {
                if (pad_begin) str.insert(0, pad_char);
                else str.append(pad_char);
            }
            while (str.length() < length);
            return (str.toString());
        } else {
            return (string.substring(0, length));
        }
    }
}
