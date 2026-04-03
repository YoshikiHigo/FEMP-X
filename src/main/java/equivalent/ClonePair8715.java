package equivalent;

public class ClonePair8715 {
    boolean method1(char c) {
        if ((c >= 0x61 && c <= 0x7a) || (c >= 0x41 && c <= 0x5a) || c == ':' || c == '_') return true;
        if (c < 128) return false;
        return Character.isLetter(c);
    }

    boolean method2(char charV) {
        if (Character.isLetter(charV)) return true;
        if (charV == ':') return true;
        return charV == '_';
    }
}
