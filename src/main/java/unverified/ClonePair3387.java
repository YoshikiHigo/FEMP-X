package unverified;

public class ClonePair3387 {

    boolean method1(int[] int1,int[] int2){
      if (int1 == null && int2 == null) {
        return true;
      }
     else   if (int1 == null || int2 == null) {
        return false;
      }
      if (int1.length != int2.length) {
        return false;
      }
      for (int i=0; i < int1.length; i++) {
        if (int1[i] != int2[i]) {
          return false;
        }
      }
      return true;
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
