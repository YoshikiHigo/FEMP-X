package unverified;

public class ClonePair2813 {

    boolean method1(byte[] a,byte[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
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
