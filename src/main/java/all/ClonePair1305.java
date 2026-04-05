package all;

public class ClonePair1305 {

    boolean method1(byte[] b1,byte[] b2){
      boolean result=false;
      if (b1 == null && b2 == null)   return true;
      if (b1 != null && b2 != null) {
        result=b1.length == b2.length;
        if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
      }
      return result;
    }

    boolean method2(byte[] blob1,byte[] blob2){
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
}
