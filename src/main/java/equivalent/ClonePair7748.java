package equivalent;

public class ClonePair7748 {
    int method1(int ch) {
        if (ch < '0') return -1;
        if (ch > 'f') return -1;
        if (ch <= '9') return ch - '0';
        if (ch < 'A') return -1;
        if (ch <= 'F') return ch - 'A' + 10;
        if (ch < 'a') return -1;
        return ch - 'a' + 10;
    }

    int method2(int ch) {
        switch (ch) {
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
                return ch - '0';
            case 'a':
            case 'A':
                return 10;
            case 'b':
            case 'B':
                return 11;
            case 'c':
            case 'C':
                return 12;
            case 'd':
            case 'D':
                return 13;
            case 'e':
            case 'E':
                return 14;
            case 'f':
            case 'F':
                return 15;
            default:
                return -1;
        }
    }
}
