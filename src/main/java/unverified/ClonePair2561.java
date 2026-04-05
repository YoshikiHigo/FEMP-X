package unverified;

public class ClonePair2561 {

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

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b2.length; i++) {
        byte b=b2[i];
        if (b != b1[i])     return false;
      }
      return true;
    }
}
