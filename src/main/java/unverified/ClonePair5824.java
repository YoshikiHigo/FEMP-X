package unverified;

public class ClonePair5824 {

    boolean method1(byte[] a,int ofsA,byte[] b,int ofsB,int len){
      int end=ofsA + len;
      while (ofsA < end) {
        if (b[ofsB++] != a[ofsA++]) {
          return false;
        }
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
