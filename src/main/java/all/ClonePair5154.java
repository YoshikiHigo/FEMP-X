package all;

public class ClonePair5154 {

    boolean method1(double[] p_D0,double[] p_D1){
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

    boolean method2(double[] a1,double[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }
}
