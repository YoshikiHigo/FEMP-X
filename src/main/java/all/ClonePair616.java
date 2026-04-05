package all;

public class ClonePair616 {

    boolean method1(byte[] test,byte[] good){
      if ((test == null) || (good == null)) {
        return (test == null) && (good == null);
      }
      if (test.length != good.length) {
        return false;
      }
      if (test.length == 0) {
        return true;
      }
      int bits=0;
      for (int i=0; i < good.length; i++) {
        bits|=test[i] ^ good[i];
      }
      return bits == 0;
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
