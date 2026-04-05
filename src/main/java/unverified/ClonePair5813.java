package unverified;

public class ClonePair5813 {

    boolean method1(byte[] source,int sourceStart,byte[] target,int targetStart,int len){
      int sourceEnd=sourceStart + len;
      int delta=targetStart - sourceStart;
      for (int i=sourceStart; i < sourceEnd; i++) {
        if (source[i] != target[i + delta])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,int ofsA,byte[] b,int ofsB,int len){
      int end=ofsA + len;
      while (ofsA < end) {
        if (b[ofsB++] != a[ofsA++]) {
          return false;
        }
      }
      return true;
    }
}
