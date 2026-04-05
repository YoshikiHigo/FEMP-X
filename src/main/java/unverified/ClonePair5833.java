package unverified;

public class ClonePair5833 {

    boolean method1(byte[] buf1,int off1,byte[] buf2,int off2,int len){
      if ((off1 + len > buf1.length) || (off2 + len > buf2.length)) {
        return (false);
      }
      for (int i=0; i < len; i++) {
        if (buf1[off1 + i] != buf2[off2 + i]) {
          return (false);
        }
      }
      return (true);
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
