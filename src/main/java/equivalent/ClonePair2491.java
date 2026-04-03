package equivalent;

public class ClonePair2491 {
    boolean method1(byte[] signreq2, byte[] signres2) {
        boolean retval = true;
        if (signreq2.length != signres2.length) {
            return false;
        }
        for (int i = 0; i < signreq2.length; i++) {
            if (signreq2[i] != signres2[i]) {
                return false;
            }
        }
        return retval;
    }

    boolean method2(byte[] h1, byte[] h2) {
        final int length = h1.length;
        if (length != h2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (h1[i] != h2[i]) {
                return false;
            }
        }
        return true;
    }
}
