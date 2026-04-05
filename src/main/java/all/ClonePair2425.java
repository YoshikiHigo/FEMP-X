package all;

public class ClonePair2425 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
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
