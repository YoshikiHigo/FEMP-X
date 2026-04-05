package all;

public class ClonePair3744 {

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

    boolean method2(double[] ea,double[] ra,double delta){
      if (ea.length != ra.length)   return false;
      for (int i=0; i < ra.length; i++)   if (Math.abs(ea[i] - ra[i]) > delta)   return false;
      return true;
    }
}
