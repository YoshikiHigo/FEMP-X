package all;

public class ClonePair3293 {

    boolean method1(int[] xs,int[] ys){
      if (xs.length != ys.length)   return false;
      for (int i=xs.length - 1; i >= 0; i--) {
        if (xs[i] != ys[i])     return false;
      }
      return true;
    }

    boolean method2(int[] oid1,int[] oid2){
      int length=oid1.length;
      if (length != oid2.length) {
        return false;
      }
      while (length > 0) {
        if (oid1[--length] != oid2[length]) {
          return false;
        }
      }
      return true;
    }
}
