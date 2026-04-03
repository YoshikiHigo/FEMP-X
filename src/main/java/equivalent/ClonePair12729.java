package equivalent;

public class ClonePair12729 {
    short method1(byte[] data, int offset) {
        int result = 0;
        int multiply = 1;
        int value = 0;
        for (int i = 0; i < 2; i++) {
            value = data[i + offset];
            if (value < 0) value = value + 256;
            result = result + (value * multiply);
            multiply = multiply * 256;
        }
        return (short) result;
    }

    short method2(byte[] data, int offset) {
        int result = 0;
        for (int i = (offset + 1); i >= offset; i--) {
            int temp = 0xFF & data[i];
            result = result << 8;
            result = result | temp;
        }
        return (short) (result & 0xFFFF);
    }
}
