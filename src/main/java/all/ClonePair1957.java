package all;

public class ClonePair1957 {

    boolean method1(byte[] blob1,byte[] blob2){
      if (blob1 == null) {
        return blob2 == null;
      }
      if (blob2 == null) {
        return blob1 == null;
      }
      boolean rc=blob1.length == blob2.length;
      if (rc) {
        for (int i=0; i < blob1.length; i++) {
          if (blob1[i] != blob2[i]) {
            rc=false;
            break;
          }
        }
      }
      return rc;
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
