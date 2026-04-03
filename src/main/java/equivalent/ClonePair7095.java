package equivalent;

public class ClonePair7095 {
    int method1(byte[] byteArray, int byteArrayOffset) {
        int result = 0;
        int tmp;
        for (int i = 0; i < 4; i++) {
            tmp = (byteArray[byteArrayOffset + i] + 256) & 0xFF;
            result += (tmp << 8 * (3 - i));
        }
        return result;
    }

    int method2(byte[] array, int offset) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            value = (value << 8) + (array[offset + i] & 0xff);
        }
        return value;
    }
}
