package all;

public class ClonePair284 {

    boolean method1(byte[] a,byte[] b){
      int alength=(a == null) ? 0 : a.length;
      int blength=(b == null) ? 0 : b.length;
      if (alength != blength) {
        return false;
      }
      for (int i=0; i < alength; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] hash1,byte[] hash2){
      if (hash1 == null)   return hash2 == null;
      if (hash2 == null)   return false;
      int targ=16;
      if (hash1.length < 16) {
        if (hash2.length != hash1.length)     return false;
        targ=hash1.length;
      }
     else   if (hash2.length < 16) {
        return false;
      }
      for (int i=0; i < targ; i++) {
        if (hash1[i] != hash2[i])     return false;
      }
      return true;
    }
}
