package unverified;

public class ClonePair1437 {

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

    boolean method2(byte[] lhs,byte[] rhs){
      if (lhs == null && rhs != null || lhs != null && rhs == null) {
        return false;
      }
      if (lhs == rhs) {
        return true;
      }
      if (lhs.length != rhs.length) {
        return false;
      }
      for (int i=0; i < lhs.length; i++) {
        if (lhs[i] != rhs[i]) {
          return false;
        }
      }
      return true;
    }
}
