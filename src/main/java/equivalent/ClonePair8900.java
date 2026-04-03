package equivalent;

public class ClonePair8900 {
    byte[] method1(byte[] arr, int length) {
        byte[] newArr = null;
        if (arr.length == length) {
            newArr = arr;
        } else {
            newArr = new byte[length];
            for (int i = 0; i < length; i++) {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    byte[] method2(byte[] pBytes, int pLength) {
        byte[] lNewBuffer = null;
        if (pBytes.length == pLength) {
            lNewBuffer = pBytes;
        } else {
            lNewBuffer = new byte[pLength];
            System.arraycopy(pBytes, 0, lNewBuffer, 0, pLength);
        }
        return lNewBuffer;
    }
}
