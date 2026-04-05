package unverified;

public class ClonePair2601 {

    int method1(byte[] array){
      int value=0;
      for (int i=0; i < 4; i++) {
        int b=array[i];
        b&=0xff;
        value|=(b << (i * 8));
      }
      return value;
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
