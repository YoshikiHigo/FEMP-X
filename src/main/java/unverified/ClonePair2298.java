package unverified;

public class ClonePair2298 {

    boolean method1(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      int len=array1.length;
      for (int i=0; i < len; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=b1.length; --i >= 0; ) {
        if (b1[i] != b2[i])     return false;
      }
      return true;
    }
}
