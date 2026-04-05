package unverified;

public class ClonePair2162 {

    int method1(byte[] ba){
      int ret=0;
      for (int i=0; i < 4; i++) {
        ret=ret << 8;
        ret|=ba[i] & 0xFF;
      }
      return ret;
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
