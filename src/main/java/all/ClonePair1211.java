package all;

public class ClonePair1211 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 != null) {
        if (b2 != null) {
          if (b1.length == b2.length) {
            boolean flag=true;
            for (int i=0; i < b1.length; i++) {
              if (b1[i] != b2[i]) {
                flag=false;
                break;
              }
            }
            return flag;
          }
     else {
            return false;
          }
        }
     else {
          return false;
        }
      }
     else {
        if (b2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
    }

    boolean method2(byte[] from,byte[] to){
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
}
