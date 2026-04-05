package unverified;

public class ClonePair3370 {

    boolean method1(int[] pattern1,int[] pattern2){
      int len=pattern1.length;
      for (int i=0; i < len; i++) {
        if (pattern1[i] != pattern2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] cv,int[] cv2){
      for (int i=0; i < cv.length; i++) {
        if (cv[i] != cv2[i])     return false;
      }
      return true;
    }
}
