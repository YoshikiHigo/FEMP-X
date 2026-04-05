package unverified;

public class ClonePair2586 {

    boolean method1(byte[] seqa,byte[] seqb){
      if ((seqa == null) && (seqb == null)) {
        return true;
      }
      if ((seqa == null) || (seqb == null) || (seqa.length != seqb.length)) {
        return false;
      }
      for (int i=0; i < seqa.length; i++) {
        if (seqa[i] != seqb[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a1,byte[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }
}
