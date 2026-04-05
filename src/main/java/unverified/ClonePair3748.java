package unverified;

public class ClonePair3748 {

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

    boolean method2(double[] ea,double[] ra,double delta){
      if (ea.length != ra.length)   return false;
      for (int i=0; i < ra.length; i++)   if (Math.abs(ea[i] - ra[i]) > delta)   return false;
      return true;
    }
}
