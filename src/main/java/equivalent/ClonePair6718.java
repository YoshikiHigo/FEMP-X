package equivalent;

public class ClonePair6718 {
    long method1(byte[] arr) {
        long i = 0x0000000000000000;
        for (int j = 0; j < 8; ++j) {
            i <<= 8;
            i += arr[j] & 0x000000FF;
        }
        return i;
    }

    long method2(byte[] b) {
        long value = 0;
        for (int i = 0; i < 8; i++) {
            int shift = (7 - i) * 8;
            value += (long) (b[i] & 0x00000000000000FF) << shift;
        }
        return value;
    }
}
