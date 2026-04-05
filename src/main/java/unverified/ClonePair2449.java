package unverified;

public class ClonePair2449 {

    int method1(byte[] bytes){
      int result=0;
      for (int i=0; i < 4; ++i) {
        result<<=8;
        result+=bytes[i] >= 0 ? bytes[i] : (int)256 + bytes[i];
      }
      return result;
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
