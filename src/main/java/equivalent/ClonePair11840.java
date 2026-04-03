package equivalent;

public class ClonePair11840 {
    boolean method1(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return (c == '$') || (c == '-') || (c == '_') || (c == '.') || (c == '+') || (c == ';') || (c == '?') || (c == '&') || (c == '=') || (c == '%');
    }

    boolean method2(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return c == '$' || c == '-' || c == '_' || c == '.' || c == '+' || c == ';' || c == '?' || c == '&' || c == '=' || c == '%';
    }
}
