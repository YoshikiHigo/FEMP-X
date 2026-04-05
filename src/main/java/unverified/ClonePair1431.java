package unverified;

public class ClonePair1431 {

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

    boolean method2(byte[] a1,byte[] a2){
      if ((a1 == null) || (a2 == null)) {
        return a1 == a2;
      }
      int nLength=a1.length;
      if (nLength != a2.length) {
        return false;
      }
      for (int i=0; i < nLength; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
