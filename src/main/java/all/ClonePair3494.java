package all;

public class ClonePair3494 {

    boolean method1(int[] a,int aOffset,int[] b,int bOffset,int length){
      for (int i=0; i < length; i++)   if (a[aOffset + i] != b[bOffset + i])   return false;
      return true;
    }

    boolean method2(int[] source,int sourceStart,int[] target,int targetStart,int len){
      int sourceEnd=sourceStart + len;
      int delta=targetStart - sourceStart;
      for (int i=sourceStart; i < sourceEnd; i++) {
        if (source[i] != target[i + delta])     return false;
      }
      return true;
    }
}
