package unverified;

public class ClonePair3570 {

    boolean method1(int[] a,int[] b){
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
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
