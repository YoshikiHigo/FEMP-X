package unverified;

public class ClonePair1713 {

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

    boolean method2(byte[] byte1,byte[] byte2){
      boolean result=false;
      if (byte1 == null || byte2 == null) {
        return result;
      }
      int i=0;
      if (byte1.length == byte2.length) {
        result=true;
        while ((i < byte1.length) & result) {
          result=((byte1[i] == byte2[i]));
          i++;
        }
      }
      return result;
    }
}
