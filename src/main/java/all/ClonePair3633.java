package all;

public class ClonePair3633 {

    boolean method1(int[] arrayOne,int[] arrayTwo){
      boolean result=true;
      for (int idx=0; idx < arrayOne.length; idx++) {
        if (arrayOne[idx] != arrayTwo[idx]) {
          result=false;
          break;
        }
      }
      return result;
    }

    boolean method2(int[] A,int[] B){
      int i;
      for (i=0; i < A.length; i++)   if (A[i] != B[i])   return false;
      return true;
    }
}
