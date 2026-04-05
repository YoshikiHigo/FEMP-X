package all;

public class ClonePair2848 {

    boolean method1(byte[] arrayOne,byte[] arrayTwo){
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

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if (b1 == null || b2 == null) {
        return (b1 == b2);
      }
      if (b1.length != b2.length) {
        return false;
      }
      int result=0;
      for (int i=0; i < b1.length; i++) {
        result|=(b1[i] ^ b2[i]);
      }
      return (result == 0) ? true : false;
    }
}
