package unverified;

public class ClonePair2148 {

    boolean method1(byte[] d1,byte[] d2){
      if (d1.length != d2.length) {
        return false;
      }
      for (int i=0; i < d1.length; i++) {
        if (d1[i] != d2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
