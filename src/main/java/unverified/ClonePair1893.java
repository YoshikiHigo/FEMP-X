package unverified;

public class ClonePair1893 {

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

    boolean method2(byte[] first,byte[] second){
      boolean out=first != null && second != null && first.length == second.length;
      for (int i=0; out && i < first.length; i++) {
        if (first[i] != second[i]) {
          out=false;
        }
      }
      return out;
    }
}
