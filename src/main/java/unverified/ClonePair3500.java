package unverified;

public class ClonePair3500 {

    boolean method1(int[] pts1,int[] pts2){
      if (pts1 == pts2)   return true;
     else   if ((pts1 == null) || (pts2 == null))   return false;
     else   if (pts1.length != pts2.length)   return false;
     else {
        for (int i=0; i < pts1.length; i++) {
          if (pts1[i] != pts2[i])       return false;
        }
        return true;
      }
    }

    boolean method2(int[] s0,int[] s1){
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
}
