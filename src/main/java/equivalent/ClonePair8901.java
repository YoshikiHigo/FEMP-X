package equivalent;

public class ClonePair8901 {
    byte[] method1(byte[] array, int size) {
        byte[] newbuf = new byte[size];
        System.arraycopy(array, 0, newbuf, 0, size);
        return newbuf;
    }

    byte[] method2(byte[] data, int len) {
        final byte[] result = new byte[len];
        System.arraycopy(data, 0, result, 0, result.length);
        return result;
    }
}
