package all;

public class ClonePair5141 {

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

    boolean method2(double[] a1,double[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] - a2[i] != 0)     return false;
        return true;
      }
      return false;
    }
}
