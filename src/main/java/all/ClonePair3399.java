package all;

public class ClonePair3399 {

    boolean method1(int[] t1,int[] t2){
      for (int i=0; i < t1.length - 1; ++i)   if (t1[i] != t2[i])   return false;
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
