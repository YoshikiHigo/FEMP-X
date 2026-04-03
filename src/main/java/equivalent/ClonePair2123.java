package equivalent;

public class ClonePair2123 {
    int method1(byte[] input) {
        int result = 0;
        if (input.length != 4) {
            return 0;
        }
        result ^= (input[0] & 0xff) << 24;
        result ^= (input[1] & 0xff) << 16;
        result ^= (input[2] & 0xff) << 8;
        result ^= input[3] & 0xff;
        return result;
    }

    int method2(byte[] b) {
        if (b.length != 4) return 0;
        return (b[0] << 24) + ((b[1] & 0xFF) << 16) + ((b[2] & 0xFF) << 8) + (b[3] & 0xFF);
    }
}
