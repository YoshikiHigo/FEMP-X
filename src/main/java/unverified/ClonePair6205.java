package unverified;

public class ClonePair6205 {

    boolean method1(boolean[] p_D0,boolean[] p_D1){
      if (p_D0 == p_D1) {
        return true;
      }
      if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
        return false;
      }
      for (int i=0; i < p_D0.length; i++) {
        if (p_D0[i] != p_D1[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(boolean[] arrayOne,boolean[] arrayTwo){
      boolean result=true;
      if ((arrayOne != null && arrayTwo == null) || (arrayOne == null && arrayTwo != null)) {
        result=false;
      }
     else   if (arrayOne != null) {
        if (arrayOne.length != arrayTwo.length) {
          result=false;
        }
     else {
          for (int i=0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
              result=false;
              break;
            }
          }
        }
      }
      return result;
    }
}
