package unverified;

public class ClonePair2250 {

    boolean method1(byte[] ba1,byte[] ba2){
      if (ba1 == null && ba2 == null)   return true;
      if (ba1 == null || ba2 == null)   return false;
      if (ba1.length != ba2.length)   return false;
      for (int i=0; i < ba1.length; ++i) {
        if (ba1[i] != ba2[i])     return false;
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
