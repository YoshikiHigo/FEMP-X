package unverified;

public class ClonePair703 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null && b2 == null)   return true;
      if (b1 == null || b2 == null || b1.length != b2.length)   return false;
      for (int c=0; c < b1.length; c++) {
        if (b1[c] != b2[c])     return false;
      }
      return true;
    }

    boolean method2(byte[] A,byte[] B){
      if (A == null)   return B == null;
     else   if (B == null || A.length != B.length)   return false;
     else   for (int i=0; i < A.length; i++) {
        if (A[i] != B[i])     return false;
      }
      return true;
    }
}
