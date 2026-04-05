package unverified;

public class ClonePair972 {

    boolean method1(byte[] A,byte[] B){
      if (A == null)   return B == null;
     else   if (B == null || A.length != B.length)   return false;
     else   for (int i=0; i < A.length; i++) {
        if (A[i] != B[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if ((a == null) && (b == null)) {
        return true;
      }
      if ((a == null) && (b != null)) {
        return false;
      }
      if ((a != null) && (b == null)) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
