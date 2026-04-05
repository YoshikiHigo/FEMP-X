package all;

public class ClonePair3372 {

    boolean method1(int[] pattern1,int[] pattern2){
      int len=pattern1.length;
      for (int i=0; i < len; i++) {
        if (pattern1[i] != pattern2[i]) {
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
