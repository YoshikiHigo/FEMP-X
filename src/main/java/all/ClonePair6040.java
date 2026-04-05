package all;

public class ClonePair6040 {

    boolean method1(Object[] a,Object[] b){
      if (a == null) {
        return (b == null);
      }
     else {
        if (b == null) {
          return false;
        }
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] == null) {
          if (b[i] != null) {
            return false;
          }
          continue;
        }
     else {
          if (b[i] == null) {
            return false;
          }
        }
        if (!a[i].equals(b[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Object[] a,Object[] b){
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
        if (a[i] == null ? b[i] != null : !a[i].equals(b[i])) {
          return false;
        }
      }
      return true;
    }
}
