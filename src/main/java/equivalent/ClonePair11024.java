package equivalent;

public class ClonePair11024 {
    boolean method1(char c) {
        if (('0' <= c) && (c <= '9')) return true;
        else {
            c = Character.toLowerCase(c);
            return ('a' <= c) && (c <= 'f');
        }
    }

    boolean method2(char c) {
        switch (c) {
            case '0':
                return true;
            case '1':
                return true;
            case '2':
                return true;
            case '3':
                return true;
            case '4':
                return true;
            case '5':
                return true;
            case '6':
                return true;
            case '7':
                return true;
            case '8':
                return true;
            case '9':
                return true;
            case ':':
                return false;
            case ';':
                return false;
            case '<':
                return false;
            case '=':
                return false;
            case '>':
                return false;
            case '?':
                return false;
            case '@':
                return false;
            case 'A':
                return true;
            case 'B':
                return true;
            case 'C':
                return true;
            case 'D':
                return true;
            case 'E':
                return true;
            case 'F':
                return true;
            case 'G':
                return false;
            case 'H':
                return false;
            case 'I':
                return false;
            case 'J':
                return false;
            case 'K':
                return false;
            case 'L':
                return false;
            case 'M':
                return false;
            case 'N':
                return false;
            case 'O':
                return false;
            case 'P':
                return false;
            case 'Q':
                return false;
            case 'R':
                return false;
            case 'S':
                return false;
            case 'T':
                return false;
            case 'U':
                return false;
            case 'V':
                return false;
            case 'W':
                return false;
            case 'X':
                return false;
            case 'Y':
                return false;
            case 'Z':
                return false;
            case '[':
                return false;
            case '\\':
                return false;
            case ']':
                return false;
            case '^':
                return false;
            case '_':
                return false;
            case '`':
                return false;
            case 'a':
                return true;
            case 'b':
                return true;
            case 'c':
                return true;
            case 'd':
                return true;
            case 'e':
                return true;
            case 'f':
                return true;
        }
        return false;
    }
}
