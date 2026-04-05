package all;

public class ClonePair745 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null && b2 == null)   return true;
      if (b1 == null || b2 == null || b1.length != b2.length)   return false;
      for (int c=0; c < b1.length; c++) {
        if (b1[c] != b2[c])     return false;
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
