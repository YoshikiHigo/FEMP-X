package all;

public class ClonePair3297 {

    boolean method1(int[] xs,int[] ys){
      if (xs.length != ys.length)   return false;
      for (int i=xs.length - 1; i >= 0; i--) {
        if (xs[i] != ys[i])     return false;
      }
      return true;
    }

    boolean method2(int[] indices1,int[] indices2){
      if (indices1.length != indices2.length) {
        return false;
      }
      int len=indices1.length;
      int j;
      for (j=0; j < len; j++) {
        if (indices1[0] == indices2[j]) {
          break;
        }
      }
      if (j == len) {
        return false;
      }
      for (int i=1; i < len; i++) {
        if (indices1[i] != indices2[(j + i) % len]) {
          return false;
        }
      }
      return true;
    }
}
