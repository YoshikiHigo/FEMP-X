package all;

public class ClonePair5802 {

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

    boolean method2(byte[] a,int i,byte[] b,int j,int n){
      if (a.length < i + n || b.length < j + n)   return false;
      while (--n >= 0)   if (a[i++] != b[j++])   return false;
      return true;
    }
}
