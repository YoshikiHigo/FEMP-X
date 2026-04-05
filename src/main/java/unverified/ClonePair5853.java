package unverified;

public class ClonePair5853 {

    boolean method1(byte[] a1,int offs1,byte[] a2,int offs2,int num){
      int index1=offs1;
      int index2=offs2;
      int count=num;
      while (count-- > 0) {
        if (a1[index1++] != a2[index2++]) {
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
