package all;

public class ClonePair7830 {

    int method1(byte[] bytes,byte c,int off){
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

    int method2(byte[] ary,byte b,int start){
      for (int i=start; i < ary.length; i++) {
        if (b == ary[i]) {
          return i;
        }
      }
      return -1;
    }
}
