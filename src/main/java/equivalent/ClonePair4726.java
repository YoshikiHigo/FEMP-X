package equivalent;

public class ClonePair4726 {
    char method1(char c) {
        if (c == 'n') return '\n';
        if (c == 'f') return '\f';
        if (c == 'b') return '\b';
        if (c == 't') return '\t';
        if (c == 'r') return '\r';
        return c;
    }

    char method2(char ch) {
        switch (ch) {
            case 'b':
                ch = '\b';
                break;
            case 't':
                ch = '\t';
                break;
            case 'n':
                ch = '\n';
                break;
            case 'f':
                ch = '\f';
                break;
            case 'r':
                ch = '\r';
                break;
            case '"':
            case '\'':
            case '\\':
                break;
        }
        return ch;
    }
}
