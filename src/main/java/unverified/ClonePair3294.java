package unverified;

public class ClonePair3294 {

    boolean method1(int[] xs,int[] ys){
      if (xs.length != ys.length)   return false;
      for (int i=xs.length - 1; i >= 0; i--) {
        if (xs[i] != ys[i])     return false;
      }
      return true;
    }

    boolean method2(int[] test1,int[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != test2[i]) {
            isEqual=false;
            break;
          }
        }
      }
      return isEqual;
    }
}
