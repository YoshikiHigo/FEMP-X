package inequivalent;

public class ClonePair8592 {

    int method1(String s, int i) {
        int len = s.length();
        for (int j = i; j < len; j++) if (Character.isSpaceChar(s.charAt(j))) return (j);
        return (-1);
    }

    int method2(String s, int startOffset) {
        final int length = s.length();
        for (int i = startOffset; i < length; i++) {
            switch (s.charAt(i)) {
                case ' ':
                case '\n':
                case '\r':
                case '\t':
                    return i;
                default:
            }
        }
        return -1;
    }
}
