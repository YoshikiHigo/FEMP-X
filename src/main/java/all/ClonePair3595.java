package all;

public class ClonePair3595 {

    boolean method1(int[] a,int[] b){
      for (int i=0; i < a.length - 1; i++) {
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
