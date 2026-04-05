package unverified;

public class ClonePair7821 {

    int method1(byte[] bs,byte t,int offset){
      for (int i=offset; i < bs.length; i++) {
        byte b=bs[i];
        if (b == t) {
          return i;
        }
      }
      return -1;
    }

    int method2(byte[] ary,byte b,int start){
      for (int i=start; i < ary.length; i++) {
        if (b == ary[i]) {
          return i;
        }
      }
      return -1;
    }
}
