package unverified;

public class ClonePair2337 {

    int method1(byte[] bytes){
      int n=0;
      for (int i=0; i < 3; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[3] & 0xff);
    }

    int method2(byte[] b){
      int bla=0;
      int blu=0;
      int mal=1;
      for (int i=3; i >= 0; i--) {
        blu=b[i];
        if (blu < 0)     blu=256 + blu;
        bla+=blu * mal;
        mal*=256;
      }
      return bla;
    }
}
