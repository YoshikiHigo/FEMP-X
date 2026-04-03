package inequivalent;

public class ClonePair7828 {

    int method1(byte[] ar, byte b, int from) {
        for (int i = from; i < ar.length; i++) {
            if (ar[i] == b) return i;
        }
        return -1;
    }

    int method2(byte[] bytes, byte c, int off) {
        for (int i = off; i < bytes.length; i++) {
            if (bytes[i] == c) {
                return i;
            } else if (bytes[i] == 0x29) {
                return -1;
            }
        }
        return -1;
    }
}
