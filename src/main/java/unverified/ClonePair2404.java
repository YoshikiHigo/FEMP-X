package unverified;

public class ClonePair2404 {

    int method1(byte[] intByte){
      int fromByte=0;
      for (int i=0; i < 4; i++) {
        int n=(intByte[i] < 0 ? (int)intByte[i] + 256 : (int)intByte[i]) << (8 * i);
        System.out.println(n);
        fromByte+=n;
      }
      return fromByte;
    }

    int method2(byte[] byte_array_4){
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
}
