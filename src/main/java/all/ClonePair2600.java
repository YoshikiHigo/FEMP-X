package all;

public class ClonePair2600 {

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

    boolean method2(byte[] val1,byte[] val2){
      boolean more;
      int i;
      if (val1 == null && val2 == null) {
        return true;
      }
      more=val1 != null && val2 != null && val1.length == val2.length;
      for (i=0; more && i < val1.length; i++) {
        more=val1[i] == val2[i];
      }
      return more;
    }
}
