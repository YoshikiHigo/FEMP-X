package equivalent;

public class ClonePair8044 {
    String method1(byte[] array, int off, int length) {
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) array[off + i];
        }
        return new String(charArray);
    }

    String method2(byte[] buffer, int startPos, int length) {
        char[] charArray = new char[length];
        int readpoint = startPos;
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) buffer[readpoint];
            readpoint++;
        }
        return new String(charArray);
    }
}
