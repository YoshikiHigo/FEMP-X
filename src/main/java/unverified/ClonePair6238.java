package unverified;

public class ClonePair6238 {

    boolean method1(boolean[] a1,boolean[] a2){
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
