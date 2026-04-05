package all;

public class ClonePair2161 {

    int method1(byte[] ba){
      int ret=0;
      for (int i=0; i < 4; i++) {
        ret=ret << 8;
        ret|=ba[i] & 0xFF;
      }
      return ret;
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
