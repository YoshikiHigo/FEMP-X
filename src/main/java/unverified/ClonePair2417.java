package unverified;

public class ClonePair2417 {

    int method1(byte[] intByte){
      int fromByte=0;
      for (int i=0; i < 4; i++) {
        int n=(intByte[i] < 0 ? (int)intByte[i] + 256 : (int)intByte[i]) << (8 * i);
        System.out.println(n);
        fromByte+=n;
      }
      return fromByte;
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
