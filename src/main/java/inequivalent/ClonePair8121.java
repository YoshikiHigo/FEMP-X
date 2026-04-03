package inequivalent;

import java.util.Arrays;

public class ClonePair8121 {

    boolean method1(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            int[] subarray1 = array1[i];
            int[] subarray2 = array2[i];
            if (subarray1.length != subarray2.length) return false;
            for (int j = 0; j < subarray1.length; j++) {
                if (subarray1[j] != subarray2[j]) return false;
            }
        }
        return true;
    }

    boolean method2(int[][] datos2, int[][] datos3) {
        if (datos2.length != datos3.length) {
            return false;
        }
        int i = 0;
        boolean eq = true;
        while (i < datos2.length && eq) {
            eq = Arrays.equals(datos2[i], datos3[i]);
            i++;
        }
        return eq;
    }
}
