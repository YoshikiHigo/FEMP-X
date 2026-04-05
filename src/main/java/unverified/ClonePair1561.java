package unverified;

public class ClonePair1561 {

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

    boolean method2(byte[] a1,byte[] a2){
      if ((a1 == null) || (a2 == null)) {
        return a1 == a2;
      }
      int nLength=a1.length;
      if (nLength != a2.length) {
        return false;
      }
      for (int i=0; i < nLength; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
