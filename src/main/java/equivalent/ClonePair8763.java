package equivalent;

public class ClonePair8763 {
    boolean method1(byte[] a, int aOff, int aLen, byte[] b, int bOff, int bLen) {
        if ((aLen != bLen) || (a.length < aOff + aLen) || (b.length < bOff + bLen)) {
            return false;
        }
        for (int i = 0; i < aLen; i++) {
            if (a[i + aOff] != b[i + bOff]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] a, int aOff, int aLen, byte[] b, int bOff, int bLen) {
        if ((aLen != bLen) || (a.length < aOff + aLen) || (b.length < bOff + bLen)) {
            return false;
        }
        for (int i = 0; i < aLen; i++) {
            if (a[i + aOff] != b[i + bOff]) return false;
        }
        return true;
    }
}
