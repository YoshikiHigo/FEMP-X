package unverified;

public class ClonePair1440 {

    boolean method1(byte[] from,byte[] to){
      if ((from == null) && (to == null)) {
        return true;
      }
      if ((from == null) || (to == null)) {
        return false;
      }
      int i;
      int fromlen=from.length;
      int tolen=to.length;
      if (fromlen != tolen) {
        return false;
      }
      for (i=0; i < fromlen; i++) {
        if (from[i] != to[i]) {
          return false;
        }
      }
      return true;
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
