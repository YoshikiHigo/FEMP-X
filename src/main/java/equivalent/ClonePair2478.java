package equivalent;

public class ClonePair2478 {
    int method1(byte[] arr) {
        int i = 0x00000000, j;
        for (j = 0; j < 4; ++j) {
            i <<= 8;
            i += arr[j] & 0x000000FF;
        }
        return i;
    }

    int method2(byte[] b) {
        int a = 0;
        for (int i = 3; i >= 0; i--) {
            a += (b[3 - i] & 0xFF) << (i * 8);
        }
        return a;
    }
}
