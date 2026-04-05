package unverified;

public class ClonePair3604 {

    boolean method1(int[] cv,int[] cv2){
      for (int i=0; i < cv.length; i++) {
        if (cv[i] != cv2[i])     return false;
      }
      return true;
    }

    boolean method2(int[] tuple1,int[] tuple2){
      int arity=tuple1.length;
      for (int i=0; i < arity; i++)   if (tuple1[i] != tuple2[i])   return false;
      return true;
    }
}
