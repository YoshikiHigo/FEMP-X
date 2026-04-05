package all;

public class ClonePair5822 {

    boolean method1(byte[] a,int ofsA,byte[] b,int ofsB,int len){
      int end=ofsA + len;
      while (ofsA < end) {
        if (b[ofsB++] != a[ofsA++]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,int aOffset,byte[] b,int bOffset,int length){
      for (int i=0; i < length; i++)   if (a[aOffset + i] != b[bOffset + i])   return false;
      return true;
    }
}
