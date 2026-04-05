package all;

public class ClonePair983 {

    boolean method1(double a,double b,double tolerance){
      double denom=0.5 * (Math.abs(a) + Math.abs(b));
      if (denom < 1) {
        return (Math.abs(a - b) <= tolerance);
      }
     else {
        return (Math.abs(a - b) / denom <= tolerance);
      }
    }

    boolean method2(double a,double b,double maxRelativeError){
      if (Double.isNaN(a) || Double.isNaN(b)) {
        return false;
      }
      if (a == b) {
        return true;
      }
      double relativeError;
      if (Math.abs(b) > Math.abs(a)) {
        relativeError=Math.abs((a - b) / b);
      }
     else {
        relativeError=Math.abs((a - b) / a);
      }
      if (relativeError <= maxRelativeError) {
        return true;
      }
      return false;
    }
}
