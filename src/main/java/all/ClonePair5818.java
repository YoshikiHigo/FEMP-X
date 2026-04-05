package all;

public class ClonePair5818 {

    boolean method1(byte[] source,int sourceStart,byte[] target,int targetStart,int len){
      int sourceEnd=sourceStart + len;
      int delta=targetStart - sourceStart;
      for (int i=sourceStart; i < sourceEnd; i++) {
        if (source[i] != target[i + delta])     return false;
      }
      return true;
    }

    boolean method2(byte[] b1,int offset1,byte[] b2,int offset2,int length){
      for (int i=0; i < length; i++) {
        if (b1[i + offset1] != b2[i + offset2]) {
          return false;
        }
      }
      return true;
    }
}
