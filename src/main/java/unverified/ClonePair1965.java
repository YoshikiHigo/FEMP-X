package unverified;

public class ClonePair1965 {

    boolean method1(byte[] blob1,byte[] blob2){
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

    boolean method2(byte[] val1,byte[] val2){
      boolean more;
      int i;
      if (val1 == null && val2 == null) {
        return true;
      }
      more=val1 != null && val2 != null && val1.length == val2.length;
      for (i=0; more && i < val1.length; i++) {
        more=val1[i] == val2[i];
      }
      return more;
    }
}
