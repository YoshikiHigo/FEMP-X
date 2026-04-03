package equivalent;

public class ClonePair8652 {
    boolean method1(char ch) {
        if (ch == 0x9 || ch == 0xA || ch == 0xD) return true;
        if ((0x20 <= ch) && (ch <= 0xD7FF)) return true;
        if ((0xE000 <= ch) && (ch <= 0xFFFD)) return true;
        return (0x10000 <= ch) && (ch <= 0x10FFFF);
    }

    boolean method2(char c) {
        if (c == '\n') return true;
        if (c == '\r') return true;
        if (c == '\t') return true;
        if (c < 0x20) return false;
        if (c <= 0xD7FF) return true;
        if (c < 0xE000) return false;
        if (c <= 0xFFFD) return true;
        if (c < 0x10000) return false;
        return c <= 0x10FFFF;
    }
}
