package all;

public class ClonePair979 {

    boolean method1(byte[] A,byte[] B){
      if (A == null)   return B == null;
     else   if (B == null || A.length != B.length)   return false;
     else   for (int i=0; i < A.length; i++) {
        if (A[i] != B[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if ((b1 == null) || (b2 == null)) {
        return false;
      }
      if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; ++i)   if (b1[i] != b2[i]) {
        return false;
      }
      return true;
    }
}
