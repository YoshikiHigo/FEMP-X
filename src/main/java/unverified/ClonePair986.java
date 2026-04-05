package unverified;

public class ClonePair986 {

    boolean method1(byte[] A,byte[] B){
      if (A == null)   return B == null;
     else   if (B == null || A.length != B.length)   return false;
     else   for (int i=0; i < A.length; i++) {
        if (A[i] != B[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a1,byte[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }
}
