package unverified;

public class ClonePair6197 {

    boolean method1(boolean[] boolean1,boolean[] boolean2){
      if (boolean1.length != boolean2.length) {
        return false;
      }
      for (int i=0; i < boolean1.length; i++) {
        if (boolean1[i] != boolean2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(boolean[] a,boolean[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
