package equivalent;

public class ClonePair8942 {
    int method1(int length) {
        if (length < 0x80) return 1;
        else if (length < 0x100) return 2;
        else if (length < 0x10000) return 3;
        else if (length < 0x1000000) return 4;
        else return 5;
    }

    int method2(int len) {
        int numOfLenBytes = 0;
        if (len < 128) {
            numOfLenBytes = 1;
        } else if (len < (1 << 8)) {
            numOfLenBytes = 2;
        } else if (len < (1 << 16)) {
            numOfLenBytes = 3;
        } else if (len < (1 << 24)) {
            numOfLenBytes = 4;
        } else {
            numOfLenBytes = 5;
        }
        return numOfLenBytes;
    }
}
