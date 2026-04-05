package all;

public class ClonePair2271 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
    }

    int method2(byte[] b){
      int a=0;
      for (int i=3; i >= 0; i--) {
        a+=(b[3 - i] & 0xFF) << (i * 8);
      }
      return a;
    }
}
