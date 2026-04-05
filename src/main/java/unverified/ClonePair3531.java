package unverified;

public class ClonePair3531 {

    boolean method1(int[] orig,int[] dest){
      for (int i=0; i < orig.length; i++)   if (orig[i] != dest[i])   return false;
      return true;
    }

    boolean method2(int[] A,int[] B){
      int i;
      for (i=0; i < A.length; i++)   if (A[i] != B[i])   return false;
      return true;
    }
}
