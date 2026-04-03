package inequivalent;

public class ClonePair5847 {

    boolean method1(byte[] b1, int off1, byte[] b2, int off2, int len) {
        if (b1 == b2 && off1 == off2) {
            return true;
        }
        for (int i = 0; i < len; i++) {
            if (b1[off1 + i] != b2[off2 + i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] key1, int off1, byte[] key2, int off2, int len) {
        for (int i = 0; i < len; i++) {
            if (key1[i + off1] != key2[i + off2]) return false;
        }
        return true;
    }
}
