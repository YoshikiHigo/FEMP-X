package equivalent;

import java.util.Arrays;

public class ClonePair4461 {
    double method1(double[] val) {
        Arrays.sort(val);
        int mid = val.length / 2;
        if ((val.length % 2) > 0) {
            return (val[mid]);
        } else {
            return ((val[mid] + val[mid - 1]) / 2);
        }
    }

    double method2(double[] vec) {
        Arrays.sort(vec);
        if (vec.length % 2 == 0) {
            return (vec[vec.length / 2 - 1] + vec[vec.length / 2]) / 2.0;
        } else {
            return vec[vec.length / 2];
        }
    }
}
