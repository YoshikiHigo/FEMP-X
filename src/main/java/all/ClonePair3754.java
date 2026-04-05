package all;

import java.util.Arrays;

public class ClonePair3754 {

    boolean method1(double[] a,double[] b,double tolerance){
      if (tolerance == 0) {
        return Arrays.equals(a,b);
      }
     else {
        if (a.length != b.length) {
          return false;
        }
        for (int i=0; i < a.length; i++) {
          if (Math.abs(a[i] - b[i]) > tolerance) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(double[] a1,double[] a2,double precision){
      if (a1.length != a2.length) {
        return false;
      }
      for (int i=0; i < a1.length; i++) {
        if (Math.abs(a1[i] - a2[i]) > precision) {
          return false;
        }
      }
      return true;
    }
}
