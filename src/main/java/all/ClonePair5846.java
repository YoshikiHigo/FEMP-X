package all;

public class ClonePair5846 {

    boolean method1(byte[] a1,int offs1,byte[] a2,int offs2,int num){
      while (num-- > 0) {
        if (a1[offs1++] != a2[offs2++]) {
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
