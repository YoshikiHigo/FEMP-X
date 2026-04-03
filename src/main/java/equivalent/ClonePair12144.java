package equivalent;

public class ClonePair12144 {
    boolean method1(char ch) {
        if (ch >= '0' && ch <= '9') return true;
        if (ch >= 'A' && ch <= 'F') return true;
        return ch >= 'a' && ch <= 'f';
    }

    boolean method2(char c) {
        boolean result;
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                result = true;
                break;
            default:
                result = false;
        }
        return result;
    }
}
