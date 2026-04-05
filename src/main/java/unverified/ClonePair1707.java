package unverified;

public class ClonePair1707 {

    boolean method1(byte[] x,byte[] y){
      if (x == null || y == null)   return false;
      if (x.length != y.length)   return false;
      for (int i=0; i < x.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] a2){
      boolean equal=false;
      if (a == a2) {
        equal=true;
      }
     else   if (a == null && a2 == null) {
        equal=true;
      }
     else   if (a == null || a2 == null) {
        equal=false;
      }
     else   if (a.length != a2.length) {
        equal=false;
      }
     else {
        equal=true;
        for (int i=0; i < a.length; i++) {
          if (a[i] != a2[i]) {
            equal=false;
            break;
          }
        }
      }
      return equal;
    }
}
