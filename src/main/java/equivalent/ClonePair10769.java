package equivalent;

public class ClonePair10769 {
    boolean method1(char ch) {
        if (ch <= 'z' && 'a' <= ch) {
            return true;
        } else if (ch <= 'Z' && 'A' <= ch) {
            return true;
        }
        return ch <= '9' && '0' <= ch;
    }

    boolean method2(char c) {
        if ('a' <= c && c <= 'z') {
            return true;
        }
        if ('A' <= c && c <= 'Z') {
            return true;
        }
        return '0' <= c && c <= '9';
    }
}
