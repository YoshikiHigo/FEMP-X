package all;

public class ClonePair744 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null && b2 == null)   return true;
      if (b1 == null || b2 == null || b1.length != b2.length)   return false;
      for (int c=0; c < b1.length; c++) {
        if (b1[c] != b2[c])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == b) {
        return true;
      }
      if (a == null || b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      int nonEqual=0;
      for (int i=0; i != a.length; i++) {
        nonEqual|=(a[i] ^ b[i]);
      }
      return nonEqual == 0;
    }
}
