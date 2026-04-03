package equivalent;

public class ClonePair10819 {
    boolean method1(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    boolean method2(char ch) {
        if (ch > ' ') return false;
        else return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }
}
