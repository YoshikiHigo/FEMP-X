package all;

public class ClonePair1324 {

    boolean method1(byte[] b1,byte[] b2){
      boolean result=false;
      if (b1 == null && b2 == null)   return true;
      if (b1 != null && b2 != null) {
        result=b1.length == b2.length;
        if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
      }
      return result;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if (b1 == null || b2 == null) {
        return (b1 == b2);
      }
      if (b1.length != b2.length) {
        return false;
      }
      int result=0;
      for (int i=0; i < b1.length; i++) {
        result|=(b1[i] ^ b2[i]);
      }
      return (result == 0) ? true : false;
    }
}
