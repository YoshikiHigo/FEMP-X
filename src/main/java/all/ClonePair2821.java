package all;

public class ClonePair2821 {

    boolean method1(byte[] a,byte[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
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
