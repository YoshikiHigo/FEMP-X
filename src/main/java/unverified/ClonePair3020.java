package unverified;

public class ClonePair3020 {

    boolean method1(byte[] a,byte[] b){
      if (a == null || b == null) {
        return false;
      }
      int aLength=a.length;
      if (aLength != b.length) {
        return false;
      }
      for (int i=0; i < aLength; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
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
