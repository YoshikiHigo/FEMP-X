package equivalent;

public class ClonePair12761 {
    short method1(byte[] b, int startPos) {
        int result = 0;
        for (int i = 0; i < 2; i++) {
            result <<= 8;
            result += b[startPos + i] & 0xFF;
        }
        return (short) result;
    }

    short method2(byte[] data, int offset) {
        short num = 0;
        for (int i = offset; i < offset + 2; i++) {
            num <<= 8;
            num |= (data[i] & 0xff);
        }
        return num;
    }
}
