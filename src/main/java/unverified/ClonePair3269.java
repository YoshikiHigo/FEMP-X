package unverified;

public class ClonePair3269 {

    boolean method1(int[] a1,int[] a2){
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

    boolean method2(int[] int1,int[] int2){
      if (int1 == null && int2 == null) {
        return true;
      }
     else   if (int1 == null || int2 == null) {
        return false;
      }
      if (int1.length != int2.length) {
        return false;
      }
      for (int i=0; i < int1.length; i++) {
        if (int1[i] != int2[i]) {
          return false;
        }
      }
      return true;
    }
}
