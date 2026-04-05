package unverified;

public class ClonePair1018 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
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
