package all;

public class ClonePair1709 {

    boolean method1(byte[] x,byte[] y){
      if (x == null || y == null)   return false;
      if (x.length != y.length)   return false;
      for (int i=0; i < x.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null) {
        return false;
      }
      if (b1.length == b2.length) {
        int i=0;
        int j=0;
        int n=b1.length;
        while (n-- != 0) {
          if (b1[i++] != b2[j++]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
