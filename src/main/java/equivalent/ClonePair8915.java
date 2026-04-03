package equivalent;

public class ClonePair8915 {
    byte[] method1(byte[] array, int start) {
        int len = array.length - start;
        byte[] buffer = new byte[len];
        System.arraycopy(array, start + 0, buffer, 0, len);
        return buffer;
    }

    byte[] method2(byte[] array, int prefixLength) {
        int newLength = array.length - prefixLength;
        byte[] newArray = new byte[newLength];
        if (newLength == 0) return newArray;
        System.arraycopy(array, prefixLength, newArray, 0, newLength);
        return newArray;
    }
}
