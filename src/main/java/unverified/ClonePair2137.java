package unverified;

public class ClonePair2137 {

    boolean method1(byte[] d1,byte[] d2){
      if (d1.length != d2.length) {
        return false;
      }
      for (int i=0; i < d1.length; i++) {
        if (d1[i] != d2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] x,byte[] y){
      if (x == y) {
        return (true);
      }
      int len=x.length;
      if (len != y.length) {
        return (false);
      }
      for (int i=0; i < len; i++) {
        if (x[i] != y[i]) {
          return (false);
        }
      }
      return (true);
    }
}
