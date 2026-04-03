package equivalent;

public class ClonePair10854 {
    boolean method1(char c) {
        return ('\t' == c) || ('\n' == c) || ('\r' == c) || (' ' == c);
    }

    boolean method2(char c) {
        switch (c) {
            case '\n':
            case '\r':
            case '\t':
            case ' ':
                return true;
            default:
                return false;
        }
    }
}
