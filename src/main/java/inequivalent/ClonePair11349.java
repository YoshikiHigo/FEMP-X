package inequivalent;

public class ClonePair11349 {

    byte[] method1(byte[] data, int value, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            data[i] = (byte) value;
            value++;
        }
        return data;
    }

    byte[] method2(byte[] data, int value, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            data[i] = (byte) value;
        }
        return data;
    }
}
