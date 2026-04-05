package unverified;

public class ClonePair3749 {

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
