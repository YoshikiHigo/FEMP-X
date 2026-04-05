package unverified;

public class ClonePair3746 {

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
