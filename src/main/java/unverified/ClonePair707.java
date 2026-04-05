package unverified;

public class ClonePair707 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null && b2 == null)   return true;
      if (b1 == null || b2 == null || b1.length != b2.length)   return false;
      for (int c=0; c < b1.length; c++) {
        if (b1[c] != b2[c])     return false;
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      boolean result=false;
      if (b1 == null && b2 == null)   return true;
      if (b1 != null && b2 != null) {
        result=b1.length == b2.length;
        if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
      }
      return result;
    }
}
