package unverified;

public class ClonePair5796 {

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

    boolean method2(byte[] a,int aOff,byte[] b,int bOff,int len){
      if ((a.length < aOff + len) || (b.length < bOff + len))   return false;
      for (int i=0; i < len; i++) {
        if (a[i + aOff] != b[i + bOff])     return false;
      }
      return true;
    }
}
