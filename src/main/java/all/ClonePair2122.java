package all;

public class ClonePair2122 {

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

    boolean method2(byte[] a,byte[] b){
      if (a == b) {
        return true;
      }
      if (a == null || b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      int nonEqual=0;
      for (int i=0; i != a.length; i++) {
        nonEqual|=(a[i] ^ b[i]);
      }
      return nonEqual == 0;
    }
}
