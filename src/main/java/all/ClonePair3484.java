package all;

public class ClonePair3484 {

    boolean method1(short[] a,short[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
      return true;
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
