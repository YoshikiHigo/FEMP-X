package unverified;

public class ClonePair3367 {

    boolean method1(int[] a1,int[] a2){
      if (a1 == a2) {
        return true;
      }
     else   if (a1 == null || a2 == null) {
        return false;
      }
     else   if (a1.length != a2.length) {
        return false;
      }
     else {
        for (int i=0; i < a1.length; i++) {
          if (a1[i] != a2[i]) {
            return false;
          }
        }
        return true;
      }
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
