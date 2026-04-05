package unverified;

public class ClonePair3492 {

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

    boolean method2(short[] a1,short[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }
}
