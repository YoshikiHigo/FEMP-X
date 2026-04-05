package all;

public class ClonePair5855 {

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

    boolean method2(byte[] b1,int nOffset1,byte[] b2,int nOffset2,int nLength){
      if (nOffset1 + nLength > b1.length || nOffset2 + nLength > b2.length)   return false;
      for (int i=0; i < nLength; i++) {
        if (b1[nOffset1 + i] != b2[nOffset2 + i])     return false;
      }
      return true;
    }
}
