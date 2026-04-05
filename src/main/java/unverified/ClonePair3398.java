package unverified;

public class ClonePair3398 {

    boolean method1(int[] t1,int[] t2){
      for (int i=0; i < t1.length - 1; ++i)   if (t1[i] != t2[i])   return false;
      return true;
    }

    boolean method2(int[] cv,int[] cv2){
      for (int i=0; i < cv.length; i++) {
        if (cv[i] != cv2[i])     return false;
      }
      return true;
    }
}
