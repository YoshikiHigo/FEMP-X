package all;

public class ClonePair3519 {

    boolean method1(int[] int1,int[] int2){
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

    boolean method2(int[] a1,int[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }
}
