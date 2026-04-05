package unverified;

public class ClonePair3003 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null) {
        return false;
      }
      if (b1.length == b2.length) {
        int i=0;
        int j=0;
        int n=b1.length;
        while (n-- != 0) {
          if (b1[i++] != b2[j++]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] byte1,byte[] byte2){
      boolean result=false;
      if (byte1 == null || byte2 == null) {
        return result;
      }
      int i=0;
      if (byte1.length == byte2.length) {
        result=true;
        while ((i < byte1.length) & result) {
          result=((byte1[i] == byte2[i]));
          i++;
        }
      }
      return result;
    }
}
