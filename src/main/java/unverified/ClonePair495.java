package unverified;

public class ClonePair495 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null) {
        return (b2 == null);
      }
     else   if (b2 == null) {
        return false;
      }
     else   if (b1 == b2) {
        return true;
      }
     else   if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] ba1,byte[] ba2){
      if (ba1 == null && ba2 == null)   return true;
      if (ba1 == null || ba2 == null)   return false;
      if (ba1.length != ba2.length)   return false;
      for (int i=0; i < ba1.length; ++i) {
        if (ba1[i] != ba2[i])     return false;
      }
      return true;
    }
}
