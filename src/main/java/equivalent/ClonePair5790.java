package equivalent;

public class ClonePair5790 {
    String method1(boolean[] bools, int bitOffset, int bitLength) {
        char[] out = new char[bitLength];
        for (int i = 0; i < bitLength; i++) {
            if (bools[i + bitOffset]) out[i] = '1';
            else out[i] = '0';
        }
        return new String(out);
    }

    String method2(boolean[] data, int offset, int length) {
        char[] chars = new char[length];
        for (int i = 0; i < length; ++i) chars[i] = data[offset + i] ? '1' : '0';
        return new String(chars);
    }
}
