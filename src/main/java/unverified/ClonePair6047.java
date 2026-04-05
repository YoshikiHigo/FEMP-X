package unverified;

public class ClonePair6047 {

    boolean method1(Object[] a,Object[] b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      int len=a.length;
      if (len != b.length)   return false;
      for (int i=0; i < len; ++i) {
        if (a[i] == null) {
          if (b[i] != null)       return false;
        }
     else {
          if (!a[i].equals(b[i]))       return false;
        }
      }
      return true;
    }

    boolean method2(Object[] a,Object[] a2){
      if (a == a2) {
        return true;
      }
      if (a == null || a2 == null) {
        return false;
      }
      int length=a.length;
      if (a2.length != length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
