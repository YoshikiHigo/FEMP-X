package inequivalent;

public class ClonePair10653 {

    boolean method1(char c) {
        if ('A' <= c && c <= 'Z') return true;
        if ('a' <= c && c <= 'z') return true;
        if (c == '_') return true;
        if (0x00C0 <= c && c <= 0x00D6) return true;
        if (0x00D8 <= c && c <= 0x00F6) return true;
        if (0x00F8 <= c && c <= 0x02FF) return true;
        if (0x0370 <= c && c <= 0x037D) return true;
        if (0x037F <= c && c <= 0x1FFF) return true;
        if (0x200C <= c && c <= 0x200D) return true;
        if (0x2070 <= c && c <= 0x218F) return true;
        if (0x2C00 <= c && c <= 0x2FEF) return true;
        if (0x3001 <= c && c <= 0xD7FF) return true;
        if (0xF900 <= c && c <= 0xFDCF) return true;
        if (0xFDF0 <= c && c <= 0xFFFD) return true;
        return 0x10000 <= c && c <= 0xEFFFF;
    }

    boolean method2(char c) {
        if (c <= 32) return false;
        switch (c) {
            case 127:
            case '(':
            case ')':
            case '<':
            case '>':
            case '@':
            case ',':
            case ';':
            case ':':
            case '\\':
            case '"':
            case '/':
            case '[':
            case ']':
            case '?':
            case '=':
            case '{':
            case '}':
                return false;
            default:
                return true;
        }
    }
}
