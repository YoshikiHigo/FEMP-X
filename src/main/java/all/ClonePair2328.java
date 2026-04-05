package all;

public class ClonePair2328 {

    int method1(byte[] bytes){
      int n=0;
      for (int i=0; i < 3; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[3] & 0xff);
    }

    int method2(byte[] bytes){
      int result=0;
      for (int i=0; i < 4; ++i) {
        result<<=8;
        result+=bytes[i] >= 0 ? bytes[i] : (int)256 + bytes[i];
      }
      return result;
    }
}
