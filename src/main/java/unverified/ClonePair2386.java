package unverified;

public class ClonePair2386 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b1.length; i++)   if (b1[i] != b2[i])   return false;
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
