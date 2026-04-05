package unverified;

public class ClonePair2130 {

    boolean method1(byte[] d1,byte[] d2){
      if (d1.length != d2.length) {
        return false;
      }
      for (int i=0; i < d1.length; i++) {
        if (d1[i] != d2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] h1,byte[] h2){
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
}
