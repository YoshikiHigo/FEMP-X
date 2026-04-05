package all;

public class ClonePair5800 {

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
