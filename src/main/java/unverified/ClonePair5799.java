package unverified;

public class ClonePair5799 {

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

    boolean method2(byte[] b1,int nOffset1,byte[] b2,int nOffset2,int nLength){
      if (nOffset1 + nLength > b1.length || nOffset2 + nLength > b2.length)   return false;
      for (int i=0; i < nLength; i++) {
        if (b1[nOffset1 + i] != b2[nOffset2 + i])     return false;
      }
      return true;
    }
}
