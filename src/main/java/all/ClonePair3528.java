package all;

public class ClonePair3528 {

    boolean method1(int[] orig,int[] dest){
      for (int i=0; i < orig.length; i++)   if (orig[i] != dest[i])   return false;
      return true;
    }

    boolean method2(int[] cv,int[] cv2){
      for (int i=0; i < cv.length; i++) {
        if (cv[i] != cv2[i])     return false;
      }
      return true;
    }
}
