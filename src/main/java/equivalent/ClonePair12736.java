package equivalent;

public class ClonePair12736 {
    short method1(byte[] buffer, int offset) {
        short word;
        int lowByte = buffer[offset + 1];
        if (lowByte < 0) lowByte += 256;
        int highByte = buffer[offset];
        if (highByte < 0) highByte += 256;
        word = (short) (lowByte + (highByte << 8));
        return word;
    }

    short method2(byte[] bytes, int offset) {
        short result = 0x0000;
        int end = offset + 2;
        for (int i = 0; i < 2; i++) {
            result |= (bytes[end - i - 1] & 0xff) << (8 * i);
        }
        return result;
    }
}
