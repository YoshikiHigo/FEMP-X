package unverified;

public class ClonePair3545 {

    boolean method1(int[] a,int[] b){
      if (a == null) {
        if (b != null) {
          return false;
        }
      }
     else {
        if (b == null) {
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
      }
      return true;
    }

    boolean method2(int[] a,int[] b){
      if (a == null) {
        return b == null;
      }
      if (b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=a.length - 1; i >= 0; i--) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
