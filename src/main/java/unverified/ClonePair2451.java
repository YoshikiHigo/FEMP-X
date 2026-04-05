package unverified;

public class ClonePair2451 {

    int method1(byte[] bytes){
      int result=0;
      for (int i=0; i < 4; ++i) {
        result<<=8;
        result+=bytes[i] >= 0 ? bytes[i] : (int)256 + bytes[i];
      }
      return result;
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
