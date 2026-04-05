package unverified;

public class ClonePair1417 {

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

    boolean method2(byte[] a,byte[] b){
      if (a == null) {
        return b == null;
      }
      if (b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=a.length - 1; i >= 0; i--) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
