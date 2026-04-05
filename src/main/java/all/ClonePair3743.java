package all;

import java.util.Arrays;

public class ClonePair3743 {

    boolean method1(double[] a,double[] b,double tolerance){
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (Math.abs(a[i] - b[i]) > tolerance) {
            return false;
          }
        }
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(double[] a,double[] b,double tolerance){
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
}
