package unverified;

public class ClonePair3498 {

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

    boolean method2(int[] int1,int[] int2){
      boolean result=false;
      if (int1 == null || int2 == null) {
        return result;
      }
      if (int1.length == int2.length) {
        result=true;
        int i=0;
        while ((i < int1.length) & result) {
          result=((int1[i] == int2[i]));
          i++;
        }
      }
      return result;
    }
}
