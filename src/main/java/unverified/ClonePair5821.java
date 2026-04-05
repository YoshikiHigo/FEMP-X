package unverified;

public class ClonePair5821 {

    boolean method1(byte[] source,int sourceStart,byte[] target,int targetStart,int len){
      int sourceEnd=sourceStart + len;
      int delta=targetStart - sourceStart;
      for (int i=sourceStart; i < sourceEnd; i++) {
        if (source[i] != target[i + delta])     return false;
      }
      return true;
    }

    boolean method2(byte[] key1,int off1,byte[] key2,int off2,int len){
      for (int i=0; i < len; i++) {
        if (key1[i + off1] != key2[i + off2])     return false;
      }
      return true;
    }
}
