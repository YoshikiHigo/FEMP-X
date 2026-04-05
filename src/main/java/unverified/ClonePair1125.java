package unverified;

public class ClonePair1125 {

    boolean method1(byte[] a1,byte[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(byte[] a,byte[] b){
      if ((a == null) && (b == null)) {
        return true;
      }
      if ((a == null) && (b != null)) {
        return false;
      }
      if ((a != null) && (b == null)) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
