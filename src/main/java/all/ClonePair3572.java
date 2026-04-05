package all;

public class ClonePair3572 {

    boolean method1(int[] a,int[] b){
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
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
