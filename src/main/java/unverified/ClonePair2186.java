package unverified;

public class ClonePair2186 {

    boolean method1(byte[] a1,byte[] a2){
      if (a1 == null) {
        if (a2 == null) {
          return true;
        }
        return false;
      }
     else   if (a2 == null) {
        return false;
      }
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == null)   return b == null;
     else   if (b == null)   return false;
     else   if (b.length <= 0)   return a.length <= 0;
      byte diff=(byte)((a.length == b.length) ? 0 : 1);
      int j=0;
      for (int i=0; i < a.length; ++i) {
        diff|=a[i] ^ b[j];
        j=(j + 1) % b.length;
      }
      return diff == 0;
    }
}
