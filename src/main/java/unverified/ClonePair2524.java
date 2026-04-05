package unverified;

public class ClonePair2524 {

    int method1(byte[] bytes){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=i * 8;
        value|=(bytes[i] & 0xFF) << shift;
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
