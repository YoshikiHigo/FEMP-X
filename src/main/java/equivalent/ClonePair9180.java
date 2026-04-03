package equivalent;

public class ClonePair9180 {
    boolean method1(char c) {
        if ('a' <= c && c <= 'z') return true;
        if ('A' <= c && c <= 'Z') return true;
        return '0' <= c && c <= '9';
    }

    boolean method2(char c) {
        if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
            return true;
        } else return c >= 48 && c <= 57;
    }
}
