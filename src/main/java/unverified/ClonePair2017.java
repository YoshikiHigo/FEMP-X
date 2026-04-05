package unverified;

public class ClonePair2017 {

    boolean method1(byte[] a,byte[] b){
      boolean v=a.length == b.length;
      for (int i=0; i < a.length && v; i++) {
        if (a[i] != b[i])     v=false;
      }
      return v;
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
