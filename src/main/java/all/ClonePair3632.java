package all;

public class ClonePair3632 {

    boolean method1(int[] tuple1,int[] tuple2){
      int arity=tuple1.length;
      for (int i=0; i < arity; i++)   if (tuple1[i] != tuple2[i])   return false;
      return true;
    }

    boolean method2(int[] A,int[] B){
      int i;
      for (i=0; i < A.length; i++)   if (A[i] != B[i])   return false;
      return true;
    }
}
