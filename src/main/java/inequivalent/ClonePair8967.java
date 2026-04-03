package inequivalent;

public class ClonePair8967 {

    boolean method1(char ch) {
        if (Character.isLetterOrDigit(ch)) {
            return true;
        }
        switch (ch) {
            case '.':
            case '_':
            case '?':
            case '\\':
                return true;
        }
        return false;
    }

    boolean method2(char c) {
        switch (c) {
            case '<':
            case '>':
            case '(':
            case ')':
            case '[':
            case ']':
            case '{':
            case '}':
                return false;
        }
        return true;
    }
}
