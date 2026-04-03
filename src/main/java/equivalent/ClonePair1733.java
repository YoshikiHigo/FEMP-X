package equivalent;

public class ClonePair1733 {
    boolean method1(byte[] buf, byte[] magic) {
        boolean match = true;
        for (int i = 0; i < magic.length; i++) {
            if (buf[i] != magic[i]) {
                match = false;
                break;
            }
        }
        return match;
    }

    boolean method2(byte[] blob, byte[] sig) {
        int n = sig.length;
        for (int i = 0; i < n; i++) {
            if (blob[i] != sig[i]) {
                return false;
            }
        }
        return true;
    }
}
