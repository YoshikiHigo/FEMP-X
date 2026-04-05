package all;

public class ClonePair8076 {

    byte[][] method1(byte[] src,int n){
      byte[] l;
      byte[] r;
      if (src.length <= n) {
        l=src;
        r=new byte[0];
      }
     else {
        l=new byte[n];
        r=new byte[src.length - n];
        System.arraycopy(src,0,l,0,n);
        System.arraycopy(src,n,r,0,r.length);
      }
      byte[][] lr={l,r};
      return lr;
    }

    byte[][] method2(byte[] src,int n){
      byte[] l, r;
      if (src.length <= n) {
        l=src;
        r=new byte[0];
      }
     else {
        l=new byte[n];
        r=new byte[src.length - n];
        System.arraycopy(src,0,l,0,n);
        System.arraycopy(src,n,r,0,r.length);
      }
      byte[][] lr={l,r};
      return lr;
    }
}
