package equivalent;

public class ClonePair12034 {
    boolean method1(char c) {
        boolean result = false;
        switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
                result = true;
                break;
            default:
                result = false;
                break;
        }
        return result;
    }

    boolean method2(char c) {
        return c == ' ' || c == '	' || c == '\r' || c == '\n';
    }
}
