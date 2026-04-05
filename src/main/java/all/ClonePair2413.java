package all;

public class ClonePair2413 {

    int method1(byte[] intByte){
      int fromByte=0;
      for (int i=0; i < 4; i++) {
        int n=(intByte[i] < 0 ? (int)intByte[i] + 256 : (int)intByte[i]) << (8 * i);
        System.out.println(n);
        fromByte+=n;
      }
      return fromByte;
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
