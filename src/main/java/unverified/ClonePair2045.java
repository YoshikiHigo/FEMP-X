package unverified;

public class ClonePair2045 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(3 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
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
