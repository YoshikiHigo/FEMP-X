package all;

public class ClonePair2438 {

    int method1(byte[] byte_array_4){
      int ret=0;
      for (int i=0; i < 4; i++) {
        int b=(int)byte_array_4[i];
        if (i < 3 && b < 0) {
          b=256 + b;
        }
        ret+=b << (i * 8);
      }
      return ret;
    }

    int method2(byte[] array){
      int value=0;
      for (int i=0; i < 4; i++) {
        int b=array[i];
        b&=0xff;
        value|=(b << (i * 8));
      }
      return value;
    }
}
