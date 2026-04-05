package all;

public class ClonePair3477 {

    boolean method1(short[] a1,short[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(short[] pOne,short[] pTwo){
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
}
