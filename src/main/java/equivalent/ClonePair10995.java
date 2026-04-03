package equivalent;

public class ClonePair10995 {
    int method1(byte[] aa, byte[] ab, int len) {
        for (int i = 0; i < len; i++) {
            int a = aa[i] & 0xff;
            int b = ab[i] & 0xff;
            if (a < b) {
                return -1;
            }
            if (a > b) {
                return 1;
            }
        }
        return 0;
    }

    int method2(byte[] arg1, byte[] arg2, int length) {
        for (int i = 0; i < length; i++) {
            if ((arg1[i] & 0xff) == (arg2[i] & 0xff)) continue;
            return ((arg1[i] & 0xff) < (arg2[i] & 0xff)) ? -1 : 1;
        }
        return 0;
    }
}
