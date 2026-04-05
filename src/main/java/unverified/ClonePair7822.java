package unverified;

public class ClonePair7822 {

    int method1(byte[] bs,byte t,int offset){
      for (int i=offset; i < bs.length; i++) {
        byte b=bs[i];
        if (b == t) {
          return i;
        }
      }
      return -1;
    }

    int method2(byte[] bytes,byte c,int off){
      for (int i=off; i < bytes.length; i++) {
        if (bytes[i] == c) {
          return i;
        }
     else     if (bytes[i] == 0x29) {
          return -1;
        }
      }
      return -1;
    }
}
