package unverified;

public class ClonePair2440 {

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

    int method2(byte[] bytes){
      int value=0;
      for (int i=0; i < 4; i++) {
        int x=(bytes[i] << i * 8) & (0xFF << i * 8);
        value+=x;
      }
      return value;
    }
}
