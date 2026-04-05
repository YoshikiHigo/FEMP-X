package unverified;

public class ClonePair2156 {

    int method1(byte[] ba){
      int ret=0;
      for (int i=0; i < 4; i++) {
        ret=ret << 8;
        ret|=ba[i] & 0xFF;
      }
      return ret;
    }

    int method2(byte[] b){
      int a=0;
      for (int i=3; i >= 0; i--) {
        a+=(b[3 - i] & 0xFF) << (i * 8);
      }
      return a;
    }
}
