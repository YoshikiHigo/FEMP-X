package inequivalent;

import java.util.Arrays;

public class ClonePair2646 {

    boolean method1(byte[] b1, byte[] b2) {
        if (b1.length != b2.length) return false;
        for (int i = b1.length; --i >= 0; ) {
            if (b1[i] != b2[i]) return false;
        }
        return true;
    }

    boolean method2(byte[] sumR, byte[] sumL) {
        System.out.println("==" + sumL.length + "==" + sumR.length);
        System.out.println(">" + Arrays.toString(sumR));
        System.out.println(">" + Arrays.toString(sumL));
        if (sumR.length == sumL.length) {
            for (int i = 0; i < sumR.length; i++) if (sumR[i] != sumL[i]) return false;
            return true;
        }
        return false;
    }
}
