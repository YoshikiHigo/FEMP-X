package unverified;

public class ClonePair3491 {

    boolean method1(short[] pOne,short[] pTwo){
      boolean ret=false;
      if (pOne == null && pTwo == null) {
        ret=true;
      }
     else   if (pOne == null || pTwo == null) {
        ret=false;
      }
     else {
        ret=(pOne.length == pTwo.length);
        if (ret) {
          for (int i=0; i < pOne.length; i++) {
            if (pOne[i] != pTwo[i]) {
              ret=false;
              break;
            }
          }
        }
      }
      return ret;
    }

    boolean method2(short[] a,short[] b){
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
