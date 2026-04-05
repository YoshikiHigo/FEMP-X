package unverified;

public class ClonePair2332 {

    int method1(byte[] bytes){
      int n=0;
      for (int i=0; i < 3; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[3] & 0xff);
    }

    int method2(byte[] b){
      int a=0;
      for (int i=3; i >= 0; i--) {
        a+=(b[3 - i] & 0xFF) << (i * 8);
      }
      return a;
    }
}
