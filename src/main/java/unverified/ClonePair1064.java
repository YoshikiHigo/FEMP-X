package unverified;

public class ClonePair1064 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null || b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
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
