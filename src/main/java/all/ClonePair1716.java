package all;

public class ClonePair1716 {

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

    boolean method2(byte[] one,byte[] two){
      if ((one == null) || (two == null)) {
        return false;
      }
      if (one.length != two.length) {
        return false;
      }
      int length=one.length;
      int byteCount=0;
      while (byteCount < length) {
        if (one[byteCount] != two[byteCount]) {
          return false;
        }
        ++byteCount;
      }
      return true;
    }
}
