package unverified;

public class ClonePair3374 {

    boolean method1(int[] pattern1,int[] pattern2){
      int len=pattern1.length;
      for (int i=0; i < len; i++) {
        if (pattern1[i] != pattern2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] A,int[] B){
      int i;
      for (i=0; i < A.length; i++)   if (A[i] != B[i])   return false;
      return true;
    }
}
