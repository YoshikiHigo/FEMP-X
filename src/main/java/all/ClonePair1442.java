package all;

public class ClonePair1442 {

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

    boolean method2(byte[] array1,byte[] array2){
      if (array1 == null || array1.length == 0) {
        return array2 == null || array2.length == 0;
      }
      if (array2 == null || array1.length != array2.length) {
        return false;
      }
      for (int i=array1.length - 1; i >= 0; i--) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
