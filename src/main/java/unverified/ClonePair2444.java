package unverified;

public class ClonePair2444 {

    int method1(byte[] bytes){
      int result=0;
      for (int i=0; i < 4; ++i) {
        result<<=8;
        result+=bytes[i] >= 0 ? bytes[i] : (int)256 + bytes[i];
      }
      return result;
    }

    int method2(byte[] b){
      int a=0;
      for (int i=3; i >= 0; i--) {
        a+=(b[3 - i] & 0xFF) << (i * 8);
      }
      return a;
    }
}
