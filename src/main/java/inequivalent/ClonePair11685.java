package inequivalent;

public class ClonePair11685 {

    boolean method1(char c) {
        switch (c) {
            case '\\':
            case '^':
            case '?':
            case '*':
            case '+':
            case '(':
            case ')':
            case '{':
            case '}':
            case '|':
            case '[':
            case ']':
            case '-':
            case '&':
            case '$':
            case '.':
                return true;
        }
        return false;
    }

    boolean method2(char c) {
        if (c >= 'A' && c <= 'Z') return false;
        if (c >= 'a' && c <= 'z') return false;
        return c < '0' || c > '9';
    }
}
