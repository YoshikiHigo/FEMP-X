package all;

public class ClonePair1960 {

    boolean method1(byte[] blob1,byte[] blob2){
      if (blob1 == null) {
        return blob2 == null;
      }
      if (blob2 == null) {
        return blob1 == null;
      }
      boolean rc=blob1.length == blob2.length;
      if (rc) {
        for (int i=0; i < blob1.length; i++) {
          if (blob1[i] != blob2[i]) {
            rc=false;
            break;
          }
        }
      }
      return rc;
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
