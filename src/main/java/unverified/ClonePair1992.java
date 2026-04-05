package unverified;

public class ClonePair1992 {

    boolean method1(byte[] a,byte[] b){
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

    boolean method2(byte[] lhs,byte[] rhs){
      if (lhs == null && rhs != null || lhs != null && rhs == null) {
        return false;
      }
      if (lhs == rhs) {
        return true;
      }
      if (lhs.length != rhs.length) {
        return false;
      }
      for (int i=0; i < lhs.length; i++) {
        if (lhs[i] != rhs[i]) {
          return false;
        }
      }
      return true;
    }
}
