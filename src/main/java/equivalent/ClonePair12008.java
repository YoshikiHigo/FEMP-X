package equivalent;

public class ClonePair12008 {
    boolean method1(char c) {
        switch (c) {
            case 0x20:
            case 0x09:
            case 0x0a:
            case 0x0d:
                return true;
            default:
                return false;
        }
    }

    boolean method2(char c) {
        switch (c) {
            case ' ':
            case '\r':
            case '\n':
            case '\t':
                return true;
        }
        return false;
    }
}
