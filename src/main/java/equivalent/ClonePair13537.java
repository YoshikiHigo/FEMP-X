package equivalent;

public class ClonePair13537 {
    int method1(char c) {
        int ret = -1;
        switch (c) {
            case 'A':
                ret = 0;
                break;
            case 'B':
                ret = 1;
                break;
            case 'C':
                ret = 2;
                break;
            case 'D':
                ret = 3;
                break;
            case 'E':
                ret = 4;
                break;
            case 'F':
                ret = 5;
                break;
            case 'G':
                ret = 6;
                break;
            case 'H':
                ret = 7;
                break;
        }
        return ret;
    }

    int method2(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
        }
        return -1;
    }
}
