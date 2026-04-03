package equivalent;

public class ClonePair4794 {
    char method1(char base) {
        switch (base) {
            case 'A':
                return 'T';
            case 'a':
                return 't';
            case 'C':
                return 'G';
            case 'c':
                return 'g';
            case 'G':
                return 'C';
            case 'g':
                return 'c';
            case 'T':
                return 'A';
            case 't':
                return 'a';
            default:
                return base;
        }
    }

    char method2(char c) {
        if (c == 'a') {
            return 't';
        }
        if (c == 'c') {
            return 'g';
        }
        if (c == 'g') {
            return 'c';
        }
        if (c == 't') {
            return 'a';
        }
        if (c == 'A') {
            return 'T';
        }
        if (c == 'C') {
            return 'G';
        }
        if (c == 'G') {
            return 'C';
        }
        if (c == 'T') {
            return 'A';
        }
        return c;
    }
}
