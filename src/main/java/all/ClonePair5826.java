package all;

public class ClonePair5826 {

    boolean method1(byte[] a,int ofsA,byte[] b,int ofsB,int len){
      int end=ofsA + len;
      while (ofsA < end) {
        if (b[ofsB++] != a[ofsA++]) {
          return false;
        }
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
