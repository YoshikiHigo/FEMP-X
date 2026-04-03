package inequivalent;

public class ClonePair13406 {

    boolean method1(byte[] onearray, byte[] twoarray) {
        if (onearray == twoarray) return true;
        boolean ret = (onearray.length == twoarray.length);
        if (!ret) {
            return ret;
        }
        for (int idx = 0; idx < onearray.length; idx++) {
            if (onearray[idx] != twoarray[idx]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] digest1, byte[] digest2) {
        if (digest1.length != digest2.length) return false;
        for (int i = 0; i < digest1.length; i++) if (digest1[i] != digest2[i]) return false;
        return true;
    }
}
