package all;

public class ClonePair5848 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      if ((a.length < aOff + len) || (b.length < bOff + len))   return false;
      for (int i=0; i < len; i++) {
        if (a[i + aOff] != b[i + bOff])     return false;
      }
      return true;
    }

    boolean method2(byte[] left,int leftPos,byte[] right,int rightPos,int size){
      int i=leftPos, j=rightPos;
      if (leftPos + size > left.length)   return false;
      if (rightPos + size > right.length)   return false;
      while (size > 0) {
        if (left[i++] != right[j++])     return false;
        size--;
      }
      return true;
    }
}
