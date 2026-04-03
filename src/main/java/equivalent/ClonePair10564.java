package equivalent;

import java.util.Arrays;

public class ClonePair10564 {
    double method1(double[] ar) {
        double[] ar2 = new double[ar.length];
        System.arraycopy(ar, 0, ar2, 0, ar.length);
        Arrays.sort(ar2);
        if (ar2.length % 2 == 0) return (ar2[ar.length / 2] + ar2[ar.length / 2 - 1]) / 2.;
        else return ar2[ar.length / 2];
    }

    double method2(double[] ar) {
        double[] ar2 = new double[ar.length];
        System.arraycopy(ar, 0, ar2, 0, ar.length);
        Arrays.sort(ar2);
        if (ar2.length % 2 == 0) return (ar2[ar.length / 2] + ar2[ar.length / 2 - 1]) / 2.;
        else return ar2[ar.length / 2];
    }
}
