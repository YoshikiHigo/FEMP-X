package unverified;

public class ClonePair1260 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == b2)   return true;
      if (b1 == null || b2 == null)   return false;
      int length=b1.length;
      if (length != b2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(b1[index] == b2[index]))     return false;
      }
      return true;
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
