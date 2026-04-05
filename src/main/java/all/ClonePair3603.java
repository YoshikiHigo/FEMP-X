package all;

public class ClonePair3603 {

    boolean method1(int[] cv,int[] cv2){
      for (int i=0; i < cv.length; i++) {
        if (cv[i] != cv2[i])     return false;
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
