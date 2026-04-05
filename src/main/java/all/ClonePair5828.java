package all;

public class ClonePair5828 {

    boolean method1(byte[] a,int aOffset,byte[] b,int bOffset,int length){
      for (int i=0; i < length; i++)   if (a[aOffset + i] != b[bOffset + i])   return false;
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
