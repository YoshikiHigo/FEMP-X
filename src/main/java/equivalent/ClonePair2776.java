package equivalent;

public class ClonePair2776 {
    boolean method1(byte[] tom, byte[] jerry) {
        boolean b = true;
        if (tom.length != jerry.length) {
            b = false;
        } else {
            for (int i = 0; i < tom.length; i++) {
                if (tom[i] != jerry[i]) {
                    b = false;
                    break;
                }
            }
        }
        return b;
    }

    boolean method2(byte[] b1, byte[] b2) {
        boolean ret = false;
        if (b1.length == b2.length) {
            ret = true;
            for (int i = 0; i < b1.length && ret; i++) {
                if (b1[i] != b2[i]) {
                    ret = false;
                    break;
                }
            }
        }
        return ret;
    }
}
