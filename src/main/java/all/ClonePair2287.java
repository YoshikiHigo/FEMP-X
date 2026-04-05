package all;

public class ClonePair2287 {

    boolean method1(byte[] first,byte[] second){
      boolean out=first != null && second != null && first.length == second.length;
      for (int i=0; out && i < first.length; i++) {
        if (first[i] != second[i]) {
          out=false;
        }
      }
      return out;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == null || b == null) {
        return false;
      }
      int aLength=a.length;
      if (aLength != b.length) {
        return false;
      }
      for (int i=0; i < aLength; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
