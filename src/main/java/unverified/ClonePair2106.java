package unverified;

public class ClonePair2106 {

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

    int method2(byte[] bytes){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=i * 8;
        value|=(bytes[i] & 0xFF) << shift;
      }
      return value;
    }
}
