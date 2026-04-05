package all;

public class ClonePair1334 {

    boolean method1(byte[] b1,byte[] b2){
      boolean result=false;
      if (b1 == null && b2 == null)   return true;
      if (b1 != null && b2 != null) {
        result=b1.length == b2.length;
        if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
      }
      return result;
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
