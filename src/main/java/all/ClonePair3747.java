package all;

import java.util.Arrays;

public class ClonePair3747 {

    boolean method1(double[] x,double[] y,double epsilon){
      if (x.length != y.length)   return false;
      boolean result=true;
      for (int i=1; i < x.length; i++) {
        if (Math.abs(x[i] - y[i]) > epsilon) {
          result=false;
          break;
        }
      }
      return result;
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
