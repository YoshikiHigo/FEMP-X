package unverified;

public class ClonePair1253 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == b2)   return true;
      if (b1 == null || b2 == null)   return false;
      int length=b1.length;
      if (length != b2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(b1[index] == b2[index]))     return false;
      }
      return true;
    }

    boolean method2(byte[] left,byte[] right){
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
}
