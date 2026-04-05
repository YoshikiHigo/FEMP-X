package unverified;

public class ClonePair2275 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
    }

    int method2(byte[] b){
      int mask=0xff;
      int temp=0;
      int n=0;
      for (int i=0; i < 4; i++) {
        n<<=8;
        temp=b[i] & mask;
        n|=temp;
      }
      return n;
    }
}
