package all;

public class ClonePair5140 {

    boolean method1(double[] a,double[] b){
      if (a == b) {
        return true;
      }
      if (a != null && b == null) {
        return false;
      }
      if (a == null && b != null) {
        return false;
      }
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(double[] p_D0,double[] p_D1){
      if (p_D0 == p_D1) {
        return true;
      }
      if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
        return false;
      }
      for (int i=0; i < p_D0.length; i++) {
        if (p_D0[i] != p_D1[i]) {
          return false;
        }
      }
      return true;
    }
}
