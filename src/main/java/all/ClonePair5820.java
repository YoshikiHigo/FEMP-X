package all;

public class ClonePair5820 {

    boolean method1(byte[] source,int sourceStart,byte[] target,int targetStart,int len){
      int sourceEnd=sourceStart + len;
      int delta=targetStart - sourceStart;
      for (int i=sourceStart; i < sourceEnd; i++) {
        if (source[i] != target[i + delta])     return false;
      }
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
