package unverified;

public class ClonePair3357 {

    boolean method1(int[] a1,int[] a2){
      if (a1 == a2) {
        return true;
      }
     else   if (a1 == null || a2 == null) {
        return false;
      }
     else   if (a1.length != a2.length) {
        return false;
      }
     else {
        for (int i=0; i < a1.length; i++) {
          if (a1[i] != a2[i]) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(int[] pts1,int[] pts2){
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
}
