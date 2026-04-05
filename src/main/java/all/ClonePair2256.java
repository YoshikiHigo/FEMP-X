package all;

public class ClonePair2256 {

    boolean method1(byte[] ba1,byte[] ba2){
      if (ba1 == null && ba2 == null)   return true;
      if (ba1 == null || ba2 == null)   return false;
      if (ba1.length != ba2.length)   return false;
      for (int i=0; i < ba1.length; ++i) {
        if (ba1[i] != ba2[i])     return false;
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
