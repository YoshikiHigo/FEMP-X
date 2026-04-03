package equivalent;

public class ClonePair10906 {
    boolean method1(char c) {
        if (c == '+' || c == '.' || c == '-') {
            return true;
        }
        return Character.isLetterOrDigit(c);
    }

    boolean method2(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return (c == '+') || (c == '-') || (c == '.');
    }
}
