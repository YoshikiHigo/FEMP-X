package equivalent;

public class ClonePair7037 {
    int method1(byte[] data, int offset) {
        int result = 0;
        int multiply = 1;
        int value = 0;
        for (int i = 0; i < 4; i++) {
            value = data[i + offset];
            if (value < 0) value = value + 256;
            result = result + (value * multiply);
            multiply = multiply * 256;
        }
        return result;
    }

    int method2(byte[] b, int offset) {
        int accum = 0;
        for (int shiftBy = 0, i = offset; shiftBy < 32; shiftBy += 8, i++) {
            accum |= (b[i] & 0xff) << shiftBy;
        }
        return accum;
    }
}
