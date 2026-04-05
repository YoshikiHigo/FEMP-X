package all;

public class ClonePair1174 {

    boolean method1(byte[] header,byte[] full){
      int i=0;
      for (  byte b : header) {
        if (b != full[i++])     return false;
      }
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean returnVal=true;
      if (array1.length != array2.length) {
        returnVal=false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          returnVal=false;
        }
      }
      return returnVal;
    }
}
