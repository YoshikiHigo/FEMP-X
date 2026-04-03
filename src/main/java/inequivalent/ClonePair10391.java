package inequivalent;

public class ClonePair10391 {

    int method1(byte[] data, int offset, int bytes) {
        int result = 0;
        for (int i = offset; i < offset + bytes; i++) {
            result *= 256;
            int b = data[i];
            if (b < 0) {
                b += 256;
            }
            result += b;
        }
        return result;
    }

    int method2(byte[] buff, int off, int len) {
        int num = 0;
        int shift = 0;
        for (int i = off + len - 1; i >= off; i--) {
            num += (buff[i] & 0xFF) << shift;
            shift += 8;
        }
        return num;
    }
}
