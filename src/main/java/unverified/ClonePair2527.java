package unverified;

public class ClonePair2527 {

    boolean method1(byte[] bytes1,byte[] bytes2){
      if (bytes1 == null && bytes2 == null) {
        return true;
      }
     else   if (bytes1 == null || bytes2 == null) {
        return false;
      }
      if (bytes1.length != bytes2.length) {
        return false;
      }
      for (int i=0; i < bytes1.length; i++) {
        if (bytes1[i] != bytes2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] seqa,byte[] seqb){
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
}
