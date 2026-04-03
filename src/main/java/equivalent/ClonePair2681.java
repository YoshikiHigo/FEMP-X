package equivalent;

public class ClonePair2681 {
    int method1(byte[] data) {
        int number;
        number = 0;
        for (int i = 0; i < 4; ++i) {
            number |= (data[3 - i] & 0xff) << (i << 3);
        }
        return number;
    }

    int method2(byte[] b) {
        int mask = 0xff;
        int temp = 0;
        int n = 0;
        for (int i = 0; i < 4; i++) {
            n <<= 8;
            temp = b[i] & mask;
            n |= temp;
        }
        return n;
    }
}
