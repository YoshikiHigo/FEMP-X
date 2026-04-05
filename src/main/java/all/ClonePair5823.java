package all;

public class ClonePair5823 {

    boolean method1(byte[] a,int ofsA,byte[] b,int ofsB,int len){
      int end=ofsA + len;
      while (ofsA < end) {
        if (b[ofsB++] != a[ofsA++]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a1,int offs1,byte[] a2,int offs2,int num){
      while (num-- > 0) {
        if (a1[offs1++] != a2[offs2++]) {
          return false;
        }
      }
      return true;
    }
}
