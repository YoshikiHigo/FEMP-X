package unverified;

public class ClonePair3002 {

    boolean method1(byte[] b1,byte[] b2){
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
