package unverified;

public class ClonePair2286 {

    boolean method1(byte[] first,byte[] second){
      boolean out=first != null && second != null && first.length == second.length;
      for (int i=0; out && i < first.length; i++) {
        if (first[i] != second[i]) {
          out=false;
        }
      }
      return out;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null) {
        return false;
      }
      if (b1.length == b2.length) {
        int i=0;
        int j=0;
        int n=b1.length;
        while (n-- != 0) {
          if (b1[i++] != b2[j++]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
