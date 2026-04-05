package all;

public class ClonePair3533 {

    boolean method1(int[] s0,int[] s1){
      if (s0 == null || s1 == null) {
        return false;
      }
      if (s0.length != s1.length) {
        return false;
      }
      for (int i=0; i < s0.length; i++) {
        if (s0[i] != s1[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] size1,int[] size2){
      if ((size1 == null) || (size2 == null))   return false;
      if (size1.length != size2.length)   return false;
      for (int i=0; i < size1.length; i++) {
        if (size1[i] != size2[i])     return false;
      }
      return true;
    }
}
