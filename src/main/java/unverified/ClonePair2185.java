package unverified;

public class ClonePair2185 {

    boolean method1(byte[] a1,byte[] a2){
      if (a1 == null) {
        if (a2 == null) {
          return true;
        }
        return false;
      }
     else   if (a2 == null) {
        return false;
      }
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] arrayOne,byte[] arrayTwo){
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
