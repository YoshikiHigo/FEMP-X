package unverified;

public class ClonePair2035 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(3 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
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
