package equivalent;

public class ClonePair5682 {
    boolean method1(int ch) {
        switch (ch) {
            case ' ':
            case '\n':
            case '\r':
            case '\t':
                return true;
            default:
                return false;
        }
    }

    boolean method2(int c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }
}
