package unverified;

public class ClonePair2593 {

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

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if (b1 == null || b2 == null) {
        return (b1 == b2);
      }
      if (b1.length != b2.length) {
        return false;
      }
      int result=0;
      for (int i=0; i < b1.length; i++) {
        result|=(b1[i] ^ b2[i]);
      }
      return (result == 0) ? true : false;
    }
}
