package inequivalent;

public class ClonePair10961 {

    boolean method1(char c) {
        return (c < 32) || (c == '&') || (c == '<') || (c == '>') || (c == '"') || (c == '\'') || (c == '\n') || (c == '\r');
    }

    boolean method2(char c) {
        if (c >= '0' && c <= '9') return false;
        if (c >= 'A' && c <= 'Z') return false;
        if (c >= 'a' && c <= 'z') return false;
        if (c == ' ') return false;
        if (c == ',') return false;
        if (c == '.') return false;
        if (c == '/') return false;
        if (c == '!') return false;
        if (c == '$') return false;
        if (c == '^') return false;
        if (c == '*') return false;
        if (c == '(') return false;
        if (c == ')') return false;
        if (c == '_') return false;
        if (c == '-') return false;
        if (c == '{') return false;
        if (c == '}') return false;
        if (c == '[') return false;
        if (c == ']') return false;
        if (c == '|') return false;
        return c != '\\';
    }
}
