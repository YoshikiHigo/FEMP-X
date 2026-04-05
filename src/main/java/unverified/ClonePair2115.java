package unverified;

public class ClonePair2115 {

    boolean method1(byte[] a,byte[] b){
      if (null == a) {
        if (null == b)     return true;
     else     return false;
      }
     else   if (null == b)   return false;
     else {
        if (a.length == b.length) {
          for (int cc=0, count=a.length; cc < count; cc++) {
            if (a[cc] != b[cc])         return false;
          }
          return true;
        }
     else     return false;
      }
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
