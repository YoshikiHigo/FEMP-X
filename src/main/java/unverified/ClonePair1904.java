package unverified;

public class ClonePair1904 {

    boolean method1(byte[] a,byte[] b){
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

    boolean method2(byte[] a1,byte[] a2){
      if ((a1 == null) || (a2 == null)) {
        return a1 == a2;
      }
      int nLength=a1.length;
      if (nLength != a2.length) {
        return false;
      }
      for (int i=0; i < nLength; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
