package all;

public class ClonePair5807 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      for (int i=0; i < len; ++i)   if (a[aOff + i] != b[bOff + i])   return false;
      return true;
    }

    boolean method2(byte[] a1,int offs1,byte[] a2,int offs2,int num){
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
}
