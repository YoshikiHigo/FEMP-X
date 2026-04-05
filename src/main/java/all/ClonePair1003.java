package all;

public class ClonePair1003 {

    boolean method1(byte[] A,byte[] B){
      if (A == null)   return B == null;
     else   if (B == null || A.length != B.length)   return false;
     else   for (int i=0; i < A.length; i++) {
        if (A[i] != B[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1 == null || array1.length == 0) {
        return array2 == null || array2.length == 0;
      }
      if (array2 == null || array1.length != array2.length) {
        return false;
      }
      for (int i=array1.length - 1; i >= 0; i--) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
