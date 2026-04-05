package all;

public class ClonePair2603 {

    int method1(byte[] array){
      int value=0;
      for (int i=0; i < 4; i++) {
        int b=array[i];
        b&=0xff;
        value|=(b << (i * 8));
      }
      return value;
    }

    int method2(byte[] b){
      int s=0;
      for (int i=0; i < 3; i++) {
        if (b[3 - i] >= 0) {
          s=s + b[3 - i];
        }
     else {
          s=s + 256 + b[3 - i];
        }
        s=s * 256;
      }
      if (b[0] >= 0) {
        s=s + b[0];
      }
     else {
        s=s + 256 + b[0];
      }
      return s;
    }
}
