package unverified;

public class ClonePair2420 {

    int method1(byte[] intByte){
      int fromByte=0;
      for (int i=0; i < 4; i++) {
        int n=(intByte[i] < 0 ? (int)intByte[i] + 256 : (int)intByte[i]) << (8 * i);
        System.out.println(n);
        fromByte+=n;
      }
      return fromByte;
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
