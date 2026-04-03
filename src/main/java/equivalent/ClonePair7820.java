package equivalent;

public class ClonePair7820 {
    int method1(byte[] bs, byte t, int offset) {
        for (int i = offset; i < bs.length; i++) {
            byte b = bs[i];
            if (b == t) {
                return i;
            }
        }
        return -1;
    }

    int method2(byte[] array, byte value, int fromIndex) {
        while (fromIndex < array.length) {
            if (array[fromIndex] == value) return fromIndex;
            else fromIndex++;
        }
        return -1;
    }
}
