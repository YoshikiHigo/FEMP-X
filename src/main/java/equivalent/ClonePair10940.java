package equivalent;

public class ClonePair10940 {
    boolean method1(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ': {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    boolean method2(char ch) {
        switch (ch) {
            case '\n':
            case ' ':
            case '\t':
            case '\r':
            case '\f':
                return true;
            default:
                return false;
        }
    }
}
