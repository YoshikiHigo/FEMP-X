package unverified;

public class ClonePair3017 {

    boolean method1(byte[] array1,byte[] array2){
      boolean compareresult=false;
      if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
        compareresult=true;
        for (int i=0; i < array1.length; i++) {
          if (array1[i] != array2[i]) {
            compareresult=false;
            break;
          }
        }
      }
      return compareresult;
    }

    boolean method2(byte[] byte1,byte[] byte2){
      boolean result=false;
      if (byte1 == null || byte2 == null) {
        return result;
      }
      int i=0;
      if (byte1.length == byte2.length) {
        result=true;
        while ((i < byte1.length) & result) {
          result=((byte1[i] == byte2[i]));
          i++;
        }
      }
      return result;
    }
}
