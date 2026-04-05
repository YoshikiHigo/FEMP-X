package all;

public class ClonePair7823 {

    int method1(byte[] bs,byte t,int offset){
      for (int i=offset; i < bs.length; i++) {
        byte b=bs[i];
        if (b == t) {
          return i;
        }
      }
      return -1;
    }

    int method2(byte[] ar,byte b,int from){
      for (int i=from; i < ar.length; i++) {
        if (ar[i] == b)     return i;
      }
      return -1;
    }
}
