package equivalent;

public class ClonePair8860 {
    byte[] method1(byte[] buffer, int offset, int length) {
        if (offset < 0 || length <= 0 || offset + length > buffer.length) {
            return null;
        }
        byte[] region = new byte[length];
        System.arraycopy(buffer, offset, region, 0, length);
        return region;
    }

    byte[] method2(byte[] array, int offset, int length) {
        if (offset < 0 || length < 1 || offset > array.length || offset + length > array.length) return null;
        byte[] result = new byte[length];
        System.arraycopy(array, offset, result, 0, length);
        return result;
    }
}
