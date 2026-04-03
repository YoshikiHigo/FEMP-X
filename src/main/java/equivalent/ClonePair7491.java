package equivalent;

public class ClonePair7491 {
    int method1(byte[] data, int offset) {
        int value = 0;
        for (int i = offset + 3; i >= offset; i--) {
            value <<= 8;
            value |= ((int) data[i]) & 0xff;
        }
        return value;
    }

    int method2(byte[] byte_array, int offset) {
        int value = 0;
        for (int i = 3; i >= 0; i--) {
            value = value << 8;
            value = value | ((int) byte_array[offset + i] & 0xff);
        }
        return value;
    }
}
