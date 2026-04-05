package unverified;

public class ClonePair2216 {

    boolean method1(byte[] data1,byte[] data2){
      if (data1 == data2)   return true;
      if (data1 == null || data2 == null)   return false;
      if (data1.length != data2.length)   return false;
      for (int i=0; i < data1.length; i++) {
        if (data1[i] != data2[i])     return false;
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
