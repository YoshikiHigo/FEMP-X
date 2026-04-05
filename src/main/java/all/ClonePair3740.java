package all;

public class ClonePair3740 {

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

    boolean method2(double[] x,double[] y,double epsilon){
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
}
