package all;

public class ClonePair2101 {

    int method1(byte[] b){
      int mask=0xff;
      int temp=0;
      int n=0;
      for (int i=3; i >= 0; i--) {
        n<<=8;
        temp=b[i] & mask;
        n|=temp;
      }
      return n;
    }

    int method2(byte[] intByte){
      int fromByte=0;
      for (int i=0; i < 4; i++) {
        int n=(intByte[i] < 0 ? (int)intByte[i] + 256 : (int)intByte[i]) << (8 * i);
        System.out.println(n);
        fromByte+=n;
      }
      return fromByte;
    }
}
