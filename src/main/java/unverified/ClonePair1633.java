package unverified;

public class ClonePair1633 {

    boolean method1(byte[] a,byte[] b){
      if (null == a)   return (null == b);
     else   if (null == b)   return false;
     else   if (a.length == b.length) {
        for (int cc=0, count=a.length; cc < count; cc++) {
          if (a[cc] != b[cc])       return false;
        }
        return true;
      }
     else   return false;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == b) {
        return true;
      }
      if (a != null && b != null && a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
