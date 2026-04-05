package all;

public class ClonePair2144 {

    int method1(byte[] ba){
      int ret=0;
      for (int i=0; i < 4; i++) {
        ret=ret << 8;
        ret|=ba[i] & 0xFF;
      }
      return ret;
    }

    int method2(byte[] bytes){
      int n=0;
      for (int i=0; i < 3; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[3] & 0xff);
    }
}
