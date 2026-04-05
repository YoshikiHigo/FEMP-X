package unverified;

public class ClonePair3358 {

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
