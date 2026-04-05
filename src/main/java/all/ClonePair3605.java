package all;

public class ClonePair3605 {

    boolean method1(int[] cv,int[] cv2){
      for (int i=0; i < cv.length; i++) {
        if (cv[i] != cv2[i])     return false;
      }
      return true;
    }

    boolean method2(int[] A,int[] B){
      int i;
      for (i=0; i < A.length; i++)   if (A[i] != B[i])   return false;
      return true;
    }
}
