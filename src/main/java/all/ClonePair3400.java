package all;

public class ClonePair3400 {

    boolean method1(int[] t1,int[] t2){
      for (int i=0; i < t1.length - 1; ++i)   if (t1[i] != t2[i])   return false;
      return true;
    }

    boolean method2(int[] A,int[] B){
      int i;
      for (i=0; i < A.length; i++)   if (A[i] != B[i])   return false;
      return true;
    }
}
