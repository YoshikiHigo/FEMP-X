package unverified;

public class ClonePair1239 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 != null) {
        if (b2 != null) {
          if (b1.length == b2.length) {
            boolean flag=true;
            for (int i=0; i < b1.length; i++) {
              if (b1[i] != b2[i]) {
                flag=false;
                break;
              }
            }
            return flag;
          }
     else {
            return false;
          }
        }
     else {
          return false;
        }
      }
     else {
        if (b2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
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
