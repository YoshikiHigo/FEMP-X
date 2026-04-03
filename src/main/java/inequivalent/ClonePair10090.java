package inequivalent;

public class ClonePair10090 {

    int method1(byte[] bytes, int offset, int len) {
        int res = 0;
        for (int i = offset; i < len + offset; i++) {
            int b = bytes[i];
            if ((b < 0) && (i != offset)) b += 256;
            res = (res << 8) | b;
        }
        return res;
    }

    int method2(byte[] bytes, int offset, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) sum ^= bytes[offset + i];
        return sum;
    }
}
