package unverified;

public class ClonePair3530 {

    boolean method1(int[] orig,int[] dest){
      for (int i=0; i < orig.length; i++)   if (orig[i] != dest[i])   return false;
      return true;
    }

    boolean method2(int[] arrayOne,int[] arrayTwo){
      boolean result=true;
      for (int idx=0; idx < arrayOne.length; idx++) {
        if (arrayOne[idx] != arrayTwo[idx]) {
          result=false;
          break;
        }
      }
      return result;
    }
}
