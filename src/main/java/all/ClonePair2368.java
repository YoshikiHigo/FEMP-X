package all;

public class ClonePair2368 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if ((b1 == null) || (b2 == null)) {
        return false;
      }
      if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; ++i)   if (b1[i] != b2[i]) {
        return false;
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
