package inequivalent;

public class ClonePair10881 {

    int method1(String text, int start) {
        for (int i = start; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '\n':
                case ' ':
                    return i;
            }
        }
        return text.length();
    }

    int method2(String s, int fromIndex) {
        final int len = s.length();
        for (int index = fromIndex; index < len; index++) {
            char c = s.charAt(index);
            if (c == ' ' || c == '\t') return index;
        }
        return len;
    }
}
