package all;

public class ClonePair2656 {

    int method1(byte[] b){
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

    int method2(byte[] data){
      int number;
      number=0;
      for (int i=0; i < 4; ++i) {
        number|=(data[3 - i] & 0xff) << (i << 3);
      }
      return number;
    }
}
