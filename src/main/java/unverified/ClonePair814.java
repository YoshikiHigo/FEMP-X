package unverified;

public class ClonePair814 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == b2)   return true;
      if (b1 == null || b2 == null)   return false;
      int length=b1.length;
      if (length != b2.length) {
        return false;
      }
      for (int index=0; index < length; index++) {
        if (!(b1[index] == b2[index])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a1,byte[] a2){
      if (a1 == null) {
        if (a2 == null) {
          return true;
        }
        return false;
      }
     else   if (a2 == null) {
        return false;
      }
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i])     return false;
      }
      return true;
    }
}
