package equivalent;

public class ClonePair8785 {
    byte[] method1(byte[] input, int offset, int length) {
        byte[] sub = new byte[length];
        System.arraycopy(input, offset, sub, offset - offset, offset + length - offset);
        return sub;
    }

    byte[] method2(byte[] data, int offset, int length) {
        byte[] copiedBytes = new byte[length];
        System.arraycopy(data, offset + 0, copiedBytes, 0, copiedBytes.length);
        return copiedBytes;
    }
}
