package equivalent;

public class ClonePair7344 {
    int method1(byte[] buf, int index) {
        int i0 = buf[index] & 0xff;
        int i1 = buf[index + 1] & 0xff;
        int i2 = buf[index + 2] & 0xff;
        int i3 = buf[index + 3] & 0xff;
        long convInt = i0 + i1 * 256 + i2 * 65536 + i3 * 16777216L;
        if ((convInt & 0x80000000L) == 0x80000000L) convInt = -(0x100000000L - convInt);
        index += 4;
        return (int) convInt;
    }

    int method2(byte[] array, int index) {
        int value = 0;
        int shift = 0;
        while (shift != 32) {
            value |= (0x000000ff & ((int) array[index])) << shift;
            index++;
            shift += 8;
        }
        return value;
    }
}
