package unverified;

public class ClonePair5856 {

    boolean method1(byte[] left,int leftPos,byte[] right,int rightPos,int size){
      int i=leftPos, j=rightPos;
      if (leftPos + size > left.length)   return false;
      if (rightPos + size > right.length)   return false;
      while (size > 0) {
        if (left[i++] != right[j++])     return false;
        size--;
      }
      return true;
    }

    boolean method2(byte[] a,int aOffset,byte[] b,int bOffset,int length){
      if ((a.length < aOffset + length) || (b.length < bOffset + length)) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[aOffset + i] != b[bOffset + i]) {
          return false;
        }
      }
      return true;
    }
}
