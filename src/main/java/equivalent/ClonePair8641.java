package equivalent;

public class ClonePair8641 {
    boolean method1(char x) {
        if (x == '.') return (true);
        if (x == '+') return (true);
        if (x == '-') return (true);
        return (x >= '0') && (x <= '9');
    }

    boolean method2(char ch) {
        if ('0' <= ch && ch <= '9') return true;
        return ch == '+' || ch == '-' || ch == '.';
    }
}
