package unverified;

public class ClonePair1564 {

    boolean method1(byte[] left,byte[] right){
      if (left == null) {
        return ((right == null) ? true : false);
      }
      if (right == null) {
        return ((left == null) ? true : false);
      }
      if (left.length != right.length)   return false;
      for (int i=0; i < left.length; i++) {
        if (left[i] != right[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if (b1 == null || b2 == null) {
        return (b1 == b2);
      }
      if (b1.length != b2.length) {
        return false;
      }
      int result=0;
      for (int i=0; i < b1.length; i++) {
        result|=(b1[i] ^ b2[i]);
      }
      return (result == 0) ? true : false;
    }
}
