package unverified;

public class ClonePair3393 {

    boolean method1(int[] int1,int[] int2){
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

    boolean method2(int[] a,int[] b){
      if (a == b) {
        return true;
      }
      if (a == null || b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
