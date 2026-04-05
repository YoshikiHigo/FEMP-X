package unverified;

public class ClonePair2047 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(3 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
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
