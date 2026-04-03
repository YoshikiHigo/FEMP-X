package equivalent;

public class ClonePair4663 {
    char method1(char c) {
        switch (c) {
            case '\\':
                return '\\';
            case '"':
                return '"';
            case '\'':
                return '\'';
            case 'n':
                return '\n';
            case 't':
                return '\t';
            case 'r':
                return '\r';
            case 'f':
                return '\f';
            default:
                return c;
        }
    }

    char method2(char aChar) {
        if (aChar == 't') aChar = '\t';
        else if (aChar == 'r') aChar = '\r';
        else if (aChar == 'n') aChar = '\n';
        else if (aChar == 'f') aChar = '\f';
        return aChar;
    }
}
