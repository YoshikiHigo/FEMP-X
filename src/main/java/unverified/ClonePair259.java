package unverified;

public class ClonePair259 {

    boolean method1(byte[] a,byte[] b){
      int alength=(a == null) ? 0 : a.length;
      int blength=(b == null) ? 0 : b.length;
      if (alength != blength) {
        return false;
      }
      for (int i=0; i < alength; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
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
}
