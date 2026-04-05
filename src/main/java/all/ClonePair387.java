package all;

public class ClonePair387 {

    boolean method1(byte[] a,byte[] b){
      if (a == b) {
        return true;
      }
      if (a == null || b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] x,byte[] y){
      if (x == null || y == null)   return false;
      if (x.length != y.length)   return false;
      for (int i=0; i < x.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }
}
