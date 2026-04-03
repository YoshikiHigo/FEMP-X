package equivalent;

public class ClonePair8060 {
    String method1(byte[] bytes, int offset, int length) {
        final char[] c = new char[length];
        for (int i = 0; i < c.length; ++i) {
            c[i] = (char) bytes[i + offset];
        }
        return new String(c);
    }

    String method2(byte[] data, int offset, int length) {
        byte[] stringData = new byte[length];
        System.arraycopy(data, offset, stringData, 0, length);
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) stringData[i];
        }
        return String.valueOf(charArray);
    }
}
