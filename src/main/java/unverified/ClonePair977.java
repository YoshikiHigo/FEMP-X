package unverified;

public class ClonePair977 {

    boolean method1(byte[] A,byte[] B){
      if (A == null)   return B == null;
     else   if (B == null || A.length != B.length)   return false;
     else   for (int i=0; i < A.length; i++) {
        if (A[i] != B[i])     return false;
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
