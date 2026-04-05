package unverified;

public class ClonePair2202 {

    boolean method1(byte[] data1,byte[] data2){
      if (data1 == data2)   return true;
      if (data1 == null || data2 == null)   return false;
      if (data1.length != data2.length)   return false;
      for (int i=0; i < data1.length; i++) {
        if (data1[i] != data2[i])     return false;
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
