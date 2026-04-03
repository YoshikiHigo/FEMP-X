package inequivalent;

public class ClonePair948 {

    boolean method1(byte[] result, byte[] code) {
        return result[0] == code[0] && result[1] == code[1] && result[2] == code[2] && result[3] == code[3];
    }

    boolean method2(byte[] addr1, byte[] addr2) {
        boolean ok = true;
        for (int i = 0; i < 6; i++) {
            if (addr1[i] != addr2[i]) {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
