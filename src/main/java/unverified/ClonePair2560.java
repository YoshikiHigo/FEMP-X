package unverified;

public class ClonePair2560 {

    boolean method1(byte[] h1,byte[] h2){
      final int length=h1.length;
      if (length != h2.length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (h1[i] != h2[i]) {
          return false;
        }
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
