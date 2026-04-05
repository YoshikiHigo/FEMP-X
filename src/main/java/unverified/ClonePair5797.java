package unverified;

public class ClonePair5797 {

    boolean method1(byte[] xbs,int xoff,byte[] ybs,int yoff,int len){
      if (xbs.length - xoff < len || ybs.length - yoff < len) {
        return false;
      }
      for (int i=0; i < len; i++) {
        if (xbs[xoff + i] != ybs[yoff + i]) {
          return false;
        }
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
